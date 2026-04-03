import java.util.Scanner;

public class functionnn {
    // public static int CalculateSum(int num1 , int num2) {             //Parameters or formal parameter
    // int sum = num1 + num2;
    // return sum;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int sum = CalculateSum(a,b); //Arguments or actual parameter
    // System.out.println("Sum is: " +sum);
    // }


    // public static int multiply (int a , int b){
    // int product = a*b;
    // return product;
    // }
    // public static void main(String[] args) {
    // int product = multiply(3,5);
    // System.out.println("The product is: " +product);
    // }


// Factorial of a number n
    // public static int factorial (int n) {
    // int f = 1;
    // for (int i = 1; i<=n;i++){
    // f*=i;
    // }
    // return f;
    // }

// Binomial coefficient
    // public static int Bincoeff(int n,int r){
    // int fact_n = factorial(n);
    // int fact_r = factorial(r);
    // int fact_nmr = factorial(n-r);

    // int Bincoeff = fact_n / (fact_r *fact_nmr);
    // return Bincoeff;
    // }
    // public static void main(String[] args) {
    // System.out.println(Bincoeff(5,2));
    // }





//Funtion overloading --using parameter -- depends on parameter
//Function to calculate sum of two no.

    // public static int sum (int a , int b){
    // return a+b;
    // }

    // Funtion to calculate sum of three no.
    // public static int sum(int a, int b , int c) {   //if there is only int (a , b) then error occurs.
    // return a+b+c;
    // }

    // public static void main(String[] args) {
    // System.out.println(sum(3,5));
    // System.out.println(sum(4, 6,2));
    // }

    // Funtion overloading --using datatypes -- depends on datatypes
    // Function to calculate sum of two no.

    // public static int sum (int a , int b){
    // return a+b;
    // }

    // //Funtion to calculate sum of three no.
    // public static float sum(float a, float b ) {   //datatype different so same parameter can work here
    // return a+b;
    // }

    // public static void main(String[] args) {
    // System.out.println(sum(3,5));
    // System.out.println(sum(4.2f, 6.5f));
    // }





    // Swapping of two number
    // public static void swap(int a , int b){
    // int temp =a;
    // a=b;
    // b=temp;
    // System.out.println("a = " +a);
    // System.out.println("b = "+b);
    // }
    // public static void main(String[] args) {
    // swap(4,5);
    // }






// Checking of a Number whether it is prime or not
// corner cases --- for 2

    // public static boolean isPrime(int n) {
    // if(n ==2){
    // return true;
    // }
    // boolean isPrime = true;
    // for(int i = 2; i <= Math.sqrt(n) ;i++){
    // if(n%i == 0){ //completely dividing
    // // isPrime = false;
    // return false;
    // }
    // }
    // return true;
    // }

    // public static void main(String args[]){
    // System.out.println(isPrime(551));
    // }



// Print all Primes in a Range

    // public static void PrimesinRange(int n){
    // for(int i = 2 ; i<=n ; i++){
    // if(isPrime(i)){ //if true
    // System.out.print(i+" ");
    // }
    // }
    // System.out.println();
    // }
    // public static void main(String[] args) {
    // PrimesinRange(500); //2 to 20
    // }



// Binary to Decimal:

    // public static void binToDec(int binNum) {
    // int myNum = binNum;
    // int pow = 0;
    // int decNum = 0;

    // while(binNum > 0) {
    // int lastDigit = binNum % 10;
    // decNum += (lastDigit * (int)Math.pow(2,pow));
    // pow++;
    // binNum = binNum/10;
    // }
    // System.out.println("Decimal of " + myNum + " = " + decNum + ".");
    // }

    // public static void main(String[] args) {
    // binToDec(10001001);
    // }



// Decimal to binary

    // public static void decToBin(int decNum){
    // int myNum = decNum;
    // int pow = 0;
    // int binNum = 0;

    // while(decNum > 0){
    // int rem = decNum % 2;
    // binNum += (rem * (int)Math.pow(10, pow));
    // pow++;
    // decNum /= 2;
    // }
    // System.out.print("Binary of " + myNum + " = " +binNum);
    // }

    // public static void main(String[] args) {
    // decToBin(7);
    // }


  
    
// Average of three number

    // public static int average(int a , int b , int c){
    // int avg = (a+b+c) / 3;
    // return avg;
    // }
    // public static void main(String[] args) {
    // System.out.println("Average of three number = " +average(80,56,41));
    // }




// to check even or odd
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter your number: ");
        num = sc.nextInt();

        if (isEven(num)) {
            System.out.println("Your no. is Even");
        } else {
            System.out.println("Your no. is odd");
        }
    }

    public static boolean isEven(int n) {
        if(n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }



}
