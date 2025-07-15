package Methods;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (isEven(number)){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
