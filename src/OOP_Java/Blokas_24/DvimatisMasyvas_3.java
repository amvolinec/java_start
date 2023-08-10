package OOP_Java.Blokas_24;

//Dvimatis masyvas
//        Masyvas 4x4 int tipo.
//        − Užpildome for Arrays.fill(m, random.nextInt(10)). Išspausdinti rezultatą.

import java.util.Arrays;
import java.util.Random;

public class DvimatisMasyvas_3 {
    static Random random = new Random();

    public static void main(String[] args) {
        int[][] array = new int[5][5];
            for (int i = 0; i< array.length;i++){
                Arrays.fill(array[i], r());
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
