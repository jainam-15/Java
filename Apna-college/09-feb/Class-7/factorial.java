import java.util.*;

public class factorial {

    public static void factorial(int n) {

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial : " + fact);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter number : ");
        n = sc.nextInt();

        factorial(n);
    }
}