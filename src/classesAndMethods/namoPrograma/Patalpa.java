package classesAndMethods.namoPrograma;

public class Patalpa {
    //variables

    double kvadratura;
    String pavadinimas;
    int aukstas;

    //metodai
    public String gautiInformacija () {
        String laikinas = "";
        laikinas += pavadinimas;
        laikinas += " (";
        laikinas += kvadratura;
        laikinas += "), aukstas: ";
        laikinas += aukstas;
     //   return pavadinimas + " (" + kvadratura + "), aukstas: " + aukstas;
        return laikinas;

    }
    public void pakeisti (String naujusPavadinimas, int naujusAukstas, double naujaKvadratura) {
        pavadinimas = naujusPavadinimas;
        aukstas = naujusAukstas;
        kvadratura = naujaKvadratura;
        return;
    }
}
