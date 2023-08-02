package ATM;

import java.util.HashMap;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Account[] users = new Account[2];
        users[0] = new Account(1234, 6789, 2300);
        users[1] = new Account(5678, 1234, 4600);

        Bankomat bankomat = new Bankomat(10, 20, 10, 25, 12);

    }

    public void user() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.User_1234");
        System.out.println("2.User_5678");
    }
    public void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Put money into account");
        System.out.println("2.Change PIN code");
        System.out.println("3.Check account balance");
        System.out.println("4.Transfer money to another account");
    }
}

