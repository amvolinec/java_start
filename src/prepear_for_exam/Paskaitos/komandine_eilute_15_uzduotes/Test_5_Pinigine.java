package prepear_for_exam.Paskaitos.komandine_eilute_15_uzduotes;

//Klasė: Piniginė Metodai:
//a.parodyk() išspausdina kintamųjų reikšmes; b.suma(); - suskaičiuoja sumą kiek yra pinigų; c.inesti(eur100,eur50,eur20,eur10,eur5);
//Kintamieji eur100,eur50,eur20,eur10,eur5 laikys savyje kiek banknotų vienetų yra piniginėje
public class Test_5_Pinigine {
    int eur100;
    int eur50;
    int eur20;
    int eur10;
    int eur5;

    public Test_5_Pinigine(int eur100, int eur50, int eur20, int eur10, int eur5) { //konstruktor
        this.eur100 = eur100;
        this.eur50 = eur50;
        this.eur20 = eur20;
        this.eur10 = eur10;
        this.eur5 = eur5;
    }

    public static void main(String[] args) {
        Test_5_Pinigine pirma = new Test_5_Pinigine(1, 2, 3, 4, 5);
        Test_5_Pinigine antra = new Test_5_Pinigine(1, 2, 3, 4, 5);

        pirma.inesti(3, 5, 6, 1, 20);
        pirma.parodyk();
        pirma.suma();

        antra.inesti(50, 5, 3, 1, 20);
        antra.parodyk();
        antra.suma();
    }

    public void parodyk() {
        System.out.println("Pinigineje turite: \n" + eur100 + " 100 eur banknotu\n" + eur50 + " 50 eur banknotu\n" +
                eur20 + " 20 eur banknotu\n" + eur10 + " 10 eur banknotu\n" + eur5 + " 5 eur banknotu\n");
    }

    public void suma() {
        System.out.println("Viso pinigineje turite: " + ((eur100 * 100) + (eur50 * 50) + (eur20 * 20) + (eur10 * 10) + (eur5 * 5) + " euru."));
    }

    public void inesti(int eur100, int eur50, int eur20, int eur10, int eur5) {
        this.eur100 += eur100;
        this.eur50 += eur50;
        this.eur20 += eur20;
        this.eur10 += eur10;
        this.eur5 += eur5;
    }
}
