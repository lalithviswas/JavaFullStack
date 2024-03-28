//Automorphic
//If Square of a number also ends with the number

public class isAutomorphic {
    public static void main(String[] args) {
        int num = 25;
        int sqr = num*num;
        System.out.println(Automorphic(num, sqr));
    }
    public static boolean Automorphic(int num, int sqr){
        while(num>0){
            if(num%10 != sqr%10){
                return false;
            }
            num /= 10;
            sqr /= 10;
        }
        return true;
    }
}
