package prepear_for_exam.Paskaitos.Paskaita_12_Inheritage.Sample_one;

public class Studentas extends Asmuo {
    protected String studentoPazymejimoNr;

    public Studentas(String vardas, String pavarde, String asmensKodas, String studentoPazymejimoNr) {
        super(vardas, pavarde, asmensKodas);
        this.studentoPazymejimoNr = studentoPazymejimoNr;
    }

    public String getStudentoPazymejimoNr() {
        return studentoPazymejimoNr;
    }

    public void setStudentoPazymejimoNr(String studentoPazymejimoNr) {
        this.studentoPazymejimoNr = studentoPazymejimoNr;

        Asmuo studentas = new Studentas("Antanas", "Antanaitis", "39901011111", "123456");
        //System.out.println(String.format("Studentas: %s%s%s%s", studentas.getVardas(), studentas.getPavarde(), studentas.asmensKodas, studentas.getStudentoPazymejimoNr()));
        System.out.println(studentas.getInfo());
    }
    @Override
    public String getInfo() {
        return String.format("%s", studentoPazymejimoNr);
    }
}
