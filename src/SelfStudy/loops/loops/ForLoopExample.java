package SelfStudy.loops.loops;
public class ForLoopExample {
    public static void main(String[] args) {
        simple();
        likeWhile();
    }
    private static void simple() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i == 9) {
                break;
            }
            System.out.println("Iteration: " + i);
        }
    }
    private static void likeWhile() {
        int i = 0;
        for (; i < 3; ) {
            System.out.println("i: " + i);
            i++;
        }
    }
}
