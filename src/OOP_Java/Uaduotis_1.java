package OOP_Java;

import java.util.Random;
import java.util.Scanner;

public class Uaduotis_1 {
    static Scanner sc = new Scanner(System.in);

    static void work() {
        boolean run = true;
        while (run) {

            System.out.println("A: Sugeneruoti atsitiktini skaicius 1 - 100\nB: Sugeneruoti 10 atsitiktniu skaiciu\nE:Baigti");
            String pasirinkimas = sc.next();
            switch (pasirinkimas) {
                case "A":
                    int skaicius = (int) (Math.random() * 10) + 1;
                    System.out.println("Atsitiktinis skaicius:" + skaicius);
                    break;
                case "B":
                    int i = 0;
                    while (i < 10) {
                        int skaiciai = (int) (Math.random() * 10) + 1;
                        System.out.println(skaiciai);
                        i++;
                    }
                    break;
                case "E":
                    run = false;
            }
        }
    }

    static void work2() {
        boolean run = true;
        do {
            System.out.println("A: Sugeneruoti atsitiktini skaicius 1 - 100\nB: Sugeneruoti 10 atsitiktniu skaiciu\nE:Baigti");
            String pasirinkimas = sc.next();
            switch (pasirinkimas) {
                case "A":
                    int skaicius = (int) (Math.random() * 10) + 1;
                    System.out.println("Atsitiktinis skaicius:" + skaicius);
                    break;
                case "B":
                    int i = 0;
                    do {
                        int skaiciai = (int) (Math.random() * 10) + 1;
                        System.out.println(skaiciai);
                        i++;
                    } while (i < 10);
                    break;
                case "E":
                    run = false;
            }
        } while (run);
    }

    static void work3() {
        for (;;) {
            System.out.println("A: Sugeneruoti atsitiktini skaicius 1 - 100\nB: Sugeneruoti 10 atsitiktniu skaiciu\nE:Baigti");
            String pasirinkimas = sc.next();
            switch (pasirinkimas) {
                case "A":
                    int skaicius = (int) (Math.random() * 10) + 1;
                    System.out.println("Atsitiktinis skaicius:" + skaicius);
                    break;
                case "B":
                    int j = 0;
                    for (int i = 0; j < 10; j++) {
                        int skaiciai = (int) (Math.random() * 10) + 1;
                        System.out.println(skaiciai);
                        i++;
                    }
                case "E":
                    return;
            }
        }
    }
}
