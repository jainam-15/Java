import java.util.*;

public class searcharray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int number[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter num" + (i+1) + " : ");
            number[i] = sc.nextInt();
        }

        int searchnum;

        System.out.print("Enter number to search : ");
        searchnum = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            if(number[i] == searchnum) {
                System.out.println("Number is found at index " + i);
            }
        }
    }
}