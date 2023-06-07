import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;


public class RecipeGUI extends JFrame implements ActionListener {
    private JButton backButton;
    private JPanel recipePanel;
    private JLabel RecipeName;
    private JTextArea Ingredients;
    private JTextArea Instructions;
    private JScrollBar scrollBar1;
    private JLabel foodPic;
    private Recipe mealRecipe;

    public RecipeGUI(Recipe mealRecipe) {
        createUIComponents();
        this.mealRecipe = mealRecipe;
    }

    public void updateScreen() {
        //updates the recipe name
        RecipeName.setText(mealRecipe.getName());
        //updates the ingredients needed by the recipe
        for (int i = 0; i < mealRecipe.getIngredients().size(); i++) {
            if (mealRecipe.getIngredients().get(i) != null && !mealRecipe.getIngredients().get(i).equals("") && !mealRecipe.getIngredients().get(i).equals(":")) {
                Ingredients.append(i + 1 + ". " + mealRecipe.getIngredients().get(i) + "\n");
            }
        }
        //updates the instructions needed for the recipe

        Instructions.append(mealRecipe.getInstructions());

        //changes the placeholder images into an image of the recipe
        try {
            URL imageURL = new URL(mealRecipe.getImage());
            BufferedImage image = ImageIO.read(imageURL);
            ImageIcon icon = new ImageIcon(image);
            foodPic.setIcon(icon);
        } catch (IOException e) {}
    }
    private void createUIComponents() {
        setContentPane(recipePanel);
        setTitle("Category");
        setSize(2000, 1050);
        setLocation(0, 0);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //sets up listeners
        backButton.addActionListener(this);
        setVisible(false);
        Instructions.setEditable(false);
        Ingredients.setEditable(false);
        backButton.setFocusable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object actionSource = e.getSource();
        if (actionSource instanceof JButton) {
            JButton button = (JButton) actionSource;
            if (button.getText().equals("Back")) {
                MyRecipeGUI windowBack = new MyRecipeGUI();
                windowBack.setSize(1000, 350);
                setVisible(false);
                windowBack.setVisible(true);
            }

        }
    }
}
