
public class fibonacci {

    public static void fibonacci(int a, int b, int n, int i, int ans) {

        if (i == n) {

            ans = a + b;
            a = b;
            b = ans;
            System.out.print(", " + ans);
            return;
        }
        ans = a + b;
        a = b;
        b = ans;
        System.out.print(", " + ans);
        i++;
        fibonacci(a, b, n, i, ans);

    }

    public static void main(String[] args) {

        int a = 0, b = 1, i = 3, ans = 0;
        System.out.print(a + ", " + b);
        int n = 10;

        fibonacci(a, b, n, i, ans);
    }
}
