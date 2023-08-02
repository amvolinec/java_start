package prepear_for_exam.Paskaitos.Paskaita_12_Inheritage.Sample_one;

public class ImonesXDarbuotojas extends Darbuotojas {
    protected String xNr;

    public ImonesXDarbuotojas(String vardas, String pavarde, String asmensKodas, String socDraudimoNr, String xNr) {
        super(vardas, pavarde, asmensKodas, socDraudimoNr);
        this.xNr = xNr;
    }

    public String getxNr() {
        return xNr;
    }

    public void setxNr(String xNr) {
        this.xNr = xNr;

        Asmuo xDarbuotojas = new ImonesXDarbuotojas("Onute", "Mantauskiene", "49901012222", "444", "X000");
        //System.out.println(String.format("ImonesXDarbuotojas: %s%s%s%s%s", xDarbuotojas.getVardas(), xDarbuotojas.getPavarde(), xDarbuotojas.getAsmensKodas(), xDarbuotojas.getSocDraudimoNr(), xDarbuotojas.getxNr()));
        System.out.println(xDarbuotojas.getInfo());
    }
    @Override
    public String getInfo() {
        return String.format("%s", xNr);
    }
}
