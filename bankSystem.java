import java.util.Scanner;

public class bankSystem {
    private double amount = 5000.00;
    private int pwd;
    Scanner sc = new Scanner(System.in);

    public void Deposit(){
        System.out.print("How much are you want deposite : ");

        int dep = sc.nextInt();
        amount = amount+dep;
        System.out.println("Deposite money is : "+dep);
        System.out.println("Total Balance : "+amount);
    }
    public void Withdraw(){
        System.out.println("Enter the password : ");
        pwd = sc.nextInt();
        if(pwd==123){
            System.out.println("Enter the amount :");
            int with = sc.nextInt();
            if(amount>=with){
                System.out.println("Successfully Withdraw "+with);
                amount=amount-with;
                System.out.println("Available Banlance is : "+amount);

            }
            else{
                System.out.println("Amount is not much in your account...");
            }
        }
        else{
            System.out.println("Incorect Password ....");
        }

    }

    public void checkBalance(){
        System.out.println("Enter your password : ");
        pwd = sc.nextInt();
        if(pwd==123){
            System.out.println("Available is : "+amount);
        }
        else{
            System.out.println("Incorrect Password....");
        }
    }
}

class Bank{
    public static void main(String[] args) {
        bankSystem ref = new bankSystem();
        System.out.println("Enter Your Coise");
        Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();

        switch(choise){
            case 1: ref.Deposit();
                break;
            case 2: ref.Withdraw();
                break;
            case 3: ref.checkBalance();
                break;
            default : System.out.println("Invalid Coise ...");
        }

    }
}
