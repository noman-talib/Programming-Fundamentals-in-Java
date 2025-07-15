package Operators;

import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        if (a % 3  == 0 && a % 5 == 0){
            System.out.println("Number is divisible by both");
        }
        else {
            System.out.println("Number is not divisible");
        }
    }
}
