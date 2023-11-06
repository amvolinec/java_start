package NovemberSixExam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.util.Date;
import java.util.Locale;

public class SecondTask {

    private static final int today = LocalDate.now().getDayOfMonth();

    public static int arraySize() {
        int size;
        return Math.round((8511 - today) / 5 + 5);
    }

    private static int array[] = new int[arraySize()];

    public static void printEachNumberAfterSubstracting() {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = today + a;
            a += 20;

            System.out.println(array[i] - today + 20);
        }
    }

    private static void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] - today);
        }
    }

    private static void printEachNumberWhile() {
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i] - today);
            i++;
        }
    }

    private static void printEachNumberDoWhile() {
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
        printEachNumberAfterSubstracting();
        print();
        printEachNumberWhile();
        printEachNumberDoWhile();
        printForEach();
    }
}

