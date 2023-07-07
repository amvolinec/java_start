package classesAndMethods.startOne;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        printLineOne();
    }

    public static void printLineOne() {
        System.out.println("Pirmas metodas");
        printLineTwo();
    }

    public static void printLineTwo() {
        System.out.println("Antras metodas");
        printLineThree();
    }

    public static void printLineThree() {
        System.out.println("Trečias metodas");
    }
}