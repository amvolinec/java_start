package ATM;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Account[] users = new Account[2];
        users[0] = new Account(1234, 6789, 2300);
        users[1] = new Account(5678, 1234, 4600);

        Bankomat bankomat = new Bankomat(10, 20, 10, 25, 12);

        int userIndex = selectUser();
        Account user = users[userIndex];

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
                case 5:
                    end = true;
                    break;
                default:
                    System.out.println("\nInvalid Choice.");
                    break;
            }
        }
    }
    public static int putMoney(){

        return 0;
    }
    public static double changePIN(){

        return 0;
    }
    public static double checkBalance(){

        return 0;
    }
    public static void transferMoney(){

    }
}

