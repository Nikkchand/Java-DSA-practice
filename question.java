// import java.util.*;
// public class question {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);


            //   To check whether a number is positive or negative
        // System.out.print("Enter a number: ");
        // int number = sc.nextInt();
        // if(number >= 0){
        //     System.out.println("The number is positive.");
        // }
        // else{
        //     System.out.println("The number is negative.");
        // }



            // To check whether a person has fever or not
        // System.out.print("Enter your temperature: ");
        // double temp = sc.nextFloat();
        // if(temp>100){
        //     System.out.println("You have a fever.");
        // }
        // else{
        //     System.out.println("You don't have a fever.");
        // }


        


//         sc.close();
        
//     }
    
// }
// import java.util.*;
// public class question {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         // char index = sc.next().charAt(0);
//         int choice;
//         int esum =0;
//         int osum = 0;

//         do { 
//             System.out.println("Enter your number: ");
//             int n = sc.nextInt();
        
        
//             if(n%2 == 0){
//                 esum += n;
                    
//             }
//             else{
//                 osum += n;
                    
//             }

//             System.out.print("Do you want to continue? Press 1 for yes or 0 for no");

//             choice = sc.nextInt();

//             } while (choice == 1);
        
//         System.out.println("Sum of even integers: " +esum);
//         System.out.println("Sum of Odd integers: " +osum);
//     }
// }

import java.util.Scanner;
public class question {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int number;
int choice;
int evenSum = 0;
int oddSum = 0;
do {
System.out.print("Enter the number ");
number = sc.nextInt();
if( number % 2 == 0) {
evenSum += number;
} else {
oddSum += number;
}
System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
choice = sc.nextInt();
} while(choice==1);
System.out.println("Sum of even numbers: " + evenSum);
System.out.println("Sum of odd numbers: " + oddSum);
}
}