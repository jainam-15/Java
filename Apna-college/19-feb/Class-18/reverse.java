import java.util.*;

public class reverse {

    public static void reverse(String str, int i) {

        if (i < 0) {
            return;
        }
        System.out.print(str.charAt(i));
        reverse(str, i-1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;

        System.out.print("Enter string : ");
        str = sc.nextLine();

        int i = str.length() - 1;

        reverse(str, i);

    }
}
