public class Practice {

    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a pen object called p1.
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        p1.color = "Red";  //In 2nd time we may not write setColor() but also work
        System.out.println(p1.color);
        p1.tip = 8;
        System.out.println(p1.tip);


        Student s1 = new Student();
        s1.name = "Rahul Chand";
        System.out.println(s1.name);
        s1.age = 21;
        System.out.println(s1.age);
        s1.percentage = 7.37f;
        System.out.println(s1.percentage);

        s1.calcPercentage(70,80,90);
        System.out.println(s1.percentage);





        BankAccount myAcc = new BankAccount();
        myAcc.username = "rahulchandrc";
        System.out.println(myAcc.username);
        //myAcc.password = "kjashdj"; // not accessed here as it is private 

        myAcc.setPassword("jsghdjhs"); //we can only set password by function but did not change it
        //System.out.println(myAcc.password); //can't be printed by here or access by here
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}


//public class k niche hi classses bnaye , isse object bnane m easy hogi
class Pen {   //(convention hy ki classes Capital letter se bnaye) and (function small letter se & nextletter k liye Capital)
    
    //properties + function

    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {

    String name;
    int age;
    float percentage; //cgpa

    void calcPercentage(int oops, int dbms, int CN) {
        percentage = (oops + dbms + CN) / 3;
    }
}
