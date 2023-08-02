package prepear_for_exam.Biudzetas_PartOne;

import java.time.LocalDate;

public class PajamuIrasas {
    private double suma;
    private int kategorija;
    private LocalDate laikas;
    private boolean pozymis;


    private String papInfo;

    public PajamuIrasas(double suma, int kategorija, LocalDate laikas, boolean pozymis, String papInfo) {
        this.suma = suma;
        this.kategorija = kategorija;
        this.laikas = laikas;
        this.pozymis = pozymis;
        this.papInfo = papInfo;
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

    public LocalDate getLaikas() {
        return laikas;
    }

    public void setLaikas(LocalDate laikas) {
        this.laikas = laikas;
    }

    public boolean isPozymis() {
        return pozymis;
    }

    public void setPozymis(boolean pozymis) {
        this.pozymis = pozymis;
    }

    public String getPapInfo() {
        return papInfo;
    }

    public void setPapInfo(String papInfo) {
        this.papInfo = papInfo;
    }

    @Override
    public String toString() {
        return "PajamuIrasas{" +
                "suma=" + suma +
                ", kategorija=" + kategorija +
                ", laikas=" + laikas +
                ", pozymis=" + pozymis +
                ", papInfo='" + papInfo + '\'' +
                '}';
    }

}
