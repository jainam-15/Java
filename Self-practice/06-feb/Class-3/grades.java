import java.util.*;

public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float marks;

        System.out.print("Enter marks : ");
        marks = sc.nextFloat();

        if(marks>= 90 && marks<=100) {
            System.out.print("Grade : A");
        } else if(marks>=75 && marks <90) {
            System.out.println("Grade : B");
        } else if(marks>=60 && marks<75) {
            System.out.print("Grade : C");
        } else if(marks>=40 && marks <60) {
            System.out.print("Grade : D");
        } else if(marks<40) {
            System.out.println("Grade : Fail");
        } else {
            System.out.println("Invalid marks");
        }
    }
}