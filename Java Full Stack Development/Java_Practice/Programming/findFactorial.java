import java.util.Scanner;

public class findFactorial {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int fact = 1;
        while(n>1){
            fact *= n;
            n--;
        }
        System.out.println(fact);
    }
}
