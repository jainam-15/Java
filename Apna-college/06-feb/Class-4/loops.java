
public class loops {
    public static void main(String[] args) {

        System.out.println("For loop");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("\nWhile loop");
        int i = 1;
        while(i <= 10) {
            System.out.print(i +"\n");
            i++;
        }
        System.out.println("\n");
        System.out.println("Do loop");
        int j = 1;
        do { 
            System.out.print(j +"\n");
            j++;
        } while (j <= 10);
    }
}