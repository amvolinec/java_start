package NovemberSixExam;

import java.time.LocalDate;

public class SecondTask {

    private static final int today = LocalDate.now().getDayOfMonth();

    private static final int month = LocalDate.now().getMonthValue();

    public static int arraySize() {
        return Math.round((8511 - today) / 5);
    }

    private static int array[] = new int[arraySize()];

    public static void initArray() {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = today + a;
            a += 5;
        }
    }

    private static void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] - month + 20);
        }
    }

    private static void printEachNumberWhile() {
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i] - month + 20);
            i++;
        }
    }

    private static void printEachNumberDoWhile() {
        int i = 0;
        do {
            System.out.println(array[i] - month + 20);
            i++;
        } while (i < array.length);
    }

    private static void printForEach() {
        for (int i : array
        ) {
            System.out.println(i - month + 20);
        }
    }

    public static void main(String[] args) {
        initArray();
        print();
        printEachNumberWhile();
        printEachNumberDoWhile();
        printForEach();
    }
}

