package SwitchStatements;

import java.util.Scanner;

public class Daysofweek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter days of week(1-7): ");
        int day = input.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}
