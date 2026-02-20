import java.util.*;

public class power {

    public static void power(int base, int power) {

        int ans = 1;
        for (int i = 1; i <= power; i++) {
            ans*=base;
        }
        System.out.println("Answer : " + ans);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int base, power;

        System.out.print("Enter base : ");
        base = sc.nextInt();

        System.out.print("Enter power : ");
        power = sc.nextInt();

        power(base, power);
    }
}