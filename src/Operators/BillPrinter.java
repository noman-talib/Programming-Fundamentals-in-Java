package Operators;

import java.util.Scanner;

public class BillPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your units: ");
        int units  = input.nextInt();

        float bill = (float) (units * 7.5);
        System.out.println("Hello " + name + ",Your bill is Rs." + bill);

    }
}
