import java.util.*;

public class stringss {

    public static void printLetters(String str){
        for(int i = 0 ; i<str.length() ; i++){
            System.out.print(str.charAt(i)+" ");
        }
    }

    public static String substring(String str,int si,int ei){
        String substr = "";
        for(int i = si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String args[]) {
        // Input-Output of string
        // Scanner sc = new Scanner(System.in);
        // String name; 
        // name = sc.nextLine();
        // System.out.print(name);



// Concatenation of string
        // String firstName = "Rahul";
        // String lastName = new String("Chand"); 
        // String fullName = firstName +" "+ lastName;
        // System.out.print(str+" "+name);


        // String Length and CharAt()
        // String fullName = "Rahul chand";
        // System.out.println(fullName.length());
        // System.out.println(fullName.charAt(1+2+3));

        // printLetters(fullName);



// String Function - .equals()

        // String S1 = "Rahul";
        // String S2 = "Rahul";
        // String S3 = new String("Rahul");

    //     if(S1==S2){   //this gives strings are equal
    //         System.out.println("Strings are equal");
    //     }else{
    //         System.out.println("Strings are not equal");
    //     }

    //      if(S1==S3){  //this gives strings are not equal
    //         System.out.println("Strings are equal");
    //     }else{
    //         System.out.println("Strings are not equal");
    //     }


// .equals() function is used to comparing string 
            // if(S1.equals(S3)){
            //     System.out.println("Strings are equal");
            // }else{
            //     System.out.println("Strings are not eqaul");
            // }




// Substring function
        // String str = "HelloWorld";
        // System.out.println(str.substring(3,6));
        // System.out.println(substring(str,3,6));





// Largest String
        String fruits[] = {"apple","mango","banana"};
        String largest = fruits[0];
        for(int i = 1; i< fruits.length;i++){
            if(largest.compareToIgnoreCase(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
     }
} 