package ATM;

public class ATM {
    public static void main(String[] args) {
        Account[] users = new Account[2];
        users[0] = new Account(1234,6789,2300);
        users[1] = new Account(5678,1234,4600);

        Bankomat bankomat  = new Bankomat(10, 20, 10, 25, 12);


    }
}
