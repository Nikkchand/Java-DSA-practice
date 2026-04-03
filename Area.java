import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square: ");
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("The area of square is: " + area);
        sc.close(); 

        // byte b = 4;
        // char c = 'a';
        // short s = 512;
        // int i = 1000;
        // float f = 3.14f;
        // double d = 99.9954;

        // double result = (f * b) + (i % c) - (d * s);
        // System.out.println((f * b) + " " + (i % c) + " " + (d * s));
        // System.out.println("The result is: " + result);   //Result is in double
    }


    
}
