package SwitchStatements;

import java.util.Scanner;

public class Trafficlight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a color (Red,Green,Yellow): ");
        String color = input.nextLine();
        switch (color){
            case "Red":
            case "red":
                System.out.println("Stop");
                break;
            case "Green":
            case "green":
                System.out.println("Go");
                break;
            case "Yellow":
            case "yellow":
                System.out.println("Ready");
                break;
            default:
                System.out.println("Enter a valid color!");
        }
    }
}
