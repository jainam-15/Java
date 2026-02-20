

public class pattern14 {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 8; i++) {
            
            for (int j = 1; j <= 7; j++) {
                
                if ((j == 4) || (i == 4 || i == 5) || (i == 2 && j > 2 && j < 6) || (i == 3 && j > 1 && j < 7) || (i == 7 && j > 2 && j < 6) || (i == 6 && j > 1 && j < 7)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            } System.out.println();
        }
    }
}