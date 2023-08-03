package ATM;

public class Bankomat {
    public int getEur100() {
        return eur100;
    }

    public void setEur100(int eur100) {
        this.eur100 = eur100;
    }

    public int getEur50() {
        return eur50;
    }

    public void setEur50(int eur50) {
        this.eur50 = eur50;
    }

    public int getEur20() {
        return eur20;
    }

    public void setEur20(int eur20) {
        this.eur20 = eur20;
    }

    public int getEur10() {
        return eur10;
    }

    public void setEur10(int eur10) {
        this.eur10 = eur10;
    }

    public int getEur5() {
        return eur5;
    }

    public void setEur5(int eur5) {
        this.eur5 = eur5;
    }

    int eur100;
    int eur50;
    int eur20;
    int eur10;
    int eur5;

    public Bankomat(int eur100, int eur50, int eur20, int eur10, int eur5) { //konstruktor
        this.eur100 = eur100;
        this.eur50 = eur50;
        this.eur20 = eur20;
        this.eur10 = eur10;
        this.eur5 = eur5;
    }

    public static void main(String[] args) {
        Bankomat pirma = new Bankomat(50, 5, 10, 40, 50);
        pirma.getCash(1375);
    }

    public void parodyk() {
        System.out.println("Pinigineje turite: \n" + eur100 + " 100 eur banknotu\n" + eur50 + " 50 eur banknotu\n" +
                eur20 + " 20 eur banknotu\n" + eur10 + " 10 eur banknotu\n" + eur5 + " 5 eur banknotu\n");
    }

    public int getTotal() {
        return (eur100 * 100) + (eur50 * 50) + (eur20 * 20) + (eur10 * 10) + (eur5 * 5);
    }

    public void suma() {
        System.out.println("Viso pinigineje turite: " + getTotal() + " euru.");
    }

    public void inesti(int eur100, int eur50, int eur20, int eur10, int eur5) {
        this.eur100 += eur100;
        this.eur50 += eur50;
        this.eur20 += eur20;
        this.eur10 += eur10;
        this.eur5 += eur5;
    }

    public void addBills(String type, int count) {
        switch (type) {
            case "100":
                this.setEur100(this.getEur100() + count);
                break;
            case "50":
                this.setEur50(this.getEur50() + count);
                break;
            case "20":
                this.setEur20(this.getEur20() + count);
                break;
            case "10":
                this.setEur10(this.getEur10() + count);
                break;
            case "5":
                this.setEur5(this.getEur5() + count);
                break;
        }
    }

    public String getCash(int sum) {
        int total = getTotal();
        int count100 = 0;
        int count50 = 0;

        if (sum > total) {
            System.out.println("ATM does not have required sum!" + sum);
            System.out.println("ATM has only: " + total);
            return "ATM does not have required sum!";
        }

        // 100 section;
        if (sum > 100) {
            count100 = this.getEur100() - sum / 100;

            if (count100 < 0) {
                count100 = this.getEur100();
                this.setEur100(0);
                sum = sum - count100 * 100;
            } else {
                count100 = sum / 100;
                this.setEur100(this.getEur100() - sum / 100);
                sum = sum - count100 * 100;
                System.out.println("100 euros in ATM : " + this.getEur100());
            }
        } else {
            System.out.println("Sum < 100");
        }

        // 50 section;
        if (sum > 50) {
            count50 = this.getEur50() - sum / 50;

            if (count50 < 0) {
                count50 = this.getEur50();
                this.setEur50(0);
                sum = sum - count50 * 50;
            } else {
                count50 = sum / 50;
                this.setEur50(this.getEur50() - sum / 50);
                sum = sum - count50 * 50;
                System.out.println("50 euros in ATM : " + this.getEur50());
            }
        } else {
            System.out.println("Sum < 50");
        }

        System.out.println("count of 100: " + count100 + " count of 50: " + count50 + " rest: " + sum);

        if (count100 > this.getEur100()) {
            System.out.println(">");
        }

        return "OK!";
    }
}


