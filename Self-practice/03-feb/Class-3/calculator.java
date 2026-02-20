import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;
        char ch;

        System.out.print("Enter num1 : ");
        num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        num2 = sc.nextInt();

        System.out.print("Enter action : ");
        ch = sc.next().charAt(0);

        switch(ch) {
            case '+' -> System.out.println("Sum : " + (num1 + num2));
            case '-' -> System.out.println("Diff : " + (num1 - num2));
            case '*' -> System.out.println("multi : " + (num1 * num2));
            case '/' -> System.out.println("Div : " + (num1 / num2));
            case '%' -> System.out.println("Modulus : " + (num1 % num2));
            default -> System.out.println("Invalid action");
        }
    }
}