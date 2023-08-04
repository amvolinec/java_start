package ATM;

import java.util.Scanner;

public class ATM {

    private static Account user;

    private static final Scanner input = new Scanner(System.in);
    private static Bankomat bankomat;

    private static final Account[] users = new Account[3];

    public static void main(String[] args) {


        users[0] = new Account(1234, "6789", 2300);
        users[1] = new Account(5678, "1234", 4600);
        users[2] = new Account(9999, "1111", 0); // friend account

        bankomat = new Bankomat(10, 20, 10, 25, 12);

        int userIndex = selectUser();
        user = users[userIndex];

        System.out.println("Selected user: " + user.getCustomerNumber());

        menu();

    }

    public static int selectUser() {
        boolean end = false;
        int userIndex = 0;

        while (!end) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Select user:");
            System.out.println("1. User_1234");
            System.out.println("2. User_5678");
            userIndex = sc.nextInt();

            if (userIndex == 1 || userIndex == 2) {
                end = true;
            } else {
                System.out.println("Wrong choice");
            }
        }
        return --userIndex;
    }

    public static void menu() {
        boolean end = false;

        while (!end) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Put money into account");
            System.out.println("2.Change PIN code");
            System.out.println("3.Check account balance");
            System.out.println("4.Transfer money to another account");
            System.out.println("5.Finish session");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    putMoney();
                    break;
                case 2:
                    changePIN();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    transferMoney();
                    break;
                case 5:
                    end = true;
                    break;
                default:
                    System.out.println("\nInvalid Choice.");
                    break;
            }
        }
    }

    public static void putMoney() {
        int type = 0;
        int count;
        do {
            System.out.println("Please select bill type 1-5: ");
            System.out.println("1 100 Euro");
            System.out.println("2 50 Euro");
            System.out.println("3 20 Euro");
            System.out.println("4 10 Euro");
            System.out.println("5 5 Euro");
            System.out.println("6 Exit");

            type = input.nextInt();

            switch (type) {
                case 1:
                    count = getBillCount("100 Euro");
                    user.setTotalBalance(user.getTotalBalance() + count * 100);
                    bankomat.addBills("100", count);
                    break;
                case 2:
                    count = getBillCount("50 Euro");
                    user.setTotalBalance(user.getTotalBalance() + count * 50);
                    bankomat.addBills("50", count);
                    break;
                case 3:
                    count = getBillCount("20 Euro");
                    user.setTotalBalance(user.getTotalBalance() + count * 20);
                    bankomat.addBills("20", count);
                    break;
                case 4:
                    count = getBillCount("10 Euro");
                    user.setTotalBalance(user.getTotalBalance() + count * 10);
                    bankomat.addBills("10", count);
                    break;
                case 5:
                    count = getBillCount("5 Euro");
                    user.setTotalBalance(user.getTotalBalance() + count * 5);
                    bankomat.addBills("5", count);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("\nInvalid Choice.");
                    break;
            }
        } while (type > 0 && type < 6);

        bankomat.parodyk();
        user.showBalance();
    }

    public static void changePIN() {
        System.out.println("Please enter new PIN code: ");
        String choice = input.next();
        user.setPinNumber(choice);
    }

    public static void checkBalance() {
        System.out.println("\nYour balance: " + user.getTotalBalance());
    }

    public static void transferMoney() {
        boolean end = false;

        do {
            System.out.println("\nEnter the sum transfer: ");
            double sum = input.nextDouble();

            if (sum > user.getTotalBalance()) {
                System.out.println("\nThe sum is more than you have!");
                continue;
            }

            users[2].setTotalBalance(users[2].getTotalBalance() + sum);
            user.setTotalBalance(user.getTotalBalance() - sum);
            end = true;

            System.out.println("\nSuccess, the sum is go to friend account!");
        } while (!end);
    }

    private static int getBillCount(String type) {
        System.out.println("Please enter " + type + " bill count: ");
        return input.nextInt();
    }

    private static void getCash() {
        // %
        //        sum =
        //        user.getTotalBalance()
        //        if(sum > user.getTotalBalance()) {
//        return;
//    }
        //  boolean result = bankomat.getCash(sum); // return false | true
        //        if(boolean) {
    }

}

