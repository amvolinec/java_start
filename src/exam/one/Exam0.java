package exam.one;

// Difference between static and non-static methods
public class Exam0 {
    public static void main(String[] args) {
        A a1 = new A();
        a1.a = 5;
        a1. setB(5);

        a1.print();
        A.show();

        A a2 = new A();
        a2.a = 6;
        a2. setB(6);

        System.out.println("a1.a " + a1.a);
        System.out.println("a2.a " + a2.a);
        System.out.println("a1.b " + a1.getB());

        A a3 = new A();

        System.out.println("a3.b " + a3.getB());

        a3.setB(8);
        System.out.println("a1.b " + a1.getB());
    }
}

class A {
    public int a = 0;
    private static int b = 0;
    public void print() {
        System.out.println("Hello world!");
    }

    public static void show(){
        System.out.println("I am a static method");
    }

    public void setB(int newB) {
        b = newB;
    }

    public int getB() {
        return b;
    }
}