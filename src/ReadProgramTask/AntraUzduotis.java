package ReadProgramTask;

import java.time.LocalDate;
import java.time.MonthDay;
import java.util.Date;
import java.util.Locale;

public class AntraUzduotis {
    private static final int today = LocalDate.now().getDayOfMonth();

    public static int sizeOfArray() {
        int size;
        return Math.round((50 - today) / 3 + 3);
    }

    private static int array[] = new int[sizeOfArray()];

    public static void populate() {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = today + a;
            a += 3;
        }
    }

    private static void print() {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] - today);
        }

    }

    private static void printWhile() {
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i] - today);
            i++;
        }
    }

    private static void printDoWhile() {
        int i = 0;
        do {
            System.out.println(array[i] - today);
            i++;
        } while (i < array.length);
    }

    private static void printForEach() {
        for (int i : array
        ) {
            System.out.println(i - today);
        }
    }

    public static void main(String[] args) {
        populate();
//        print();
//        printWhile();
//        printDoWhile();
        printForEach();
    }

}
