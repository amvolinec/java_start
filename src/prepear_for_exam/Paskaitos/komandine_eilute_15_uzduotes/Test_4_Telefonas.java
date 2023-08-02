package prepear_for_exam.Paskaitos.komandine_eilute_15_uzduotes;

//Klasė: Telefonas (markė, modelis, atmintis, spalva) parodyk();
//Klasė Telefonas;
//Kintamieji markė, modelis, atmintis, spalva;
//Metodas parodyk() – turi išspausdinti kintamųjų visas reikšmes.
//1. main metode išspausdinti kintamųjų reikšmes kviečiant parodyk() metodą.
public class Test_4_Telefonas {

    private static final String marke = "Iphone.";
    private static final String modelis = "12.";
    private static final String spalva = "blue.";
    private static final String atmintis = "10TB.";

    public static void main(String[] args) {
        parodyk();
    }

    static void parodyk() {
        System.out.println("Marke: " + marke + " " + "Modelis: " + modelis + " " + "Spalva: " + spalva +  " " +
                "Atmintis: " + atmintis);

    }
}
