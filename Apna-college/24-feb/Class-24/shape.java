class shapes {
    public void area() {
        System.out.println("displays area");
    }
}

class triangle extends shapes {
    public void area(int l, int h) {
        System.out.println(0.5*(l*h));
    }
}

// class eqitriangle

public class shape {

    public static void main(String[] args) {
        
        triangle t1 = new triangle();

        t1.area(10, 10);
        
    }
}