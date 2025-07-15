package SwitchStatements;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        input.nextLine();
        System.out.println("Enter an operator to perform operations: ");
        String operators = input.nextLine();

        switch (operators){
            case "+":
                System.out.println("Sum is: " + (a + b));
                break;
            case "-":
                System.out.println("Diff is: " + (a - b));
                break;
            case "*":
                System.out.println("Product is: " + (a * b));
                break;
            case "/":
                if(b == 0) {
                    System.out.println("can't divided by zero!");
                }else{
                    System.out.println("Division is: " + (a/b));
                }
                break;
            default:
                System.out.println("Enter a valid operator!");
        }

    }
}
