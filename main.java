import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Account{
    public float sum;
    public String name;

    public Account(String name, float sum){
        this.name = name;
        this.sum = sum;
    }
}


class main{
    public static void menu(){
        System.out.println("Choose one of the following options:");
        System.out.println("0 to exit");
        System.out.println("1 to view funds");
        System.out.println("2 to deposit");
        System.out.println("3 to withdraw");
    }

    public static void main(String[] args){
        System.out.println("Welcome to JCWBanking!");

        Account account = new Account("Jaclyn", 0);

        Scanner in = new Scanner(System.in);
        boolean keep_going = true;

        while (keep_going){
            menu();
            //need to do a catch to make sure it is an integer
            int choice = in.nextInt();
            System.out.println("You choose option " + choice);

            if (choice == 0){
                keep_going = false;
                System.out.println("Goodbye!");
            }
            if (choice == 1){
                System.out.println("$"+ account.sum);
            }
            else if (choice == 2){
                System.out.println("How much do you want to deposit into your account?");
                float deposit = in.nextFloat();
                account.sum = account.sum + deposit;
                System.out.println("You now have $" + account.sum + "in your account.");
            }
            else if (choice == 3){
                System.out.println("How much do you want to withdraw from your account?");
                float withdraw = in.nextFloat();
                account.sum = account.sum - withdraw;
                System.out.println("You now have $" + account.sum + "in your account.");
            }
            else{
                System.out.println("This is not a recognized option");
                continue;

            }
            System.out.println("Do you with to continue?[Y/N]");
            String answer = in.next();
            if (answer.equals("N")){
                keep_going = false;
                System.out.println("Goodbye!");
            }
        }

    }
}