class student {
    String name;
    int age;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    student(String name, int age) {

        this.name = name;
        this.age = age;
    }
}

public class classes {

    public static void main(String[] args) {
        student s1 = new student("jainam", 19);

        s1.printinfo();
    }
}