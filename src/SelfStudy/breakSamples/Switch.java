package SelfStudy.breakSamples;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter a and b");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        switch (a) {
            case 1:
                switch (b) {
                    case 1:
                        System.out.println("b is 1");
                        break;
                    case 2:
                        System.out.println("b is 2");
                        break;
                    case 3:
                        System.out.println("b is 3");
                        break;
                }
                break;
            case 2:
                System.out.println("a is 2");
                break;
            case 3:
                System.out.println("a is 3");
                break;
            default:
                System.out.println("default statement here");
                break;
        }
    }
}