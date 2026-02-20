import java.util.*;

public class namesarray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String name[] = new String[5];

        System.out.println("Enter 5 names:");
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + ". ");
            name[i] = sc.next();
        }
        System.out.println("\nNames:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1) + ". " + name[i]);
        }
    }
}