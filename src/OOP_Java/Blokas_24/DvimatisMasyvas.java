package OOP_Java.Blokas_24;

//Dvimatis masyvas
//        Masyvas 4x4 int tipo.
//        − Užpildome jį naudodami for, for ir random.nextInt(10). Išspausdiname rezultatą.

import java.util.Arrays;
import java.util.Random;

public class DvimatisMasyvas {
    static Random random = new Random();

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r();
            }
        }
        print(array);
    }

    static int r() {
        return random.nextInt(10);
    }

    static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(Arrays.toString(array[i]));
        }
    }
}
