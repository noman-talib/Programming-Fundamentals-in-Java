package Operators;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SPA{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = input.nextInt();
        System.out.println("Enter second number: ");
        int  b = input.nextInt();
        //Finding sum
        int sum = a + b;
        System.out.println("Sum is: " + sum);
        //Finding product
        int product = a * b;
        System.out.println("Product is: " + product );
        //Finding average
         float average  = a + (float) b /2;
        System.out.println("Average is:" + average);

    }
}
