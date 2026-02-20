
import java.util.*;

public class count {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, ch, positive = 0, negative = 0, zero = 0;

        do {
            System.out.print("Enter number : ");
            num = sc.nextInt();

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }

            System.out.print("Enter another number? (1 for yes / 0 for no) : ");
            ch = sc.nextInt();

        } while (ch == 1);

        System.out.println("Positive : " + positive);
        System.out.println("negative : " + negative);
        System.out.println("Zero's : " + zero);

    }
}
