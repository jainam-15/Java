import java.util.*;

public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter n : ");
        n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
            i++;
        }
    }
}