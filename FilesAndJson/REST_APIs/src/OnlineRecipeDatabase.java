import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class OnlineRecipeDatabase {

    String baseUrl = "http://www.recipepuppy.com/api/?";

    public JsonObject getRecipesByIngredients(String ingredients) throws Exception
    {
        //Getting the things ready to connect to the web
        URL url = new URL(baseUrl+"i="+ingredients);
        String contents = "";
        JsonObject recipes;

        Scanner urlScanner = new Scanner(url.openStream());
        while (urlScanner.hasNextLine() ) {
            contents += urlScanner.nextLine();
        }
        urlScanner.close();
        recipes = (JsonObject) Jsoner.deserialize(contents, new JsonObject());

        /* TODO
You have to use the url to retrieve the contents of the website. 
This will be a String, but in JSON format. */

        return recipes; /* TODO
Remember to return a JSON object.*/
    }
    public JsonObject getRecipesByDish(String dish) throws Exception
    {
        //Getting the things ready to connect to the web
        URL url = new URL(baseUrl+"q="+dish);
        String contents = "";
        JsonObject dishes;

        Scanner urlScanner = new Scanner(url.openStream());
        while (urlScanner.hasNextLine()) {
            contents += urlScanner.nextLine();
        }
        urlScanner.close();

        dishes = (JsonObject) Jsoner.deserialize(contents, new JsonObject());

        return dishes;

        /* TODO 
Fill in this data type (Object) */ /* TODO
Fill in this datatype (Object) */

       /* TODO
Read the information coming from the web
 */
       /* TODO
return the appropriate result.
*/
    }
    public String formatRecipeAsString(JsonObject doc)
    {
        String results = "";
        JsonArray format = (JsonArray) doc.get("results");

        for ( Object f: format ) {
            JsonObject formatted = (JsonObject) f;
            String title = formatted.get("title").toString();
            String link = formatted.get("href").toString();
            String ingredients = formatted.get("ingredients").toString();

            results += ( "title: " + title + " link: " + link + " ingredients: " + ingredients + " ");
        }
        /* TODO 
This should return a String with each recipe in three lines:
Title:the title of the recipe
Link:the link to the recipe
Ingredients:The ingredients of the recipe.*/
        return results;
    }
    public void saveRecipes(String text, String outfile)
    {
        try {
            FileWriter writer = new FileWriter( outfile );
            writer.write( text );
            writer.flush();
            writer.close();

        } catch ( IOException e ) {
            System.out.print( e );
        }

        /* TODO
Given a String with some text in it, write that text to a file. 
The name of the file is given in outfile */
    }

}
