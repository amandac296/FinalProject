import java.util.ArrayList;
public class RecipeController {
    private RecipeFrame rFrame;
    private ArrayList<Recipe> recipes;
    private Recipe recipe;


    public RecipeController() {
        rFrame = new RecipeFrame();
        recipe = null;
        recipes = new ArrayList<Recipe>();
    }
}
