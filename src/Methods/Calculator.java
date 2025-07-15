package Methods;

public class Calculator {
    public static int add(int a, int b){
        return a + b;
    }
    public static int subtract(int a, int b){
        return a - b;
    }
    public static int divide(int a, int b){
        return a / b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public void display(){
        System.out.println("Thankyou for using the calculator");
    }
    public static void main(String[] args) {
        System.out.println(add(7,4));
        System.out.println(subtract(8,9));
        System.out.println(divide(5,6));
        System.out.println(multiply(5,9));
        Calculator c1 = new Calculator();
        c1.display();
    }
}
