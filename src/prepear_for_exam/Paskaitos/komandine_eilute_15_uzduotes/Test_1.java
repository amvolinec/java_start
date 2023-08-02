package prepear_for_exam.Paskaitos.komandine_eilute_15_uzduotes;
//Parašyti statinį metodą, kuris išspausdiną perduotą tekstinę reikšmę.
//a.Pvz .: panaudojimas main metode:
//1.<jusu metodo pavadinimas>(“Vienas”); 2.String tekstas = “Du”;
//3.<jusu metodo pavadinimas>(tekstas);
public class Test_1 {
    public static void main (String [] args) {
        Test_1.printPlease("Vienas");
        String text = "Du";
        printPlease (text);
    }
    static void printPlease (String c) {
        System.out.println(c);
    }
}
