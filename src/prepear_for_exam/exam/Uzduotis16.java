package prepear_for_exam.exam;

public class Uzduotis16 {
    static int i = 1;
    void didintiI () {i++;}
    int nuskaitytiI () {return i;}
    public static void main (String [] args) {
        Uzduotis16 e1 = new Uzduotis16(), e2 = new Uzduotis16();
        e1.didintiI(); e2.didintiI();
        System.out.println(e1.nuskaitytiI());
    }

}
