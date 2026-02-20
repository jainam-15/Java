import java.util.*;

public class removespaces {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str, newstr = "";
        
        System.out.print("Enter string : ");
        str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            
            if(str.charAt(i) != ' ') {
                newstr += str.charAt(i);
            }
        }

        System.out.println("Without spaces : " + newstr);
    }
}