// import java.util.Scanner;
// public class ternaary {
//     public static void main(String[] args) {
//     //    int number = 45;
//     //      String type = (number % 2 == 0) ? "Even" : "Odd";
//     //         System.out.println(type);
//     int marks;
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter your marks: ");
//     marks = sc.nextInt();

//     String result = (marks >= 33) ? "Pass" : "Fail";
//     System.out.println("You have " + result + "ed the exam.");

//     }
// }
import java.util.*;
public class ternaary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day Number (1-7): ");
        int day = sc.nextInt();

        switch(day){
            case 1:
            System.out.println("Monday");
            break;

            case 2:
            System.out.println("Tuesday");
            break;

            case 3:
            System.out.println("wednesday");
            break;

            case 4:
            System.out.println("Thursday"); 
            break;

            case 5:
            System.out.println("Friday");
            break;
            
            case 6:
            System.out.println("Saturday");
            break;

            case 7:
            System.out.println("Sunday");
            break;

            default:
            System .out.println("Invalid Day");




        }

    }
}