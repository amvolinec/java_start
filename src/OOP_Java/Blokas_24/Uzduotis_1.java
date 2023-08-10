package OOP_Java.Blokas_24;
//
//− Sukurkite programą, kuri paprašytų įvesti savaitės dienos pavadinimą ir išspausdintų:
//        − Kelinta savaitės diena;
//        − Jei savaitės dienos pavadinimas netinkamas, programa turi paprašyti vėl įvesti savaitės dieną;
//        − Panaudokite savaitės dienų masyvą, elementus priskirkite inicijuojant masyvą.
//        − Masyvą inicijuoti:
//        − Deklaruojant kintamąjį;
//        − Po vieną elementą.

import java.util.Scanner;

public class Uzduotis_1 {
    public static void main(String[] args) {
        //String [] savaitesDienos = {"Pirmadienis", "Antradinis", "Treciadienis", "Ketvirtadienis", "Penktadienis", "Sestadienis", "Sekmadienis"};
        String[] savaitesDienos = new String[7];
        savaitesDienos[0] = "Pirmadienis";
        savaitesDienos[1] = "Antradienis";
        savaitesDienos[2] = "Treciadienis";
        savaitesDienos[3] = "Ketvirtadienos";
        savaitesDienos[4] = "Penktadienis";
        savaitesDienos[5] = "Sestadienis";
        savaitesDienos[6] = "Sekmadienis";
        Scanner sc = new Scanner(System.in);
        boolean a = true;
        while (a) {
            System.out.print("Iveskite savaites diena: ");
            String diena = sc.nextLine();
            for (int i = 0; i < 7; i++) {
                if (diena.equals(savaitesDienos[i])) {
                    System.out.print(i + 1);
                    a = false;
                }
            }
            if (a) {
                System.out.println("Jus ivedete neteisinga savaites diena");
            }
        }
    }
}
