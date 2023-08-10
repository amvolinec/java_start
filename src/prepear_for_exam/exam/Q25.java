package prepear_for_exam.exam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q25 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("pirmas");
        set.add("Antras");
        set.add("pirmas");

        System.out.println(set.size());

        List<String> list =  new ArrayList<>();
        list.add("pirmas");
        list.add("Antras");
        list.add("pirmas");

        System.out.println(list.size());
    }

}



