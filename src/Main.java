public class Main {
    public static void main (String[] args){
        RecipeNetworking new1 = new RecipeNetworking();
        System.out.println(new1.getRecipeByCatergories("Seafood"));
        new1.getRecipe(52913);
        MyRecipe gui = new MyRecipe();
    }
}
