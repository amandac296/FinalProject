import javax.swing.*;

public class Main {
    public static void main (String[] args) {
        //changes the looks of a panel
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        RecipeNetworking new1 = new RecipeNetworking();
        System.out.println(new1.getRecipeByCategories("Starter"));
        new1.getRecipe(52913);
        MyRecipeGUI gui = new MyRecipeGUI();

    }
}
