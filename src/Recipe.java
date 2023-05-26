import java.util.ArrayList;

public class Recipe {
    private String title;
    private ArrayList<String> ingredients;
    private String instructions;

    public Recipe(String name, ArrayList<String> i, String instructions) {
        title = name;
        ingredients = i;
        this.instructions = instructions;
    }

    //returns the name of the recipe
    public String getTitle() {
        return title;
    }

    //returns arraylist of all ingredients
    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    //returns ingredient of a certain index
    public String getSpecificIngredient(String find) {
        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).equals(find)) {
                return ingredients.get(i);
            }
        }
        return find;
    }

    @Override
    public String toString() {
        String info = "Name: " + title + "\n" + "Ingredients: \n";

        //prints out the ingredients and measurement  nicely
        for(int i = 0; i < ingredients.size(); i++) {
            info += i+1 + ". " + ingredients.get(i) + "\n";
        }
        info += instructions;


        return info;
    }
}
