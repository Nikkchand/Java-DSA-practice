// public class pattern {
//     public static void main(String[] args) {
        
//         for(int line = 1 ; line <=4; line++){
//             for(int star=1 ; star <= line ; star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
    
// }







// public class pattern {
//     public static void main(String[] args) {
//         int n=4;
//         for(int i =1 ; i<=4 ; i++){
//             for(int s = 1; s <= n-i+1 ; s++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }








// public class pattern {
//     public static void main(String[] args) {
//         int n=5;
//         for(int line = 1; line<=n ; line++){
//             for(int number =1 ; number<=line ; number++){
//                 System.out.print(number);
//             }
//             System.out.println(); 
//         }
//     }
// }









// public class pattern {
//     public static void main(String[] args) {
//         int n = 4;
//         char ch = 'A';

//         for(int i=1 ; i<=n; i++){
//             for(int j=1; j<=i ; j++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }

//     }
// }





// Print a hollow Rectangle with *
// public class pattern {
//     public static void hollow_rectangle(int totRows , int totCols){
//         //outer loop
//         for(int i =1; i<=totRows; i++){
//         //Inner loop
//             for(int j = 1; j <= totCols ; j++){
//                  //cell - (i,j)
//                  if(i == 1 || i == totRows || j == 1 || j == totCols) {
//                     //Boundary cells
//                     System.out.print("*");
//                  }else{
//                     System.out.print(" ");
//                  }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         hollow_rectangle(5, 5);
//     }
// }






// Print a pattern for inverted Rotated pyramid
// public class pattern {
//     public static void pyr(int n){
//         for(int i = 1; i<=n;i++){
//             //Spaces
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             //Stars
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//              System.out.println();
//         }
       
//     }

//     public static void main(String[] args) {
//         pyr(5);
//     }
// }




// Inverted half pyramid with number
// public class pattern{
//     public static void pyr(int n){
//         for(int i=1; i<=n ;i++){
//             for(int j = 1 ; j <= n-i+1 ;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         pyr(5);
//     }
// }







// Floyd's Triangle
// public class pattern {
//     public static void pyr(int n){
//         int num = 1;
//         for(int i=1; i<=n ;i++){
//             for(int j = 1 ; j <= i ;j++){
//                 System.out.print(num+" ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         pyr(5);
//     }
// }






// triangle with zero and 1
// public class pattern {
//     public static void pyr(int n){
//         for(int i=1; i<=n ;i++){
//             for(int j = 1 ; j <= i ;j++){
//                 if((i+j)%2 == 0){
//                 System.out.print("1");
//                 }else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         pyr(5);
//     }
// }












// Butterfly Pattern

// public class pattern {
//     public static void butterfly(int n){
//         // 1st half
//         for(int i=1; i<=n ;i++){
//             // Stars - i
//                 for(int j =1 ; j <= i ; j++){
//                     System.out.print("*");
//                 }
//             // spaces - 2 * (n-i)
//                  for(int j =1 ; j <= 2*(n-i) ; j++){
//                     System.out.print(" ");
//                 }
//             // stars - i
//                  for(int j =1 ; j <= i ; j++){
//                     System.out.print("*");
//                 }
//                 System.out.println();
//         }
//          // 2nd half
//         for(int i=n; i>=1 ;i--){
//             // Stars - i
//                 for(int j =1 ; j <= i ; j++){
//                     System.out.print("*");
//                 }
//             // spaces - 2 * (n-i)
//                  for(int j =1 ; j <= 2*(n-i) ; j++){
//                     System.out.print(" ");
//                 }
//             // stars - i
//                  for(int j =1 ; j <= i ; j++){
//                     System.out.print("*");
//                 }
//                 System.out.println();
//         }
        
//     }
//     public static void main(String[] args) {
//         butterfly(8);
//     }
// }








// Solid rhombus

// public class pattern {
//     public static void solid_Rhombus(int n){
//         for(int i=1; i<=n ;i++){
//             //Spaces - n-1
//             for(int j = 1 ; j <= n-i;j++){
//                 System.out.print(" "); 
//             }
//             // Star
//             for(int j=1 ; j<=n ;j++){
//                 System.out.print("*");
//             }
//             // Spaces
//             for(int j = 1 ; j<= i-1;j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         solid_Rhombus(5);
//     }
// }










// Hollow Rhombus
// public class pattern {
//     public static void hollow_Rhombus(int n){
//         for(int i=1; i<=n ;i++){
//             //Spaces - n-1
//             for(int j = 1 ; j <= n-i;j++){
//                 System.out.print(" "); 
//             }
//             for(int j = 1; j <= n ; j++){
//                  //cell - (i,j)
//                  if(i == 1 || i == n || j == 1 || j == n) {
//                     //Boundary cells
//                     System.out.print("*");
//                  }else{
//                     System.out.print(" ");
//                  }
//             }
//             System.out.println();
            
//         }
//     }
//     public static void main(String[] args) {
//         hollow_Rhombus(10);
//     }
// }









// Diamond pattern
// public class pattern {
//     public static void diamond(int n){
//         // 1st half
//         for(int i=1; i<=n ;i++){
//             // spaces - n-i
//                 for(int j =1 ; j <= (n-i) ; j++){
//                     System.out.print(" ");
//                 }
//                 // stars - (2*i)-1
//                  for(int j =1 ; j <= (2*i)-1 ; j++){
//                     System.out.print("*");
//                 }

//                 System.out.println();
//         }
//          // 2nd half
//         for(int i=n; i>=1 ;i--){
//             // spaces - n-i
//                 for(int j =1 ; j <= (n-i) ; j++){
//                     System.out.print(" ");
//                 }
//                 // stars - (2*i)-1
//                  for(int j =1 ; j <= (2*i)-1 ; j++){
//                     System.out.print("*");
//                 }
//                 System.out.println();
//         }
        
//     }
//     public static void main(String[] args) {
//         diamond(4);
//     }
// }







// Number pyramid
// public class pattern {
//     public static void number_pyramid(int n){
//         // 1st half
//         for(int i=1; i<=n ;i++){
//             // spaces - n-i
//              for(int j = 1 ; j<=n-i ; j++){
                
//                      System.out.print(" ");
//                    }
//                   // stars - (2*i)-1
//               for(int j=1 ; j<= i ; j++){
//                     System.out.print(i+(" "));
                  
                
//             }
        
//                 System.out.println();
//     }
    
// }
        
        
// public static void main(String args[]){
//      number_pyramid(5);
// }
// }










// Palindrome Number pyramid
public class pattern{
    public static void number_pyramid(int n){
        // 1st half
        for(int i=1; i<=n ;i++){
            // spaces - n-i
             for(int j = 1 ; j<=n-i ; j++){
                     System.out.print(" ");
                   }
                //descending part
            for(int j=i ; j>=1 ; j--){
                    System.out.print(j);            
            }
            // ascending part
            for(int j=2 ; j<=i ; j++){
                System.out.print(j);
            }
                System.out.println();
    }
    
}
        
        
public static void main(String args[]){
     number_pyramid(5);
}
}

