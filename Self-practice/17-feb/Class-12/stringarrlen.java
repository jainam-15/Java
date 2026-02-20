import java.util.*;

public class stringarrlen {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int size;

        System.out.print("Enter size : ");
        size = sc.nextInt();

        String names[] = new String[size];

        System.out.println("Enter names:");

        int len = 0;
        for (int i = 0; i < size; i++) {
            
            names[i] = sc.next();
            len += names[i].length();
        }

        System.out.println("\nNames:");

        for (int i = 0; i < size; i++) {
            
            System.out.println(names[i]);
        }

        System.out.println("Total size : " + len);
    }
}