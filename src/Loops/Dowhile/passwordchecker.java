package Loops.Dowhile;

import java.util.Scanner;

public class passwordchecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        String orgpassword = "java123";
        do{
            System.out.println("Enter your password!");
           password =  input.nextLine();
        } while (!password.equals(orgpassword));

        System.out.println("Correct Password Entered! Access Granted!");
    }
}
