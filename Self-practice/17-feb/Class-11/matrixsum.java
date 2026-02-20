import java.util.*;

public class matrixsum {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int rows, columns;

        System.out.print("NUmber of rows : ");
        rows = sc.nextInt();

        System.out.print("Number of columns : ");
        columns = sc.nextInt();

        int mat[][] = new int[rows][columns];

        System.out.println("\nEnter numbers:");
        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < columns; j++) {
                
                mat[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        System.out.println("\nMatrix:");
        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < columns; j++) {
                
                System.out.print(mat[i][j] + " ");
                sum += mat[i][j];
            }
            System.out.println();
        }
        System.out.println("\nSum of matrix : " + sum);
    }
}