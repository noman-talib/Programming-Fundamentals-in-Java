package Loops.Dowhile;

import java.util.Scanner;

public class numberguess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 7;
        int mynumber;
        do {
            System.out.print("Enter your number: ");
            mynumber = input.nextInt();
            System.out.println("Good choice! Guess Again! ");
        }while(!(mynumber == number));

        System.out.println("Congratulations! You have guessed the right number");
    }
}
