
abstract class animal {

    abstract void walk();

    public void eat() {
        System.out.println("Animal eats");
    }
}

class horse extends animal {

    public void walk() {
        System.out.println("Walk on 4 legs");
    }
}

class hen extends animal {

    public void walk() {

        System.out.println("Walk on 2 legs");
    }
}

public class oops {

    public static void main(String[] args) {
        horse h = new horse();
        h.walk();
        h.eat();

        hen h1 = new hen();
        h1.walk();
        h1.eat();

    }
}
