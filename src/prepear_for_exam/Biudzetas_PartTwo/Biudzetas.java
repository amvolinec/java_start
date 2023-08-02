package prepear_for_exam.Biudzetas_PartTwo;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Biudzetas {
    static final int SIZE = 100;
    ArrayList<PajamuIrasas> pajamos = new ArrayList<>();
    ArrayList<IslaiduIrasas> islaidos = new ArrayList<>();
    int pi = 0; //pajamu index;
    int ij = 0; //islaidu index;

    public void pridetiPajamuIrasa(double suma, int kategorija, LocalDate now, boolean pozymis, String papInfo) {
        PajamuIrasas pajamuIrasai = new PajamuIrasas(suma, kategorija, now, pozymis, papInfo);
        if (pi < SIZE) {
            pajamos.add(pajamuIrasai);
            pi++;
        } else {
            System.out.println("Pajamu islaidu orderis pilnas");
        }
    }

    public void pridetiIslaiduIrasa(double suma, int kategorija, LocalDateTime laikas, String budas, String bankoKortele) {
        IslaiduIrasas islaiduIrasai = new IslaiduIrasas(suma, kategorija, laikas, budas, bankoKortele);
        if (ij < SIZE) {
            islaidos.add(islaiduIrasai);
            ij++;
        } else {
            System.out.println("Islaidu orderis pilnas");
        }

    }

    public PajamuIrasas gautiPajamuIrasa(double suma, int kategorija) {
        for (int i = 0; i < pi; i++) {
            if ((suma == pajamos.get(i).getSuma()) && (pajamos.get(i).getKategorija() == kategorija)) {
                return pajamos.get(i);
            }
        }
        return null;
    }

    public IslaiduIrasas gautiIslaiduIrasa(double suma, String budas) {
        for (int j = 0; j < ij; j++) {
            if (islaidos.get(j).getSuma() == suma && islaidos.get(j).getBudas().equals(budas)) {
                return islaidos.get(j);
            }
        }
        return null;
    }

    public void atspausdintiPajamas() {
        for (PajamuIrasas i : pajamos) {
            System.out.println(pajamos);
        }
//        for (PajamuIrasas i : pajamos) {
//            System.out.println(i);
//        } Taip neveiks, spausdins visa 100 uzimtu vietu su saugoma vieta;
    }

    public void atspausdintiIslaidas() {

        for (IslaiduIrasas j : islaidos) {
            System.out.println(islaidos);
        }
    }

    public double checkBalance() {
        double pajamuSuma = 0;
        double islaiduSuma = 0;
        for (PajamuIrasas i : pajamos) {
            pajamuSuma += i.getSuma();
        }
        for (IslaiduIrasas i : islaidos) {
            islaiduSuma += i.getSuma();
        }
        return (pajamuSuma - islaiduSuma);
    }
}
