import java.util.*;
public class prime {

    public static void prime(int num) {

        int prime = 0;

        for (int i = 1; i <= num; i++) {
            if(num % i == 0) {
                prime++;
            }
        }

        if(prime == 2) {
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter number : ");
        num = sc.nextInt(); 

        prime(num);
    }
}