import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, sum = 0;

        System.out.print("Enter number : ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            sum+=i;
        }
        System.out.println("Sum is : " + sum);
    }
}