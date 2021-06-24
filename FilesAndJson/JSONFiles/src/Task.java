import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task {
    public static void main(String[] args) {
        Task t = new Task();
        JsonObject doc = t.readJson("./resources/restaurant-data.json");
        Database db = new Database(doc);
        System.out.println(db.getRestaurant("Hometown BBQ"));
        System.out.println(db.getAvgReviews("Casa Enrique"));
    }

    public String readFile(String filename) {
        String contents = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String s = reader.readLine();
            while (s != null) {
                contents += s;
                s = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return contents;
    }

    public JsonObject readJson(String filename) {
        return (JsonObject) Jsoner.deserialize(readFile(filename), new JsonObject());

    }
}

