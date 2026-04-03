// public class ArraysRC{
// public static void update(int marks[],int unchangeable){
//         unchangeable = 92;
//        for(int i = 0 ; i< marks.length ; i++){
//             marks[i] += 1; 
//        }

//     }
//     public static void main(String[] args) {
//         int marks[] = {94,95,96};
//         int unchangeable = 5;
//         update(marks,unchangeable);
//           for(int i = 0 ; i< marks.length ; i++){
//             System.out.println(marks[i]+" ");
//        }
//         System.out.println(unchangeable);
//         // int arr[] = new int[5];
//         // int marks[] = {97, 98, 95, 93};
//         // int num[] = {1,2,3,4,5};
//         System.out.println();
//     }
// }


//Linear Search
// public class ArraysRC{
//     public static int linearSearch(int numbers[] , int key){
//         for(int i = 0 ; i < numbers.length ; i++){
//             if(numbers[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10,12,14,16};
//         int key = 8;
//         System.out.println("Key is at index: " +linearSearch(numbers, key));
//     System.out.println("Not Found!!");
// }else{
//     System.out.println("Key is at index: " +index);
// }
//     }
// }


// Finding Smallest and largest number

// public class ArraysRC{
//     public static int  getlargest(int number[]){
//         int largest = Integer.MIN_VALUE; // -infinity
//         int Smallest = Integer.MAX_VALUE; // +infinity
//         for(int i = 0; i< number.length ; i++){
//             if(largest < number[i]){
//                 largest = number[i];
//             }
//         }
//         for(int i = 0 ; i <number.length;i++){
//             if(Smallest > number [i]){
//                 Smallest = number[i];
//             }
//         }
//         System.out.println("Smallest number is: " +Smallest);
//         return largest;
//     }
//     public static void main(String[] args) {
//         int number[] = {1,2,6,3,5};
//         System.out.println("Largest number is: "+ getlargest(number));
//     }
// }


// binary Search
// public class ArraysRC {

//     public static int binarySearch(int numbers[], int key) {
//         int start = 0, end = numbers.length;
//         while (start <= end) {
//             int mid = (start + end) / 2;
//             // Comparisions
//             if (numbers[mid] == key) {
//                 return mid;
//             }
//             if (numbers[mid] < key) { //Right
//                 start = mid + 1;
//             } else {            //left
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
//         int key = 12;
//         System.out.println("Index for key is: " + binarySearch(numbers, key));
//     }
// }


// binary Search
// public class ArraysRC {

//     public static int binarySearch(int numbers[], int key) {
//         int start = 0, end = numbers.length;
//         while (start <= end) {
//             int mid = (start + end) / 2;
//             // Comparisions
//             if (numbers[mid] == key) {
//                 return mid;
//             }
//             if (numbers[mid] < key) { //Right
//                 start = mid + 1;
//             } else {            //left
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
//         int key = 12;
//         System.out.println("Index for key is: " + binarySearch(numbers, key));
//     }
// }

// Reverse of an Array
// public class ArraysRC{
//     public static void Rev(int num[]){
//         int start = 0 ,  end = num.length -1;
//         while(start <  end ){
//             int temp = num[start];
//             num[start] = num[end];
//             num[end] = temp;
//             start++;
//             end--;
//         }
//     }
//     public static void main(String[] args) {
//         int num[]={2,4,6,8,10};
//         Rev(num);
//         for(int i =0 ; i< num.length ;i++){
//             System.out.print(num[i]+" ");
//         }
//     } 
// }
//or
// import java.util.*;
// public class ArraysRC {
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50};
//         int n = arr.length;
//         int[] rev = new int[n];
//         for (int i = 0; i < n; i++) {
//             rev[i] = arr[n - 1 - i];
//         }
//         System.out.println(Arrays.toString(rev));
//     }
// }
// public class ArraysRC{
//     public static void pairs(int num[]) {
//     int tp =0;
//         for (int i = 0; i < num.length; i++) {
//             int curr = num[i];
//             for(int j=i+1; j<num.length;j++){
//                 System.out.print("(" +curr +","+num[j] + ")");
//                 tp++;
//             } 
//              System.out.println();   
//         }
//        System.out.println("Total Pairs = "+tp);
//     }
//     public static void main(String[] args) {
//         int num[]={2,4,6,8,10,12,14,15,16,17,18};
//         pairs(num);
//     }
// }

// Print All SubArrays
// public class ArraysRC {
//     public static void main(String[] args) {
//         int ts = 0;
//         int num[] = {2, 4, 6, 8, 10};
//         for (int i = 0; i < num.length; i++) {
//             for (int j = i; j < num.length; j++) {
//                 for (int k = i; k <= j; k++) { //Print
//                     System.out.print(num[k] + " ");//Subarrays          
//                 }
//                 ts++;
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("Total SubArrays: " + ts);
//     }
// }


// SubArray MaxSum
// public class ArraysRC {
//     public static void main(String[] args) {
//       int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int num[] = {2, 4, 6, 8, 10};
//         for (int i = 0; i < num.length; i++) {
//             for (int j = i; j < num.length; j++) {
//               currSum = 0;
//                 for (int k = i; k <= j; k++) { //Print
//                    currSum += num[k];       
//                 }
                
//                 System.out.println(currSum);
//                 if(maxSum < currSum){
//                   maxSum = currSum;
//                 }
//             }
            
//         }
//         System.out.println("Max sum is: " +maxSum);
//     }
// }



// Kadanes Algorithm
public class ArraysRC{
    public static void main(String[] args) {
        int num[] = {-2,-3,3,4,-2,7,-2};
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0 ; i< num.length ;i++){
            currSum += num[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println("Max subarray sum is: "+maxSum);
    }
}