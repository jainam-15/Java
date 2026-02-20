import java.util.*;

public class reverse {

    public static void reverse(int num) {

        int rev = 0, rem;

        while(num!=0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num/=10;
        }
        System.out.println("Reverse : "+rev);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Enter number : ");
        num = sc.nextInt();

        reverse(num);
    }
}