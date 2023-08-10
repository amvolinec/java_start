package prepear_for_exam.Test;

public class Asmuo {
    String Vardas;
    String Pavarde;
    String GimimoMetai;
    static int SukurtuAsmenuSkaicius = 0;

    public Asmuo() {
        System.out.println("Sukurtas naujas asmuo!");
        SukurtuAsmenuSkaicius++;
    }

    public Asmuo(String vardas, String pavarde, String gimimoMetai) {
        this.Vardas = vardas;
        this.Pavarde = pavarde;
        this.GimimoMetai = gimimoMetai;
        System.out.println("Sukurtas naujas asmuo!");
        SukurtuAsmenuSkaicius++;
    }

    public String getVardas() {
        return Vardas;
    }

    public void setVardas(String vardas) {
        Vardas = vardas;
    }

    public String getPavarde() {
        return Pavarde;
    }

    public void setPavarde(String pavarde) {
        Pavarde = pavarde;
    }

    public String getGimimoMetai() {
        return GimimoMetai;
    }

    public void setGimimoMetai(String gimimoMetai) {
        GimimoMetai = gimimoMetai;
    }

    public void pakeistiPavarde(String NaujaPavarde) {
        Pavarde = NaujaPavarde;
    }

    public void spausdintiInformacija() {
        System.out.println(Vardas + " " + Pavarde + " " + GimimoMetai + " g.m.");
    }

    public void kiekSukurtaAsmenu() {
        System.out.println("Kiek buvo sukurta asmenų: " + SukurtuAsmenuSkaicius);
    }
}
