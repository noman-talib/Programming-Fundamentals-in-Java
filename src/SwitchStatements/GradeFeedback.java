package SwitchStatements;

import java.util.Scanner;


public class GradeFeedback {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter a grade(A-F or a-f) to check feedback: ");
        String a = input.nextLine();
        switch (a){
            case "A":
            case "a":
                System.out.println("85%");
                break;
            case "B":
            case "b":
                System.out.println("75%");
                break;
            case "C":
            case "c":
                System.out.println("65%");
                break;
            case "D":
            case "d":
                System.out.println("55%");
                break;
            case "F":
            case "f":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Enter a valid grade");
        }
    }
}
