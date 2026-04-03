import java.util.Scanner;
public class Sum {
    // public static int printHelloWorld(){
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    //     return 0;

        public static int CalculateSum(int num1 , int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = CalculateSum(a,b);
        System.out.println("Sum is: " +sum);
        // printHelloWorld();

    //     Scanner sc = new Scanner(System.in);
    //     int a, b;
    //     System.out.println("Enter first number: ");
    //     a = sc.nextInt();
    //    System.out.println("Enter second number: ");
    //     b = sc.nextInt();
    //     int sum = a + b;
    // System.out.println("The sum is: " + sum);
    // sc.close(); // Good practice to close the scanner

    }
    
}
