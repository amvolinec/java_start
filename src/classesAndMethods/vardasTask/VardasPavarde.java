package classesAndMethods.vardasTask;

public class VardasPavarde {
    public static void main (String [] args ) {
        spausdink("Iryna", " Sluchova", "Java", 25);
    }
    public static void spausdink(String vardas, String pavarde, String kalba, int savaite_skaicius) {

        System.out.println("As, " + vardas + pavarde + ", tikrai ismoksiu programuoti per " + savaite_skaicius + "savaites.");
    }

    {
      String vardas = "Iryna";
      String pavarde = "Sluchova";
      String kalba = "JAVA";
      int savaite_skaicius = Integer.parseInt("25");
    }
}
