package prepear_for_exam.Biudzetas_PartTwo;



import java.time.LocalDateTime;

public class IslaiduIrasas extends Irasas {

    private LocalDateTime laikas;
    private String budas;
    private String bankoKortele;

    public IslaiduIrasas(double suma, int kategorija, LocalDateTime laikas, String budas, String bankoKortele) {
        super(suma, kategorija);
        this.laikas = laikas;
        this.budas = budas;
        this.bankoKortele = bankoKortele;
    }


    public LocalDateTime getLaikas() {
        return laikas;
    }

    public void setLaikas(LocalDateTime laikas) {
        this.laikas = laikas;
    }

    public String getBudas() {
        return budas;
    }

    public void setBudas(String budas) {
        this.budas = budas;
    }

    public String getBankoKortele() {
        return bankoKortele;
    }

    public void setBankoKortele(String bankoKortele) {
        this.bankoKortele = bankoKortele;
    }

    @Override
    public String toString() {
        return String.format("IslaiduIrasas: suma %f, kategorija %d, iraso laikas %s, islaidu budas %s ir korteles numeris %s",
                super.getSuma(), super.getKategorija(), laikas, budas, bankoKortele);
    }
}

