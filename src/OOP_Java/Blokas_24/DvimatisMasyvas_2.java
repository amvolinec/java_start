package OOP_Java.Blokas_24;

//Dvimatis masyvas
//        Masyvas 4x4 int tipo.
//        − Užpildome inicijavimo metu (random.nextInt(10)). Išspausdinti rezultatą.

import java.util.Arrays;
import java.util.Random;

public class DvimatisMasyvas_2 {
    static Random random = new Random();

    public static void main(String[] args) {
        int[][] array = {
                {r(), r(), r(), r(), r()}, {r(), r(), r(), r(), r()}, {r(), r(), r(), r(), r()}, {r(), r(), r(), r(), r()}, {r(), r(), r(), r(), r()}
        };
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

