import java.util.*;

public class gcd {

    public static void gcd(int a, int b) {

        int temp;
        while(b!=0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD : " + a);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Enter num1 : ");
        a = sc.nextInt();
        System.out.print("Enter num2 : ");
        b = sc.nextInt();

        gcd(a, b);

    }
}