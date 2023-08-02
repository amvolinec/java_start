package prepear_for_exam.Paskaitos.komandine_eilute_15_uzduotes;
//Klasė Skaiciuotuvas su metodais: sudeti, atimti, dauginti, dalinti, dalybosLiekana.
//Papildomai: padaryti ją interaktyvią, t.y. Kad galima įvesti skaičius ir pasirinkti kokį veiksmą atlikti.

import java.util.Scanner;

public class Test_6_Skaiciuotuvas {
    public static int sk1;
    public static int sk2;
    public static int rezultatas;

    public static void pagrindinis() {
        System.out.println("Pasirinkite, ka norite atlikti: \n1 - sudeti\n2 - atimti\n3 - dauginti\n4 - dalinti\n5 - rasti dalybos liekana\n6 - ivesti kita skaiciu");
        Scanner sc = new Scanner(System.in);
        int skaicius = sc.nextInt();

        switch (skaicius) {
            case 1:
                sudeti();
                break;
            case 2:
                atimti();
                break;
            case 3:
                dauginti();
                break;
            case 4:
                dalinti();
                break;
            case 5:
                dalybosLiekana();
                break;
            case 6:
                ivesti();
                break;
            default:
                System.out.println("Neteisingas pasirinkimas, bandikite dar karta");
                pagrindinis();
                break;
        }
    }

    public static void ivesti() {
        System.out.println("Iveskite 2 skaicius: ");
        Scanner sc = new Scanner(System.in);
        sk1 = sc.nextInt();
        sk2 = sc.nextInt();
        pagrindinis();
        sc.close();
    }

    public static void sudeti() {
        rezultatas = sk1 + sk2;
        System.out.println("Rezultatas: " + rezultatas);
        pagrindinis();
    }

    public static void atimti() {
        rezultatas = sk1 - sk2;
        System.out.println("Rezultatas: " + rezultatas);
        pagrindinis();
    }

    public static void dauginti() {
        rezultatas = sk1 * sk2;
        System.out.println("Rezultatas: " + rezultatas);
        pagrindinis();
    }

    public static void dalinti() {
        rezultatas = sk1 / sk2;
        System.out.println("Rezultatas: " + rezultatas);
        pagrindinis();
    }

    public static void dalybosLiekana() {
        rezultatas = sk1 % sk2;
        System.out.println("Rezultatas: " + rezultatas);
        pagrindinis();
    }

    public static void main(String[] args) {
        Test_6_Skaiciuotuvas.ivesti();
    }
}
