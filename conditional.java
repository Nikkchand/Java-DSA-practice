 import java.util.Scanner;

public class conditional{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age > 13 && age < 18){
            System.out.println("You are a teenager.");
        }

        else if(age >= 18){
            System.out.println("You are eligible to vote.");
        }

        else{
            System.out.println("You are not eligible to vote.");
        }
        sc.close();
    }

}    

