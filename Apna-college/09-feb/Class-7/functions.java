import java.util.*;

public class functions {

    public static void printname(String name) {
        System.out.println("My name is " + name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;

        System.out.print("Enter name - ");
        name = sc.nextLine();

        printname(name);
    }
}