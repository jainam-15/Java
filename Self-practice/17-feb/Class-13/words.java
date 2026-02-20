import java.util.*;

public class words {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder();
        int spaces = 1;

        System.out.println("Enter Sentence : ");
        str.append(sc.nextLine());

        for (int i = 0; i < str.length(); i++) {
            
            if(str.charAt(i) == ' ') {
                spaces++;
            }
        }

        System.out.println("Total words : " + spaces);
    }
}