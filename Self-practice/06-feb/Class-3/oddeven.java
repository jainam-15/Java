import java.util.*;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter number : ");
        num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.print("The number is even");
        } else if(num % 2 != 0) {
            System.out.print("The number is odd");
        }
    }
}