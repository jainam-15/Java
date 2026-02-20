import java.util.*;

public class even {

    public static void check(int num) {

        if(num % 2 == 0) {
            System.out.print(num + " is even");
        } else {
            System.out.print(num + " is odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter number : ");
        num = sc.nextInt();

        check(num);
    }
}