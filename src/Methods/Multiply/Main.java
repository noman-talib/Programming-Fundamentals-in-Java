package Methods.Multiply;

public class Main {
   public static int multiply(int a, int b){
       return a * b;
   }
   public void display(){
       System.out.println("This is non static method");
   }

    public static void main(String[] args) {
        //Static method
        System.out.println(multiply(8,7));
        //Non-Static method
        Main m1 = new Main();
        m1.display();
    }
}
