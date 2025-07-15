package Loops.Dowhile;

import java.util.Scanner;

public class yesorno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String condition = "yes";
        String mycondition;
        do {
            System.out.print("Enter a number: ");
            input.nextInt();
            input.nextLine();
            System.out.println("Do you want to continue?");
            mycondition = input.nextLine();
        }while (mycondition.equals(condition));
    }
}
