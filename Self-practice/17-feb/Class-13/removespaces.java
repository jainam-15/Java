import java.util.*;

public class removespaces {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder();
        StringBuilder newstr = new StringBuilder("");
        
        System.out.print("Enter string : ");
        str.append(sc.nextLine());

        for (int i = 0; i < str.length(); i++) {
            
            if(str.charAt(i) != ' ') {
                newstr.append(str.charAt(i));
            }
        }

        System.out.println("Without spaces : " + newstr);
    }
}