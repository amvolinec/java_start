package second_exam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Recipe {
    private static String name;
    private static String recipeText;

    public static void main(String[] args) {

        String userDirectory = Paths.get("")
                .toAbsolutePath()
                .toString();

        String fileNameUrl = userDirectory + "/src/second_exam/Traškutė.txt";

        try {

            recipeText = new String(Files.readAllBytes(Paths.get(fileNameUrl)));
            System.out.println(recipeText);

        } catch (IOException e) {

            System.err.println("Error: " + e.getMessage());

        }

        System.out.println("Please enter your name:");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();

        String recipe = Recipe();
        System.out.println(recipe);
    }

    public static String Recipe() {

        recipeText = "Best recipe from " + name + "!\n" + recipeText;
        String[] lines = recipeText.split(System.lineSeparator());
        lines[2] = lines[2] + " It looks amazing, but let's move on...";

        return String.join(System.lineSeparator(), lines) + "\n" + name + ".";
    }
}
