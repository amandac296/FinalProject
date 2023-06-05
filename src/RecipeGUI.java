import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;


public class RecipeGUI extends JFrame implements ActionListener {
    private JButton backButton;
    private JPanel recipePanel;
    private JLabel RecipeName;
    private JTextArea Ingredients;
    private JTextArea Instructions;
    private JScrollBar scrollBar1;
    private Recipe mealRecipe;

    public RecipeGUI(Recipe mealRecipe) {
        createUIComponents();
        this.mealRecipe = mealRecipe;
    }

    public void updateScreen(){
        //updates the recipe name
        RecipeName.setText(mealRecipe.getName());
        //updates the ingredients needed by the recipe
        for(int i = 0; i < mealRecipe.getIngredients().size(); i++) {
            if(mealRecipe.getIngredients().get(i) != null && !mealRecipe.getIngredients().get(i).equals("")){
                Ingredients.append(i+1 + ". " + mealRecipe.getIngredients().get(i) + "\n");
            }
        }
        //updates the instructions needed for the recipe

        Instructions.append(mealRecipe.getInstructions());
    }
    private void createUIComponents() {
        setContentPane(recipePanel);
        setTitle("Category");
        setSize(1050, 550);
        setLocation(450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //sets up listeners
        backButton.addActionListener(this);
        setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object actionSource = e.getSource();
        if (actionSource instanceof JButton) {
            JButton button = (JButton) actionSource;
            if (button.getText().equals("Back")) {
                MyRecipeGUI windowBack = new MyRecipeGUI();
                windowBack.setSize(1050, 550);
                setVisible(false);
                windowBack.setVisible(true);
            }

        }
    }
}
