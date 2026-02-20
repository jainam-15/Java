import java.util.*;

public class sumfunction {

    public static void sumfunction(int a, int b) {
        System.out.println("Sum : " + (a+b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.print("Enter b : ");
        b = sc.nextInt();
        sumfunction(a, b);
    }
}