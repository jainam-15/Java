
import java.util.*;

public class greater {

    public static void greater(int num1, int num2) {

        if (num1 > num2) {
            System.out.println(num1 + " is greater");

        } else if (num2 > num1) {

            System.out.println(num2 + " is greater");
        } else {
            System.out.println("Both are equal");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Enter num1 : ");
        num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        num2 = sc.nextInt();

        greater(num1, num2);

    }
}
