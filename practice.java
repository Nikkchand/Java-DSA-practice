import java.util.*;
public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a,b;
//         System.out.println("first no.: ");
//         a=sc.nextInt();
//         System.out.println("Second no.: ");
//         b=sc.nextInt();
//         int sum = a +b;
//         System.out.println("The sum is: "+sum);

//     }
// }
// public class practice{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i= 1; i<=n ;i++){
//             for(int j=0; j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(" * ");
//             }
//         System.out.println();
//         }
//     }
// }
// public class practice {

//     public static void main(String[] args) {
//         int n[] = {2, 4, 6, 8, 10, 12, 14};
//         int key = 14;
       
//          for (int i = 0; i <= n.length; i++) {
//             if(n[i] != key){
//                 System.out.println("Not found");
                
//             }
        
//         else{
//           System.out.println("At index: "+i);
//         }  
//         }
           
//             }

            





// Palindrome

public static boolean isPalindrome(String str){
    for(int i = 0;i<str.length()/2;i++){
        if(str.charAt(i) != str.charAt(str.length()-i-1)){
            return false;
        }        
    }
    return true;
}

public static int countVowel(String str){
    int count = 0;
    str = str.toLowerCase();
    for(int i=0 ; i < str.length() ; i++){
        char ch = str.charAt(i);
        if(ch =='a'|| ch == 'e' ||ch =='i'||ch =='o'||ch =='u'){
            count++;
        }
    }
    return count;
}


// Reverse String

    public static void main(String[] args) {
        // String str ="madam";
        // System.out.print(isPalindrome(str));
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        // System.out.print(isPalindrome(str));
        System.out.println(countVowel(str));
    }
}




