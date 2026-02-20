import java.util.*;

public class switchb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int button;

        System.out.print("Enter choice(1-3) : ");
        button = sc.nextInt();

       switch(button){
            case 1 -> System.out.println("Hello");
            case 2 -> System.out.println("Namaste");
            case 3 -> System.out.println("Bonjour");
            default -> System.out.println("Invalid choice");
       }
    }
}