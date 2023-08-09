package prepear_for_exam.Biudzetas_PartOne;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biudzetas b1 = new Biudzetas();

        Scanner scanner = new Scanner(System.in);
        char operator = '\0';
        do {
            System.out.println("Pasirinkite, ka norite ivesti:\n" +
                    "1 - pajamas\n" +
                    "2 - islaidas\n" +
                    "3 - atspausdinti pajamu irasus\n" +
                    "4 - atspausdinti islaidu irasus\n" +
                    "5 - gauti islaidu irasa\n" +
                    "X - baigti");
            operator = scanner.next().charAt(0);
            switch (operator) {
                case '1':
                    System.out.println("Is eiles iveskite pajamu suma, kategorija, pozymi ir papildoma informacija");
                    b1.pridetiPajamuIrasa(scanner.nextDouble(), scanner.nextInt(), LocalDate.now(), scanner.nextBoolean(), scanner.next());
                    break;
                case '2':
                    System.out.println("Is eiles iveskite islaidu suma, kategorija, atsiskaitymo buda ir banko korteles nr");
                    b1.pridetiIslaiduIrasa(scanner.nextDouble(), scanner.nextInt(), LocalDateTime.now(), scanner.next(), scanner.next());
                    break;
                case '3':
                    b1.atspausdintiPajamas();
                    break;
                case '4':
                    b1.atspausdintiIslaidas();
                    break;
                case '5':
                    System.out.println("Iveskite ieskoma suma ir buda");
                    IslaiduIrasas islaiduIrasas = b1.gautiIslaiduIrasa(scanner.nextDouble(), scanner.next());
                    System.out.println(islaiduIrasas);
                    break;
                default:
                    System.out.println("Neteisingas pasirinkimas. Pasirinkite kita.");
                    break;
            }
        } while (operator != 'X');
    }
}


