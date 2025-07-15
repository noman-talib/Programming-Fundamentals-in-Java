package Loops.Dowhile;

import java.util.Scanner;

public class storedvalues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = "noman";
        int password = 123;
        String myusername;
        int mypassword;
        do {
            System.out.print("Enter your username: ");
            myusername = input.nextLine();
            System.out.print("Enter your password: ");
            mypassword = input.nextInt();
            input.nextLine();
        }while (!myusername.equals(username) ||  mypassword != password);
        System.out.println("Correct username and password entered! Access Granted!");
    }
}
