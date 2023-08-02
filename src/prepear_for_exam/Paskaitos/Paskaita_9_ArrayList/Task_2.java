package prepear_for_exam.Paskaitos.Paskaita_9_ArrayList;

import java.util.ArrayList;

//Sukurti String tipo elementus galintį saugoti sąrašą.Į sąrašą įdėti keletą elementų. Rasti ilgiausią žodį sąraše.
public class Task_2 {
    public static void main (String [] args) {
        String ilgiausiasZodis = "";
        ArrayList < String > sarasas = new ArrayList<>();
        sarasas.add("Pirmas");
        sarasas.add("Penkiasdesimt");
        sarasas.add("Antras");
        sarasas.add("Desimtas");
        for (String zodis : sarasas) {
            if (zodis.length() >= ilgiausiasZodis.length()){
                ilgiausiasZodis = zodis;
            }
        }
        System.out.println("Ilgiausias zodis: " + ilgiausiasZodis);
    }
}
