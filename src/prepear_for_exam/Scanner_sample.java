package prepear_for_exam;

import java.util.Scanner;

public class Scanner_sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite varda:");
        String vardas = sc.next();
        System.out.println("Iveskite ugi:");
        double ugis = sc.nextDouble();
        System.out.println("Vardas: " + vardas + " ugis: " + ugis);
    }
}

