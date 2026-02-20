import java.util.*;

public class palindrome {

    public static void palindrome(int num) {

        int n1 = num; 
        int rev = 0, rem;
        while(num!=0) {
            rem = num % 10;
            rev = rev*10 + rem;
            num/=10;
        }

        if(rev == n1) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter number : ");
        num = sc.nextInt();

        palindrome(num);
    }
}