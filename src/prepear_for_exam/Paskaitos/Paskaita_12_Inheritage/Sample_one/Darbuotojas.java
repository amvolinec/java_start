package prepear_for_exam.Paskaitos.Paskaita_12_Inheritage.Sample_one;

public class Darbuotojas extends Asmuo{
    protected String socDraudimoNr;

    public Darbuotojas(String vardas, String pavarde, String asmensKodas, String socDraudimoNr) {
        super(vardas, pavarde, asmensKodas);
        this.socDraudimoNr = socDraudimoNr;
    }

    public String getSocDraudimoNr() {
        return socDraudimoNr;
    }

    public void setSocDraudimoNr(String socDraudimoNr) {
        this.socDraudimoNr = socDraudimoNr;
        Asmuo darbuotojas = new Darbuotojas("Mantas", "Mantauskas", "39901012222", "333");
        //System.out.println(String.format("Darbuotojas: %s%s%s%s", darbuotojas.getVardas(), darbuotojas.getPavarde(), darbuotojas.asmensKodas, darbuotojas.getSocDraudimoNr()));
        System.out.println(darbuotojas.getInfo());
    }
    @Override
    public String getInfo() {
        return String.format("%s", socDraudimoNr);
    }
}
