package classesAndMethods.namoPrograma;

public class Programa {
    public static void main (String [] args) {
   //     System.out.println("Programa prasideda");
        Patalpa virtuve = new Patalpa();
        virtuve.aukstas = 4;
        virtuve.kvadratura = 13.5;
        virtuve.pavadinimas = "Barokine virtuve";

        String virtuvesInformacija = virtuve.gautiInformacija();
        System.out.println(virtuvesInformacija);

        Patalpa vonia = new Patalpa();
        vonia.aukstas = 4;
        vonia.kvadratura = 6.5;
        vonia.pavadinimas = "Juoda vonia";

        System.out.println(vonia.gautiInformacija());
        vonia.pakeisti("Balta vonia", 3,9.0);
        System.out.println(vonia.gautiInformacija());


    }
}
