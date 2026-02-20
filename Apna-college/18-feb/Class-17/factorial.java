
public class factorial {

    public static void print(int n, int m, int fact) {

        if (n == m) {
            fact *= n;
            System.out.println(n);
            System.out.println("Factorial : " + fact);
            return;
        }
        fact *= n;
        System.out.println(n);
        print(n + 1, m, fact);

    }

    public static void main(String[] args) {

        int fact = 1;
        int n = 1;
        int m = 5;
        print(n, m, fact);

    }
}
