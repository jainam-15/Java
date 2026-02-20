
import java.util.*;

public class power {

    public static void power(int x, int n, int pow) {

        if (n == 1) {
            pow *= x;
            System.out.print("Answer : " + pow);
            return;
        }
        pow *= x;
        power(x, (n - 1), pow);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pow = 1;
        int x;
        int n;

        System.out.print("Enter base : ");
        x = sc.nextInt();
        System.out.print("Enter Power : ");
        n = sc.nextInt();
        

        power(x, n, pow);

    }
}
