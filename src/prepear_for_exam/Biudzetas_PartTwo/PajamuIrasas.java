package prepear_for_exam.Biudzetas_PartTwo;


import java.time.LocalDate;

public class PajamuIrasas extends Irasas {
    private LocalDate laikas;
    private boolean pozymis;
    private String papInfo;

    public PajamuIrasas(double suma, int kategorija, LocalDate laikas, boolean pozymis, String papInfo) {
        super(suma, kategorija);
        this.laikas = laikas;
        this.pozymis = pozymis;
        this.papInfo = papInfo;
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
                "suma=" + super.getSuma() +
                "kategorija=" + super.getKategorija() +
                "laikas=" + laikas +
                ", pozymis=" + pozymis +
                ", papInfo='" + papInfo + '\'' +
                '}';
    }
}

