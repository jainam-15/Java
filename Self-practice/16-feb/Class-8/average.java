import java.util.*;

public class average {

    public static void average(int num1, int num2, int num3) {
        int avg;
        avg = (num1 + num2 + num3) / 3;

        System.out.println("Average : " + avg);
    }
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Enter num1 : ");
        num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        num2 = sc.nextInt();
        System.out.print("Enter num3 : ");
        num3 = sc.nextInt();

        average(num1, num2, num3);
    }
}