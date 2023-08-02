package prepear_for_exam.Paskaitos.Paskaita_8_StringFormat;
//
public class task_8_2 {
    public static void main (String [] args) {

        System.out.println(String.format("|%20s|", "Aš"));
        System.out.println(String.format("|%20s|", "tikrai"));
        System.out.println(String.format("|%20s|", "išmoksiu"));
        System.out.println(String.format("|%20s|", "programuoti"));
        System.out.println(String.format("|%-20s|", "Java"));

        System.out.println(String.format("|%20s|\n|%20s|\n|%20s|\n|%20s|\n|%-20s|", "Aš", "tikrai", "išmoksiu", "programuoti", "Java"));
    }
}
