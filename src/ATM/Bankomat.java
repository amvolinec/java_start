package ATM;

import java.util.HashMap;

public class Bankomat {
    HashMap<Integer, Integer> bills = new HashMap<Integer, Integer>(5); // in ATM
    HashMap<Integer, Integer> count = new HashMap<Integer, Integer>(5); // taken

    public Bankomat(int eur100, int eur50, int eur20, int eur10, int eur5) {
        bills.put(100, eur100);
        bills.put(50, eur50);
        bills.put(20, eur20);
        bills.put(10, eur10);
        bills.put(5, eur5);
        System.out.println("ATM has: " + getTotal() + " eur.");
    }

    public static void main(String[] args) {
        Bankomat atm = new Bankomat(2, 20, 50, 40, 50);
        atm.showResultInBankomat();
        atm.suma();
        atm.getCash(2650);
        atm.showResultInBankomat();
    }

    public void setBill(int key, int value) {
        bills.put(key, bills.get(key) + value);
    }

    public int getBill(int key) {
        return bills.get(key);
    }

    public void showResultInBankomat() {
        System.out.println("ATM has: \n"
                + getBill(100) + "x 100 eur bills\n"
                + getBill(50) + "x 50 eur bills\n"
                + getBill(20) + "x 20 eur bills\n"
                + getBill(10) + "x 10 eur bills\n"
                + getBill(5) + "x 5 eur bills\n");
    }

    public int getTotal() {
        return (getBill(100) * 100)
                + (getBill(50) * 50)
                + (getBill(20) * 20)
                + (getBill(10) * 10)
                + (getBill(5) * 5);
    }

    public void suma() {
        System.out.println("ATM has: " + getTotal() + " eur.");
    }

    public boolean getCash(int sum) {
        int total = getTotal();

        if (sum > total) {
            System.out.println("ATM does not have required sum!" + sum);
            System.out.println("ATM has only: " + total);
            return false;
        }

        // 100 section;
        sum = getSum(sum, 100);

        // 50 section;
        sum = getSum(sum, 50);

        // 20 section;
        sum = getSum(sum, 20);

        // 10 section;
        sum = getSum(sum, 10);

        // 5 section;
        sum = getSum(sum, 5);

        System.out.println("count of 100: " + count.get(100)
                + " count of 50: " + count.get(50)
                + " count of 20: " + count.get(20)
                + " count of 10: " + count.get(10)
                + " count of 5: " + count.get(5)  + " rest: " + sum);

        return true;
    }

    private int getSum(int sum, int nominal) {

        if (sum >= nominal) {
            count.put(nominal, bills.get(nominal) - sum / nominal);

            if (count.get(nominal) < 0) { // If request > bills in ATM
                count.put(nominal, bills.get(nominal)); // we take all bills from ATM this nominal
                bills.put(nominal, 0); // ATM has 0 bills those nominal
            } else {
                count.put(nominal, sum / nominal);
                bills.put(nominal, bills.get(nominal) - count.get(nominal));
            }

            sum = sum - count.get(nominal) * nominal;
        } else {
            System.out.println("Sum < " + nominal);
        }
        return sum;
    }
}


