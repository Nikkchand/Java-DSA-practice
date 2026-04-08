
public class bitOperators {

    public static void main(String[] args) {

// AND & Operator
        System.out.println(5 & 6); // 4

// OR | Opreator
        System.out.println(5 | 6);  //7

// XOR ^ Operator
        System.out.println(5 ^ 6); //3

//Binary One's Complement ~
        System.out.println(~5);  //-6
        System.out.println(~0);  //-1
        System.out.println(~-1); //0
        System.out.println(~-11); //10



//Binary left shift <<
        System.out.println(5<<2); //20 
        System.out.println(30<<5); //960

        //formula ===  (a<<b = a*2^b)




//Binary Right shift >>
        System.out.println(6>>1); //3
        System.out.println(30>>2); //7

        //formula ===  (a>>b = a/2^b)

    }
}
