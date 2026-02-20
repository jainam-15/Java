import java.util.*;

public class fibonacci {

    public static void series(int n) {

        int n1 = 0, n2 = 1, ans;
        System.out.print(n1 +", "+ n2);
        for (int i = 1; i <= n; i++) {
            ans = n1 + n2;
            n1 = n2;
            n2 = ans;
            System.out.print(", " + ans);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter number : ");
        n = sc.nextInt();

        series(n);
    }
}