package constantsAndUtills;
import java.util.Scanner;
public class ScannerExample {

    public static void main (String [ ] args ){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter your name: ");
        String name = sc.next();

        System.out.println("Enter your height: ");
        double height = sc.nextDouble();

        System.out.println("Name: " + name + " height :" + height);
        sc.close();
    }
}
