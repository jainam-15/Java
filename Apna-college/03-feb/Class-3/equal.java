import java.util.*;

public class equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.print("Enter b : ");
        b = sc.nextInt();

        if(a>b) {
            System.out.println("A is greater");
        } else if(b>a) {
            System.out.println("B is greater");
        } else {
            System.out.println("Both are equal");
        }
    }
}