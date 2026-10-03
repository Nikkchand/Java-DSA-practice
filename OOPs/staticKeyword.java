public class staticKeyword{
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.collegeName = "CGC-CEC";

        Student S2 = new Student();
        System.out.println(Student.collegeName);  // CGC-CEC  -- static keyword wale directly class name se v access kr skte hy

        Student S3 = new Student();
        S3.collegeName = "CU";
        System.out.println(S3.collegeName); // CU
        System.out.println(S1.collegeName); // CU -- as it is written after changing the collegeName.

        
        System.out.println(S1.percentage(89, 93, 79, 81, 95)+"%");
        System.out.println(S2.percentage(90, 89, 78, 88, 75)+"%");
    }
}

class Student{

   static int percentage(int DWM, int SPM , int STQA, int RS , int AI) {
        return (DWM+SPM+STQA+RS+AI)/5;
    }

    String name;
    int rollNo;

    static String collegeName; // made one time used for many different objects

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}