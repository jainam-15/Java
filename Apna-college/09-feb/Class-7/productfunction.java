import java.util.*;

public class productfunction {

    public static int product(int a, int b) {
        int product;
        product = a*b;
        return product;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.print("Enter b : ");
        b = sc.nextInt();
        int product = product(a, b);
        System.out.print("Product : " + product);
    }
}