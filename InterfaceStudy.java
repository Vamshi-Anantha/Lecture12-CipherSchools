interface shape {
    double pi = 3.14; // public, static, final

    double getSquare(double r);// public and abstract
}

class circle implements shape {
    public double getSquare(double r) {
        return r * r;
    }

    void fun() {
        System.out.println("hey, I implemented an interface named Shape");
    }
}

public class InterfaceStudy {
    public static void main(String args[]) {
        circle c = new circle();
        System.out.println(c.getSquare(5));
        c.fun();
    }
}