package prepear_for_exam.Paskaitos.komandine_eilute_15_uzduotes;

//Parašyti programą, kuri pasakytų kokį parametrą (>java KlasesPavadinimas 0) ty skaičių nuo 0 iki 10 perdavėte per komandinę eilutę.
//a."Jūs įvedėte 0." b....
public class Test_2 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "0":
                    System.out.println("Nulis");
                    break;
            }
        }
    }
}
