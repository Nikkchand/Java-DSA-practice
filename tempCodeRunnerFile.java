public class ArraysRC{
    public static int  getlargest(int number[]){
        int largest = Integer.MIN_VALUE; // -infinity
        int Smallest = Integer.MAX_VALUE; // +infinity
        for(int i = 0; i< number.length ; i++){
            if(largest < number[i]){
                largest = number[i];
            }
        }
        for(int i = 0 ; i <number.length;i++){
            if(Smallest > number [i]){
                Smallest = number[i];
            }
        }
        System.out.println("Smallest number is: " +Smallest);
        return largest;
    }
    public static void main(String[] args) {
        int number[] = {1,2,6,3,5};
        System.out.println("Largest number is: "+ getlargest(number));
    }
}