import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Account{
    public static float sum;
    public static String name;
    public static Scanner in;

    public Account(String name, float sum, Scanner in){
        this.name = name;
        this.sum = sum;
        this.in = in;
    }

    public static void viewAccount(){
        System.out.println("$"+ sum);
    }
    
    public static void depositAccount(){
        System.out.println("How much do you want to deposit into your account?");
        float deposit = in.nextFloat();
        sum = add(sum, deposit);
        System.out.println("You now have $" + sum + "in your account.");
    }

    public static void withdrawAccount(){
        System.out.println("How much do you want to withdraw from your account?");
        float withdraw = in.nextFloat();
        sum = subtract(sum, withdraw);
        System.out.println("You now have $" + sum + "in your account.");
    }

    /**
    * param x is a float
    * param y is a float
     */
    public static float add(float x, float y){
        return x+y;
    }

    public static float subtract(float x, float y){
        return x-y;
    }
}


class Menu implements ActionListener{
    JFrame f = new JFrame("Welcome to JCWBanking");
    Account account = new Account("Jaclyn", 0, new Scanner(System.in));

    JButton view = new JButton("View Account");

    JButton deposit = new JButton("Deposit");
    JButton withdraw = new JButton("Withdraw");
    JButton exit = new JButton("Exit");
    
    Menu(){
        prepareMenu();
    }

    public void prepareMenu(){
        view.setBounds(130,60,100,40);
        deposit.setBounds(130,100,100,40);
        withdraw.setBounds(130,140,100,40);
        exit.setBounds(130, 180, 100, 40);

        f.add(view);
        f.add(deposit);
        f.add(withdraw);
        f.add(exit);

        view.addActionListener(this);
        //deposit.addActionListener(this);
        //withdraw.addActionListener(this);
        //exit.addActionListener(this);
        
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void ActionPerformed(ActionEvent e){
        f.getContentPane().setBackground(Color.pink);

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
        new Menu();
        /** 
        System.out.println("Welcome to JCWBanking!");

        Account account = new Account("Jaclyn", 0, new Scanner(System.in));

        //Scanner in = new Scanner(System.in);
        boolean keep_going = true;

        while (keep_going){
            menu();
            //need to do a catch to make sure it is an integer
            int choice = account.in.nextInt();
            System.out.println("You choose option " + choice);

            if (choice == 0){
                keep_going = false;
                System.out.println("Goodbye!");
            }
            if (choice == 1){
                account.viewAccount();
            }
            else if (choice == 2){
                account.depositAccount();
            }
            else if (choice == 3){
                account.withdrawAccount();
            }
            else{
                System.out.println("This is not a recognized option");
                continue;

            }
            System.out.println("Do you with to continue?[Y/N]");
            String answer = account.in.next();
            if (answer.equals("N")){
                keep_going = false;
                System.out.println("Goodbye!");
            }
        }*/

    }
}
