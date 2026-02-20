import java.util.*;

public class matrix {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int rows, columns;

        System.out.print("Enter number of rows : ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        columns = sc.nextInt();

        int matrix[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < columns; j++) {
                
                System.out.printf("Enter [%d][%d] : ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix:");
        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < columns; j++) {
                
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}