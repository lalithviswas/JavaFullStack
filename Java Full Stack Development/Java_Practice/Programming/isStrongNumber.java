//Strong Number
//Sum of the factorials of the digits of the number is equal to the Number



public class isStrongNumber {
    public static void main(String[] args) {
        int num = 40585, num2 = num, sum = 0;
        while (num2>0) {
            int temp = num2%10;
            num2 /= 10;
            sum += findFactorial(temp);           
        }
        if (num == sum) {
            System.out.println(true);
        }        
    }
    public static int findFactorial(int n){
        int fact = 1;
        while(n>1){
            fact *= n;
            n--;
        }
        return fact;
    }
    
}
