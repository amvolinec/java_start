package prepear_for_exam.Test;

public class Pagrindine {
    public static void main(String[] args) {
        Asmuo asmuo1 = new Asmuo();
        Asmuo asmuo2 = new Asmuo();
        Asmuo asmuo3 = new Asmuo();

        asmuo3.kiekSukurtaAsmenu();

        asmuo1.setVardas("Jonas");
        asmuo1.setPavarde("Beliauskas");
        asmuo1.setGimimoMetai("1985");

        asmuo2.setVardas("Inga");
        asmuo2.setPavarde("Portnovaite");
        asmuo2.setGimimoMetai("1988");

        asmuo3.setVardas("Ona");
        asmuo3.setPavarde("Kazlauskiene");
        asmuo3.setGimimoMetai("1999");

        asmuo2.pakeistiPavarde("Sakalauskiene");

        System.out.println("Nauja pavarde: " + asmuo2.getPavarde());

        Asmuo asmuo4 = new Asmuo("Kestutis", "Baltrasius", "2000");
        Asmuo asmuo5 = new Asmuo("Sima", "Jonite", "2022");

        asmuo3.kiekSukurtaAsmenu();

        String v = asmuo3.getVardas().substring(0,1);
        String p = asmuo3.getPavarde().substring(0,1);

        System.out.println( asmuo3.getPavarde() + " inicialai: " + v + p);

        asmuo4.spausdintiInformacija();
        asmuo5.spausdintiInformacija();
    }
}
