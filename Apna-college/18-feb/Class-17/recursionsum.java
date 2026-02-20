
public class recursionsum {

    public static void print(int n, int m, int sum) {

        if (n == m) {
            sum += n;
            System.out.println(n);
            System.out.println("Sum : " + sum);
            return;
        }
        sum+=n;
        System.out.println(n);
        print(n + 1, m, sum);

    }

    public static void main(String[] args) {

        int sum = 0;
        int n = 1;
        int m = 10;
         print(n, m, sum);

    }
}
