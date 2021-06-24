import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;

public class Database {
    /* TODO
Declare a member variable that can
be EASILY set from the constructor. */
    JsonObject restaurantData;

    /* TODO
set the memebr variable declared above.*/
    public Database(JsonObject data) {
        this.restaurantData = data;
    }

    /* TODO
Complete this method as specified. */
    public JsonObject getRestaurant(String name) {
        JsonArray restaurants = (JsonArray) this.restaurantData.get( "restaurants");
        JsonObject restaurant = new JsonObject();

        for (Object r : restaurants ) {
            restaurant = (JsonObject) r;
            if ( name.equals( restaurant.get("name"))) {
                return restaurant;
            }
        }
        return restaurant;
    }

    /* TODO
Complete this method as specified.
 The previous method may be of help.
*/
    public double getAvgReviews(String name) {
        int numberOfReviews = 0;
        double averageReviewRating = 0.0;
        this.restaurantData = getRestaurant( name );

        JsonArray restaurantReviews = (JsonArray) restaurantData.get("reviews");
        for ( Object r: restaurantReviews ) {
            numberOfReviews++;
            JsonObject review = (JsonObject) r;
            averageReviewRating += Double.parseDouble(review.get("rating").toString());
        }

        return averageReviewRating / (double) numberOfReviews;

    }
}
