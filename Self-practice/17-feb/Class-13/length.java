
import java.util.*;

public class length {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size;

        System.out.print("Enter size : ");
        size = sc.nextInt();

        StringBuilder name[] = new StringBuilder[size];

        int sum = 0;
        System.out.println("\nEnter names:");
        for (int i = 0; i < size; i++) {

            name[i] = new StringBuilder(sc.next());
            sum += name[i].length();
        }

        System.out.println("Sum : " + sum);
    }
}
