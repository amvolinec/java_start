package prepear_for_exam.Paskaitos.testai;
public class SuperTest {
    String b;

    public SuperTest(){
        this("labas");
        System.out.println("SuperTest konstruktoriuje");
    }

    public  SuperTest(String c) {
        b=c;
        System.out.println("SuperTest su String konstruktoriuje");
    }

    public static void main (String [] args) {
        SuperTest e = new SuperTest();
        e.d();
        SuperTest f = new SuperTest("g");
        f.d();
        H.h();
        new J();
    }

    void d(){
        System.out.println(b);
    }
}

class H{
    static void h(){
        System.out.println("j");
    }
}

class J {
    J(){
    System.out.println("J konstruktoriuje");
    new SuperTest();
    }
}
