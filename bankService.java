package bankProject;
import java.util.Scanner;
abstract class Bank1{
    public String name = "myBank";
    public String IFSC = "myBank123";

    public void bankDetails(){
        System.out.println("Bank Name : "+name +"Bank IFSC No : "+IFSC);
    }
    abstract void deposite();
    abstract void withdraw();
    abstract void checkBalance();
}
public class bankService extends Bank1 {
    private double bal = 5000.0;
    private int pwd;
    public int money;

    public void deposite(){
        System.out.println("Enter the password: ");
        Scanner sc = new Scanner(System.in);
        pwd = sc.nextInt();
        

        if(pwd==123){
            System.out.println("Enter the deposite money: ");
            money = sc.nextInt();
            bal=bal+money;
            System.out.println("Deposite money : "+money);
            System.out.println("Total Balance : "+bal);
        }
        else{
            System.out.println("Invalid Password...");
        }
        sc.close();
    }

    public void withdraw(){
        System.out.println("Enter the password: ");
        Scanner sc = new Scanner(System.in);
        pwd = sc.nextInt();
        if(pwd==123){
            System.out.println("Enter the amount: ");
            money = sc.nextInt();
            bal = bal - money;
            System.out.println("Withdraw Money : "+money);
            System.out.println("Total Balance : "+bal);
        }
        else{
            System.out.println("Invalide Password....");
        }
        sc.close();
    }

    public void checkBalance(){
        System.out.println("Enter the password: ");
        Scanner sc = new Scanner(System.in);
        pwd = sc.nextInt();

        if(pwd==123){
            System.out.println("Total Balance : "+bal);
        }
        else{
            System.out.println("Invalide Password....");
        }

        sc.close();
    }
}

class customer{
    public static void main(String[] args) {
        bankService ref = new bankService();
        ref.bankDetails();

        int choise;
        System.out.println("1. Deposite :");
        System.out.println("2. Withdraw :");
        System.out.println("3. CheckBalance :");

        System.out.println("Enter Your Choise :");
        Scanner sc = new Scanner(System.in);
        choise = sc.nextInt();

        switch(choise){
            case 1: ref.deposite();
            break;
            case 2: ref.withdraw();
            break;
            case 3: ref.checkBalance();
            break;
            default : System.out.println("Invalide Choise ....");

        }
        sc.close();
    }
}
