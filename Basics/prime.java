import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int n = sc.nextInt();

         if(n == 2) {
            System.out.println("n is Prime");
         } else{
            boolean a = true;
            for(int i = 2; i <= Math.sqrt(n); i++){
              if(n % i == 0){ //n is a multiple of i(i is not equal to 1 or n)
                a = false;
            }
         }

         if(a == true) {
            System.out.println(n+ " is Prime");
         }
         else{
            System.out.println(n+ " is not prime");
          }
         }
    }
    
}
