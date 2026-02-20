import java.util.*;

public class vowels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder();
        int vowels = 0;

        System.out.print("Enter string : ");
        str.append(sc.next());

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
        }

        System.out.println("Vowels : " + vowels);
    }
}
