//Harshad Number
//If sum of the digits of the number divides the number completely

public class isHarshadNumber {
    public static void main(String[] args) {
        int num = 18, sum = 0, num2 = num;
        while(num2>0){
            sum += num2%10;
            num2 /= 10;
        }
        if(num%sum == 0){
            System.out.println(true);
        }
    }
}
