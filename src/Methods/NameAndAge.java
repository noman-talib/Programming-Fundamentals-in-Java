package Methods;

import java.util.Scanner;

public class NameAndAge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        NameAndAge n1 = new NameAndAge();  // Create object to call non-static method
        n1.display(name, age);

        if (isAdult(age)) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are underage.");
        }
    }

    // Static method to check if age >= 18
    public static boolean isAdult(int age) {
        return age >= 18;
    }

    // Non-static method to display greeting
    public void display(String name, int age) {
        System.out.println("Hello " + name + ", your age is " + age);
    }
}
