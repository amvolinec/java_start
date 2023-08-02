package prepear_for_exam.Paskaitos.Paskaita_12_Inheritage.Sample_one;

public class Asmuo {
    protected String vardas;
    protected String pavarde;
    protected String asmensKodas;

    public Asmuo(String vardas, String pavarde, String asmensKodas) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.asmensKodas = asmensKodas;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getAsmensKodas() {
        return asmensKodas;
    }

    public void setAsmensKodas(String asmensKodas) {
        this.asmensKodas = asmensKodas;

        Asmuo asmuo = new Asmuo("Petras", "Petraitis", "39901010000");
        System.out.println(String.format("Asmuo: %s%s%s", asmuo.getVardas(), asmuo.getPavarde(), asmuo.asmensKodas));
    }
    public String getInfo() {
        return String.format("%s-%s-%s", vardas, pavarde, asmensKodas);
    }
}

