public class stringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch ='a';ch<='z';ch++){
            sb.append(ch);
        }//Output - abcdefghijklmnopqrstuvwxyz
        // Time complexity - O(26)
        System.out.println(sb);
        System.out.println(sb.length());
        

    }
}
