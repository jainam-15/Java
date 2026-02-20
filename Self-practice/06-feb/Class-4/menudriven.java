
import java.util.*;

public class menudriven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ch;
        float m1;

        do {

            System.out.println("1. Enter marks");
            System.out.println("0. Stop");
            System.out.print("Enter choice : ");
            ch = sc.nextInt();

            if(ch == 1){
                System.out.println("Enter marks 1 : ");
                m1 = sc.nextFloat();
                
                if(m1>=90 && m1<=100) {
                    System.out.println("This is good\n");
                } else if(m1>=60 && m1<90) {
                    System.out.println("This is also good\n");
                } else if(m1>=0 && m1 <60) {
                    System.out.println("This is good as well\n");
                } else {
                    System.out.println("Invalid Marks\n");
                }
            } else if(ch == 0) {
                break;
            } else {
                System.out.println("Invalid choice\n");
            }
        } while (ch != 0);

    }
}
