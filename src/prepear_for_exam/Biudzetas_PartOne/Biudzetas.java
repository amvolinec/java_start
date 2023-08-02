package prepear_for_exam.Biudzetas_PartOne;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Biudzetas {
    static final int SIZE = 100;
    PajamuIrasas[] pajamos = new PajamuIrasas[SIZE];
    IslaiduIrasas[] islaidos = new IslaiduIrasas[SIZE];
    int pi = 0; //pajamu index;
    int ij = 0; //islaidu index;

    public void pridetiPajamuIrasa(double suma, int kategorija, LocalDate now, boolean pozymis, String papInfo) {
        PajamuIrasas pajamuIrasai = new PajamuIrasas(suma, kategorija, now, pozymis, papInfo);
        if (pi < SIZE) {
            pajamos[pi] = pajamuIrasai;
            pi++;
        } else {
            System.out.println("Pajamu islaidu orderis pilnas");
        }
    }

    public void pridetiIslaiduIrasa(double suma, int kategorija, LocalDateTime laikas, String budas, String bankoKortele) {
        IslaiduIrasas islaiduIrasai = new IslaiduIrasas(suma, kategorija, laikas, budas, bankoKortele);
        if (ij < SIZE) {
            islaidos[ij] = islaiduIrasai;
            ij++;
        } else {
            System.out.println("Islaidu orderis pilnas");
        }

    }

    public PajamuIrasas gautiPajamuIrasa(double suma, int kategorija) {
        for (int i = 0; i < pi; i++) {
            if (pajamos[i].getSuma() == suma && pajamos[i].getKategorija() == kategorija) {
                return pajamos[i];
            }
        }
        return null;
    }

    public IslaiduIrasas gautiIslaiduIrasa(double suma, String budas) {
        for (int j = 0; j < ij; j++) {
            if (islaidos[j].getSuma() == suma && islaidos[j].getBudas().equals(budas)) {
                return islaidos[j];
            }
        }
        return null;
    }

    public void atspausdintiPajamas() {
        for (int i = 0; i < pi; i++) {
            System.out.println(pajamos[i]);
        }
//        for (PajamuIrasas i : pajamos) {
//            System.out.println(i);
//        } Taip neveiks, spausdins visa 100 uzimtu vietu su saugoma vieta;
    }

    public void atspausdintiIslaidas() {

        for (int j = 0; j < ij; j++) {
            System.out.println(islaidos[j]);
        }
    }
}

