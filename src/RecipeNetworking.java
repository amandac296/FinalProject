import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;

public class RecipeNetworking {
    private static final String BASE_URL = "https://www.themealdb.com";
    private static final String API_KEY = "1";

    public static Recipe getRecipeByCatergories(String category) {
        String endPoint = "/api/json";
        String url = BASE_URL + endPoint + "/v1/" + API_KEY + "/filter.php?c=" + category;
        String urlResponse = "";
        try {
            URI myUri = URI.create(url);
            HttpRequest request = HttpRequest.newBuilder().uri(myUri).build();
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            urlResponse = response.body();
            System.out.println(urlResponse);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // create object of response
//            JSONObject jsonObj = new JSONObject(urlResponse);
//
//            // parse current weather info
//            JSONObject currentObj = jsonObj.getJSONObject("current");
//            double tempC = currentObj.getDouble("temp_c");
//            double tempF = currentObj.getDouble("temp_f");
//            JSONObject conditionObj = currentObj.getJSONObject("condition");
//            String condition = conditionObj.getString("text");
//            String iconURL = conditionObj.getString("icon");
//            iconURL = "https:" + iconURL;
//
//            // parse location info
//            JSONObject locationObj = jsonObj.getJSONObject("location");
//            String location = locationObj.getString("name");
//
//            // create and return Weather object
//            Weather weather = new Weather(tempC, tempF, condition, iconURL, location);
//            return weather;

        return null;
    }
}
