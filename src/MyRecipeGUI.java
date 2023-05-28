import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Color Scheme: https://www.schemecolor.com/brown-earth-tones.php
public class MyRecipeGUI extends JFrame implements ActionListener {
    private JLabel MyRecipe;
    private JTextField searchByIDTextField;
    private JButton enterButton;
    private JButton clearButton;
    private JButton beefButton;
    private JButton breakfastButton1;
    private JButton chickenButton;
    private JButton dessertButton;
    private JButton goatButton;
    private JButton lambButton;
    private JButton miscellaneousButton;
    private JButton pastaButton;
    private JButton porkButton;
    private JButton seafoodButton;
    private JButton sidesButton;
    private JButton startersButton;
    private JButton veganButton;
    private JButton vegetarianButton;
    private JPanel categoryPanel;
    private JLabel Intro;
    private JPanel mainPanel;

    private JPanel SearchPanel;
    private JLabel CatergoriesLabel;
    private JLabel SearchLabel;

    private RecipeNetworking meals;
    public RecipeFrame rFrame;

    public MyRecipeGUI() {
        createUIComponents();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        setContentPane(mainPanel);
        setTitle("Recipe Finder");
        setSize(1050, 550);
        setLocation(450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //sets up listeners
        enterButton.addActionListener(this);
        clearButton.addActionListener(this);
        beefButton.addActionListener(this);
        breakfastButton1.addActionListener(this);
        chickenButton.addActionListener(this);
        dessertButton.addActionListener(this);
        goatButton.addActionListener(this);
        lambButton.addActionListener(this);
        miscellaneousButton.addActionListener(this);
        pastaButton.addActionListener(this);
        porkButton.addActionListener(this);
        seafoodButton.addActionListener(this);
        sidesButton.addActionListener(this);
        startersButton.addActionListener(this);
        veganButton.addActionListener(this);
        vegetarianButton.addActionListener(this);
        setVisible(true);
    }

    private void loadRecipe(int ID) {
        meal.getRecipe(ID);
    }

    private void clear() {
        searchByIDTextField.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object actionSource = e.getSource();
        if (actionSource instanceof JButton) {
            JButton button = (JButton) actionSource;
            if (button.getText().equals("Enter")) {
                String mealID = searchByIDTextField.getText();
                loadRecipe(Integer.parseInt(mealID));
            } else if (button.getText().equals("Clear")) {
                clear();
            } else {
                rFrame.replaceScreen("NEXT");
                if (button.getText().equals("beef")) {
                    meals.getRecipeByCategories("beef");
                } else if (button.getText().equals("breakfast")) {
                    meals.getRecipeByCategories("breakfast");
                } else if (button.getText().equals("chicken")) {
                    meals.getRecipeByCategories("chicken");
                } else if (button.getText().equals("dessert")) {
                    meals.getRecipeByCategories("dessert");
                } else if (button.getText().equals("goat")) {
                    meals.getRecipeByCategories("goat");
                } else if (button.getText().equals("lamb")) {
                    meals.getRecipeByCategories("lamb");
                } else if (button.getText().equals("miscellaneous")) {
                    meals.getRecipeByCategories("miscellaneous");
                } else if (button.getText().equals("pasta")) {
                    meals.getRecipeByCategories("pasta");
                } else if (button.getText().equals("pork")) {
                    meals.getRecipeByCategories("pork");
                } else if (button.getText().equals("seafood")) {
                    meals.getRecipeByCategories("seafood");
                } else if (button.getText().equals("sides")) {
                    meals.getRecipeByCategories("sides");
                } else if (button.getText().equals("starters")) {
                    meals.getRecipeByCategories("starters");
                } else if (button.getText().equals("vegan")) {
                    meals.getRecipeByCategories("vegan");
                } else if (button.getText().equals("vegetarian")) {
                    meals.getRecipeByCategories("vegetarian");

                }
            }

        }
    }

}
