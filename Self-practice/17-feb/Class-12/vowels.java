
import java.util.*;

public class vowels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str;
        int vowels = 0;

        System.out.print("Enter string : ");
        str = sc.next();

        for (int i = 0; i < str.length(); i++) {

            if ((str.charAt(i) == 'a'
                    || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u')) {

                vowels++;
            }
        }

        System.out.println("Vowels : " + vowels);
    }
}
