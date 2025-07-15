import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        boolean prime = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = 2; i < number ; i++) {
            if (number % i == 0){
                prime = false;
                break;
            }
        }
        System.out.println("Number is prime");

    }
}
