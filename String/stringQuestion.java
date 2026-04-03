import java.util.*;
// public class palindrome {
//     public static void main(String args[]){
//         String str;
//         Scanner sc = new Scanner(System.in);
//         str = sc.nextLine();
//         int n=str.length();
//         for(int i = 0; i<n/2 ;i++){
//             if(str.charAt(i) != str.charAt(n-i-1)){
//                 System.out.print(str + " is not a palindrome.");
//                 return;
//             }
//         }
//         System.out.print(str+" is a palindrome.");
//     }
// }



// OR

// ISpalindrome
public class stringQuestion{

    public static boolean isPalindrome(String str){
        for(int i = 0; i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
    return true;
}

// Shortest Path
public static float getShortestPath(String path){
    int x = 0 , y = 0;
    for(int i = 0; i<path.length();i++){
        char dir =path.charAt(i);

        // South
        if(dir == 'S'){
            y--;
        }
        // North
        else if(dir == 'N'){
            y++;
        }
        // East
        else if(dir == 'E'){
            x++;
        }
        // West
        else{
            x--;
        }         
    }
    int X2 = x*x;
    int Y2 = y*y;
    return (float)Math.sqrt(X2 + Y2);
    }



//Change every first letter to a uppercase letter
public static String toUpperCase(String str) {
    StringBuilder sb = new StringBuilder("");

    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for(int i = 1; i<str.length();i++){
        if(str.charAt(i)==' ' && i<str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }else{
            sb.append(str.charAt(i));
        }
    } 
    return sb.toString();
}
public static void main(String args[]){
    //isPalindrome
    // String str;
    // Scanner sc = new Scanner(System.in);
    // str = sc.nextLine();
    // System.out.print(isPalindrome(str));




    // Shortest path
    // String path = "WNEENESENNN";
    // System.out.print(getShortestPath(path));




//toUpperCase
    String str = "hi, i am rahul chand";
    System.out.println(toUpperCase(str));
    }
}