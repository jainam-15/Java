import java.util.*;

public class sumofarray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num[] = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("- ");
            num[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum+=num[i];
        }   

        System.out.println("Sum : " + sum);
    }
}