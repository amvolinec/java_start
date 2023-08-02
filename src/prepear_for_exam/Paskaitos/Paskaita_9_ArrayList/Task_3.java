package prepear_for_exam.Paskaitos.Paskaita_9_ArrayList;

import java.util.ArrayList;

//Paskaita_9_ArrayListParašyti programą, kuri turi sąrašą su keletu String tipo elementų ir pašalina iš sąrašo vienodus elementus, jei jų yra.
public class Task_3 {
    public static void main (String [] args) {
        String ilgiausiasZodis = "";
        ArrayList< String > sarasas = new ArrayList<>();
        sarasas.add("Pirmas");
        sarasas.add("Penkiasdesimt");
        sarasas.add("Antras");
        sarasas.add("Desimtas");
//        for (String zodis : sarasas) {
//            if (zodis.length() >= ilgiausiasZodis.length()){
//                ilgiausiasZodis = zodis;
        sarasas.remove(1);

        System.out.println("Ilgiausias zodis: " + sarasas);
            }
        }




