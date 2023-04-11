import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class main{
    public static void main(String[] args){
        System.out.println("Welcome to JCWBanking!");

        Scanner in = new Scanner(System.in);

        boolean keep_going = true;

        while (keep_going){
            int choice = in.nextInt();
            System.out.println("You choose option " + choice);

            if (choice == 0){
                keep_going = false;
            }
        }

    }
}