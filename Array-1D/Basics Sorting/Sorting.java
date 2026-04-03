import java.util.*;

// Binary sort
// public class sorting {
//     public static void main(String[] args) {
//         int arr[] = {22,16,45,7,46,89,5,20};
//         for (int turn = 0; turn < arr.length - 1; turn++) {       
//             for (int j = 0; j < arr.length - 1 - turn; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;                  
//                 }      
//             }
//         }  
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }




// Selection sort -  select smallest one and put it in beginning

// public class sorting{
//     public static void main(String[] args) {
//         int a[]={78,23,35,64,323,67,433,55,68,24,9,24,7889,76,446,365,36,89,76,58,7432,};
//         for(int i = 0; i<a.length-1;i++){
//             int MinPos = i;
//             for(int j=i+1; j<a.length;j++){
//                 if(a[MinPos] > a[j]){
//                     j=MinPos;
//                 }
//             }
//             int temp = a[MinPos];
//             a[MinPos] = a[i];
//             a[i] = temp;
             
//         }
//         for(int i =0;i<a.length;i++){
//             System.out.print(a[i]+" ");
//         }
//     }
// }
 



public class Sorting{   
public static void insertionSort(int arr[]){


    for(int i=1;i<arr.length;i++){
        int curr=arr[i];
        int prev = i-1;
        // finding out the correct position to insert
        while(prev >=0 && arr[prev] > curr){
            arr[prev+1]=arr[prev];
            prev--;
        }
        // insertion
        arr[prev+1]=curr;     
    }
}
public static void printArr(int arr[]){
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
}  



// Counting sort
public static void countingSort(int arr[]){
    int largest = Integer.MIN_VALUE;
    for(int i = 0 ; i < arr.length ;i++){
        largest = Math.max(largest , arr[i]);
    }
    int count[]= new int[largest+1];
    for(int i = 0; i<arr.length ; i++){
        count[arr[i]]++;
    }
    // Sorting
    int j = 0;
    for(int i = 0 ; i < count.length ;i++){
        while(count[i]>0){
            arr[j] = i;
            j++;
            count[i]--;
        }
    }   
}
public static void main(String[] args) {
    int arr[] = {5,4,1,3,2};
    countingSort(arr);

    
    printArr(arr);
}
}


// Inbuilt Sorting
// For Ascending Order
// public class Sorting{
//     public static void main(String[] args) {
//         int arr[]= {9,2,5,83,75,34};
//         Arrays.sort(arr,0,3);
//         for(int i=0;i<arr.length ; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


// For descending Order - Inbuilt sort funtion
// public class Sorting{
//     public static void main(String[] args) {
//         Integer arr[]= {9,2,5,83,75,34};
//         Arrays.sort(arr,Collections.reverseOrder());
//         for(int i=0;i<arr.length ; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

