import java.util.*;

public class findFibonacci{
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(1);
        
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i=1 ; i<n ; i++){
            int a = al.get(i);
            int b = al.get(i-1);
            al.add(a+b);
        }
        for(int i=0 ; i<n ; i++){
            System.out.print(al.get(i) + " ");
        }
        
    }
}
