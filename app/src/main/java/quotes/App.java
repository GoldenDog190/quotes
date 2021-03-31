/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new App().getGreeting());
        Gson gson = new Gson();

        File file = new File("app/src/main/resources/recentquotes.json");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        gson.toJson(file, fileWriter);
        fileWriter.close();

        File file2 = new File("app/src/main/resources/recentquotes.json");
        FileReader reader = new FileReader(file2);
        Quotes author = gson.fromJson(reader, Quotes.class);
        System.out.println(author);
        System.out.println(author.quotes);



    }
}