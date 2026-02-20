import java.util.*;

public class circumferenceofcircle {

    public static void circum(float radius) {

        System.out.printf("Circumference of circle is %.2f", 2 * (3.14 * radius));

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        float radius;

        System.out.print("Enter radius : ");
        radius = sc.nextFloat();

        circum(radius);
    }
}