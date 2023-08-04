package Exam;

public class Uzduotis2 {
    static int i = 19;

    static void mazink() {
        i--;
    }

    public static void main(String[] args) {
        mazink(); mazink();
        System.out.println(i);
    }

}
