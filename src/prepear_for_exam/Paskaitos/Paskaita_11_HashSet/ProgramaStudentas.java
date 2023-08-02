package prepear_for_exam.Paskaitos.Paskaita_11_HashSet;

import java.util.HashMap;
import java.util.Scanner;

public class ProgramaStudentas {
    public static void main(String[] main) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Studentas> hmap = new HashMap<Integer, Studentas>();
        System.out.println("[1] Ivesti studenta");
        System.out.println("[2] Ivesti studenta pagal numeri");
        System.out.println("[3] Baigti programa");
        switch (1) {
            case 1:
                System.out.println("Iveskite varda: ");
                String vardas = sc.next();
                System.out.println("Iveskite pavarde: ");
                String pavarde = sc.next();
                System.out.println("Iveskite studento numeri: ");
                String studNumeris = sc.next();
                System.out.println("Iveskite universiteta: ");
                String uneversitetas = sc.next();
                break;
            case 2:
                System.out.println("Iveskite studento numeri: ");
                Studentas reiksme1 = hmap.get(sc.nextInt());
                System.out.println("Vardas: " + reiksme1.getVardas() + "Pavarde: " + reiksme1.getPavarde() + "Universitetas: " + reiksme1.getUniversitetas());
                break;
            case 3:
                break;
        }

    }
}
