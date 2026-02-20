
public class pattern11 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 9; j++) {

                if ((i == 1 && j > 4) || (i == 2 && j > 3 && j < 9) || (i == 3 && j > 2 && j < 8) || (i == 4 && j > 1 && j < 7) || (i == 5 && j < 6)) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
