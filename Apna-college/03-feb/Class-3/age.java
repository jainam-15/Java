import java.util.*;

public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;

        System.out.print("Enter age : ");
        age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not adult");
        }
    }
}