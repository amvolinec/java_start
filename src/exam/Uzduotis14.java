package exam;

public class Uzduotis14 {
    static int i = 19;

    static void mazink() {
        i--;
    }

    public static void main(String[] args) {
        mazink(); mazink();
        System.out.println(i);
    }
}
