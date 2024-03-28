//Perfect Number:
//If Sum of its divisors is equal to the number

public class isPerfectNumber {
    public static void main(String[] args) {
        int num = 496;
        int sum = 0;
        for(int i=1 ; i<=num/2 ; i++){
            if(num%i == 0){
                sum += i;
            }
        }
        if(num == sum)System.out.println("Yes, the given number is a Perfect Number");
    }
}
