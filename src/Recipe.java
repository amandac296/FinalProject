import java.util.ArrayList;

public class Recipe {
    private String title;
    private ArrayList<String> ingredients;
    private String instructions;
    private String image;

    public Recipe(String name, ArrayList<String> i, String instructions, String image) {
        title = name;
        ingredients = i;
        this.instructions = instructions;
        this.image = image;
    }

    //returns the name of the recipe
    public String getName() {
        return title;
    }

    //returns arraylist of all ingredients
    public ArrayList<String> getIngredients() {
        for(int i = 0; i < ingredients.size(); i++) {
            if(ingredients.get(i) == null || ingredients.get(i).equals("") || ingredients.get(i).equals(": ") || ingredients.get(i).equals(" : ")) {
                ingredients.remove(i);
                i--;
            }
        }
        return ingredients;
    }

    public String getInstructions() {
        int idxR = instructions.indexOf("\r");
        int idxN = instructions.indexOf("\n");
        int idxT = instructions.indexOf("\t");

//            //remove instances of \n, \r, \t, and numbers
//            while(idxR != -1) {
//                instructions = instructions.substring(0, idxR) + instructions.substring(idxR +1);
//                idxR = instructions.indexOf("\r");
//            }
//            while(idxN != -1) {
//                instructions = instructions.substring(0, idxN) + instructions.substring(idxN +1);
//                idxN = instructions.indexOf("\n");
//            }
            while(idxT != -1) {
                instructions = instructions.substring(0, idxT) + instructions.substring(idxT +1);
                idxT = instructions.indexOf("\t");
            }

            //removes the numbers



          return instructions;
    }
    public String getImage(){
        return image;
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
