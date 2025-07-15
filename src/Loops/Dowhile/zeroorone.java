package Loops.Dowhile;

import java.util.Scanner;

public class zeroorone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mystart;
        int myend;

        do {
            System.out.print("Enter 1 to continue: ");
            mystart = input.nextInt();

            System.out.print("Enter 0 to exit: ");
            myend = input.nextInt();

        } while (!(mystart == 1 && myend == 0)); // loop until both are correct

        System.out.println("Exited the loop!");
        input.close();
    }
}
