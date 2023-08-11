package SelfStudy;

public class doWhileCIKLE {
    // Main driver method
    public static void main(String args[]) {
        // Declaring and initializing integer values
        int x = 21, sum = 0;

        // Do-while loop
        do {

            // Execution statements(Body of loop)

            // Here, the line will be printed even
            // if the condition is false
            sum += x;
            x--;
        }

        // Now checking condition
        while (x > 10);

        // Summing up
        System.out.println("Summation: " + sum);
    }
}



