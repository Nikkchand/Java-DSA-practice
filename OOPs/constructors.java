//Non-parameterized constructors
// public class constructors {
//     public static void main(String[] args) {
//         Student st = new Student();     
//     }
// }
// class Student {
//     Student() {
//        System.out.println("constructor is called....");
      
//     }
// }





//Parameterized constructor

// public class constructors {
//         public static void main(String[] args) {
//         Student st = new Student("Rahul chand",20);
        
//         System.out.println(st.name+ "("+ st.age+")");
//     }
// }
// class Student {
//     String name;
//     int age;

//     Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//     }
// }


// Copy constructor

public class constructors{
    public static void main(String[] args) {
        // custructor calling
        Student s1 = new Student();
        s1.name = "Rahul chand";
        s1.roll = 465;
        
        System.out.println("s1 called: "+s1.name);
        System.out.println("s1 called: "+s1.roll);
        s1.marks[0] =98;
        s1.marks[1] = 99;
        s1.marks[2] =89;

        Student s2 = new Student(s1);
        System.out.println("s2 called: "+s1.name);
        System.out.println("s2 called: "+s1.roll);
        s1.marks[2] = 100;    // No change in deep copy but update in shallow copy
        for(int i = 0; i<3 ; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    int marks[];

//Shallow copy constructor
    // Student(Student s1) {
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     marks = new int[3];
    //     this.marks = s1.marks;
    // }

// Deep copy constructor
    Student(Student s1) {
        this.name = name;
        this.roll = roll;
        marks = new int[3];
        for(int i = 0; i< marks.length ; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student(){
        marks = new int[3];
        System.out.println("constructor is called.....");
    }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }

    Student (int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}