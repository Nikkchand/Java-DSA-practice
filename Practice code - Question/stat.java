import java.util.*;
public class stat{
   public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();



//Printing a square patter with "****"
//using for loop
        // for(int i=1;i<=4;i++){
        // System.out.println("****");
        // }
//Using while loop
        // int i = 1;
        // while(i<=4){
        // System.out.println("****");
        // i++;
        // }



//Reverse a given number
        // int n = 12837;
        // while (n > 0) {
        //     int lastDigit = n % 10;
        //     System.out.print(lastDigit + "");
        //     n = n / 10;
        // }
        // System.out.println();



//Do while loop
        // int i = 1;
        // do{
        //     System.out.println("Hello World");
        //     i++;
        // }while(i <= 10);


//Break statement
        // for(int i = 1; i<=5; i++){
        //     if(i == 3) {
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("I am out of the loop");



//Print a number till user input multiple of 10
        // do { 
        //     System.out.println("Enter your number: ");
        //     int n = sc.nextInt();
        //     if(n % 10 == 0){
        //         break;
        //     }
            
        // } while (true);




// Continue statement   
        // for(int i =1; i <= 5; i++){
        //     if(i == 3){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

//Display all numbers entered by user except multiples of 10
        do { 
        // int n = sc.nextInt();
            System.out.print("Enter your Number: ");
            
            if(n % 10 == 0){
                continue;
            }
            System.out.println("number was: " +n);
        } while (true);

   }
}



