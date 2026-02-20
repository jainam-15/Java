import java.util.*;

public class input {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.println(name);
        System.out.println("Hello, " + name);

        int a, b;
        System.out.println("Enter a : ");
        a = sc.nextInt();
        System.out.println("Enter b : ");
        b = sc.nextInt();

        System.out.println("Sum : " + (a + b));
        }
}