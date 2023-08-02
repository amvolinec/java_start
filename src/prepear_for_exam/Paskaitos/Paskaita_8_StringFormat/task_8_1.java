package prepear_for_exam.Paskaitos.Paskaita_8_StringFormat;


//Turime tokius duomenis: vardas, pavardė, gimimo metai, ūgis, ...
//Atspausdinti tokią eilutę:
//Asmens Petro Petraičio, gimusio 1997m., ūgis yra 1.90m.
public class task_8_1 {
    public static void main(String[] args) {
        String vardas = "Petras";
        String pavarde = "Petraitis";

        int gimMetas = 1997;
        float ugis = 1.90f;
        String a = String.format("Asmens %s %s gimusio %dm. ugis yra %.2fm", vardas, pavarde, gimMetas, ugis);
        System.out.println(a);
    }
}
