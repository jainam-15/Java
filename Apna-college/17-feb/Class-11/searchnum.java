
import java.util.*;

public class searchnum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows, columns;

        System.out.print("Number of rows : ");
        rows = sc.nextInt();
        System.out.print("Number of columns : ");
        columns = sc.nextInt();

        int nums[][] = new int[rows][columns];

        System.out.println("Enter numbers:");
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                nums[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix:");
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        int search;

        System.out.print("Enter number to search : ");
        search = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < columns; j++) {
                
                if (nums[i][j] == search) {
                    System.out.printf("\nNumber found on index [%d][%d]", i, j);   
                }
            }
        }
    }
}
