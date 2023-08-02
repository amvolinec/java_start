package ATM;

public class ATM {
    public static void main(String[] args) {
        Account userOne = new Account(1234,6789,2300);
        Account userTwo = new Account(5678,1234,4600);

        Bankomat bankomat  = new Bankomat(1, 2, 3, 4, 5);
    }
}
