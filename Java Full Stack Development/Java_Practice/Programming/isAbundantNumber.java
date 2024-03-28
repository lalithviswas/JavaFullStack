//Abundant Number
//If the sum of the proper factors of a number is greater than the number

public class isAbundantNumber {
    public static void main(String[] args) {
        int num = 12, sum = 0;
        for(int i=1 ; i<=num/2 ; i++){
            if (num%i ==0) {
                sum += i; 
            }
        }
        if(sum > num){
            System.out.println("Yes, The number is a Abundant Number");
        }
    }
}
