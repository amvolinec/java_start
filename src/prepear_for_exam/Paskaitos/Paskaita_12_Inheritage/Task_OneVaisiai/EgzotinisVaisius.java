package prepear_for_exam.Paskaitos.Paskaita_12_Inheritage.Task_OneVaisiai;

public class EgzotinisVaisius extends Vaisius {
    protected String vardas = "Egzotinis Vaisius class";

    public EgzotinisVaisius(String calledFrom) {
        super("Egzotinis Vaisius");
        System.out.println(vardas);
        System.out.println(calledFrom + " called from !!!");
    }

}

