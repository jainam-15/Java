import java.util.*;

public class replace {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str, result = "";

        System.out.print("Enter string : ");
        str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            
            if(str.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += str.charAt(i);
            }
        }

        System.out.println("Result : " + result);
    }
}