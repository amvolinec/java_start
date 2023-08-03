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
        int count20 = 0;
        int count10 = 0;
        int count5 = 0;

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

        // 20 section;
        if (sum > 20) {
            count20 = this.getEur20() - sum / 20;

            if (count20 < 0) {
                count20 = this.getEur20();
                this.setEur20(0);
                sum = sum - count20 * 20;
            } else {
                count20 = sum / 20;
                this.setEur20(this.getEur20() - sum / 20);
                sum = sum - count20 * 20;
                System.out.println("20 euros in ATM : " + this.getEur20());
            }
        } else {
            System.out.println("Sum < 20");
        }
        // 10 section;
        if (sum > 10) {
            count10 = this.getEur10() - sum / 10;

            if (count10 < 0) {
                count10 = this.getEur10();
                this.setEur10(0);
                sum = sum - count10 * 10;
            } else {
                count10 = sum / 10;
                this.setEur10(this.getEur10() - sum / 10);
                sum = sum - count10 * 10;
                System.out.println("10 euros in ATM : " + this.getEur10());
            }
        } else {
            System.out.println("Sum < 10");
        }
        // 5 section;
        if (sum > 5) {
            count5 = this.getEur5() - sum / 5;

            if (count5 < 0) {
                count5 = this.getEur5();
                this.setEur5(0);
                sum = sum - count5 * 5;
            } else {
                count5 = sum / 5;
                this.setEur5(this.getEur5() - sum / 5);
                sum = sum - count5 * 5;
                System.out.println("5 euros in ATM : " + this.getEur5());
            }
        } else {
            System.out.println("Sum < 10");
        }

        System.out.println("count of 100: " + count100 + " count of 50: " + count50 + " rest: " + sum);

        if (count100 > this.getEur100()) {
            System.out.println(">");
        }

        return "OK!";
    }
}


