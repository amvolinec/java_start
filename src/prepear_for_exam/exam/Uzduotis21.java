package prepear_for_exam.exam;

public class Uzduotis21 {
    public static void main(String[] args) {
        boolean melas = false;
        System.out.print("A");
        do {
            System.out.print("B");
            if (melas) {
                melas = true;
                break;
            }
        } while (melas);
        System.out.print("C");
    }
}
