import java.util.ArrayList;

public class Recipe {
    private String title;
    private ArrayList<String> ingredients;

    public Recipe(String name, ArrayList<String> i) {
        title = name;
        ingredients = i;
    }

    //returns the name of the recipe
    public String getTitle(){
        return title;
    }

    //returns arraylist of all ingredients
    public ArrayList<String> getIngredients(){
        return ingredients;
    }

    //returns ingredient of a certain index
    public String getSpecificIngredient(String find){
        for(int i = 0; i < ingredients.size(); i++){
            if (ingredients.get(i).equals(find)){
                return ingredients.get(i);
            }
        }
        return find;
    }
}
