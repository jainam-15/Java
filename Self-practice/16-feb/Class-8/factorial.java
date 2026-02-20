import java.util.*;

public class factorial {

    public static void fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial : " + fact);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter number : ");
        num = sc.nextInt();

        fact(num);
    }
}