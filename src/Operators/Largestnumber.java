package Operators;

import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a > b && a > c){
            System.out.println("A is largest number");
        } else if (b > a && b > c) {
            System.out.println("B is largest");
        }
        else {
            System.out.println("C is Largest");
        }
    }
}
