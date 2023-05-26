import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;
import org.json.JSONArray;
import java.util.ArrayList;

public class RecipeNetworking {
    private static final String BASE_URL = "https://www.themealdb.com";
    private static final String API_KEY = "1";

    public static ArrayList<String> getRecipeByCategories(String category) {
        String endPoint = "/api/json";
        String url = BASE_URL + endPoint + "/v1/" + API_KEY + "/filter.php?c=" + category;
        String urlResponse = "";
        try {
            URI myUri = URI.create(url);
            HttpRequest request = HttpRequest.newBuilder().uri(myUri).build();
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            urlResponse = response.body();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // create object of response
        JSONObject jsonObj = new JSONObject(urlResponse);

        // parse meals info
        JSONArray mealArray = jsonObj.getJSONArray("meals");
        ArrayList<String> meals = new ArrayList<String>();
        for (int i = 0; i < mealArray.length(); i++) {
            JSONObject obj = mealArray.getJSONObject(i);
            String strMeal = obj.getString("strMeal");
            int strID = obj.getInt("idMeal");
            meals.add(strMeal + "- " + strID);
        }
        // create and return meal object
        return meals;
    }

    //returns the step-by-step instructions for the recipe requested by user
    public static void getRecipe(int recipeID) {
//        www.themealdb.com/api/json/v1/1/lookup.php?i=52772
        String endPoint = "/api/json";
        String url = BASE_URL + endPoint + "/v1/" + API_KEY + "/lookup.php?i=" + recipeID;
        String urlResponse = "";
        try {
            URI myUri = URI.create(url);
            HttpRequest request = HttpRequest.newBuilder().uri(myUri).build();
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            urlResponse = response.body();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // create object of response
        JSONObject jsonObj = new JSONObject(urlResponse);
        // parse meals info
        JSONArray mealArray = jsonObj.getJSONArray("meals");
        String strInstructions = mealArray.getJSONObject(0).getString("strInstructions");
        ArrayList<String> strIngredients = new ArrayList<>();
        for (int i = 1; i <= 9; i++){
            if (mealArray.getJSONObject(0).getString("strIngredient" + i) != null) {
                String ingredient = mealArray.getJSONObject(0).getString("strIngredient" + i);
                String measurement = mealArray.getJSONObject(0).getString("strMeasure" + i);
                strIngredients.add(ingredient  + ": " + measurement);
            }
        }
        System.out.println(strIngredients);
    }
}
