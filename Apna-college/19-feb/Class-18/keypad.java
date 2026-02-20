import java.util.*;

public class keypad {

    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void print(String str, int idx, String comb) {

         if(idx == str.length()) {
            System.out.println(comb);
            return;
        }

        char currchar = str.charAt(idx);
        String mapping = keypad[currchar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            print(str, idx+1, comb+mapping.charAt(i));
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        String str;
        System.out.print("Enter number(0-9) : ");
        str = sc.next();
        print(str, 0, "");

    }
}