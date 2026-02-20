import java.util.*;

public class sumofodd {

    public static void sumofodd(int num) {

        int sum = 0;
        System.out.println("Odd numbers between 1 to " + num);
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
            if(i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of odd numbers : " + sum);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter number : ");
        num = sc.nextInt();

        sumofodd(num);
    }
}