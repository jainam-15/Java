import java.util.*;

public class email {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String email, username = "";

        System.out.print("Enter email : ");
        email = sc.next();

        for (int i = 0; i < email.length(); i++) {
            
            if(email.charAt(i) == '@') {
                break;

            } else {
                username += email.charAt(i);
            }
        }

        System.out.println("Username : " + username);
    }
}