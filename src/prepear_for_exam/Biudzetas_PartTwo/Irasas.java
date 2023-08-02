package prepear_for_exam.Biudzetas_PartTwo;


public class Irasas {
    private double suma;
    private int kategorija;

    public Irasas(double suma, int kategorija) {
        this.suma = suma;
        this.kategorija = kategorija;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public int getKategorija() {
        return kategorija;
    }

    public void setKategorija(int kategorija) {
        this.kategorija = kategorija;
    }
}

