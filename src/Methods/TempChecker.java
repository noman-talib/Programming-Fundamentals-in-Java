package Methods;

import java.util.Scanner;

public class TempChecker {
    public static double CelsiusToFahrenheit(double num){
        return (num * 9/5) + 32;
    }
    public static double FahrenheitToCelsius(double num){
        return (num - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temp: ");
        double temp = input.nextDouble();
        System.out.println(CelsiusToFahrenheit(temp));
        System.out.println(FahrenheitToCelsius(temp));
    }
}
