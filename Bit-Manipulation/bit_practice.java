
public class bit_practice {

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;

        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return (n | bitMask);
    }



    public static int clearIthBit(int n,int i) {
        int bitMask = ~(1<< i);
        return (n & bitMask);
    }


    public static int updateIthBit(int n , int i , int newBit) {
        // if(newBit==0){
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }
        //     //OR
         n = clearIthBit(n, i);
         int bitMask = newBit<<i;
         return n|bitMask;
    }


    public static int clearIBits(int n,int i){
        int bitMask = (~0)<<i;
        return n&bitMask;
    }


    public static void main(String[] args) {
        oddOrEven(0);
        oddOrEven(1);
        oddOrEven(2);

        System.out.println(getIthBit(5, 1));//0
        System.out.println(getIthBit(10, 3));//1

        System.out.println(setIthBit(10, 2)); //(1010) => set i=2 (0 to 1) ====> (1110) ==> 14

        System.out.println(clearIthBit(10, 2)); //(1010) ==> clear i = 2 ===> 2 wale index pr 0 aayega jo ki already hy to same answer ==> (1010) ==> Output = 10
        System.out.println(clearIthBit(10, 3)); //output = 2 as (0010)



        System.out.println(updateIthBit(10, 2, 1));



        System.out.println(clearIBits(15, 2));
    }
}
