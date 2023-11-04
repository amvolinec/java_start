package ReadProgramTask;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RunFile {
    public static void main(String[] args) {
        String fileNameUrl = "/Users/irynasluchova/IdeaProjects/Courses/src/ReadProgramTask/NiceWord";
        String textToAdd = "My point of mind:\n";
        String contentToAppend = "It is nice to feel that you can travel :) ";

        try {

            String existingContent = new String(Files.readAllBytes(Paths.get(fileNameUrl)));

            String newContent = textToAdd + existingContent;

            Files.write(Paths.get(fileNameUrl), newContent.getBytes());
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());

        }
        try (FileInputStream fileInputStream = new FileInputStream(fileNameUrl);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileNameUrl, true))) {
            bufferedWriter.write(contentToAppend);
            bufferedWriter.newLine();
            System.out.println(contentToAppend);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
