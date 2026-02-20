import java.util.*;

public class table {

    public static void table(int num) {
        
        for (int i = 1; i <= 10; i++){

            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter number : ");
        num = sc.nextInt();

        table(num);
    }
}