import java.util.*;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];

        for(int i = 0; i < 3; i++) {
            System.out.println("Enter num" + (i+1) + " : ");
            num[i] = sc.nextInt();
        }

        if(num[0] > num[1] && num[0] > num[2]) {
            System.out.println("Num1 is greater");
        } else if (num[1] > num[0] && num[1] > num[2]) {
            System.out.println("Num2 is greater");
        } else if(num[2] > num[0] && num[2] > num[1]) {
            System.out.println("Num3 is greater");
        } else {
            System.out.println("All are equal");
        }
    }
}