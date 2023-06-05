import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
    private JButton sideButton;
    private JButton starterButton;
    private JButton veganButton;
    private JButton vegetarianButton;
    private JPanel categoryPanel;
    private JLabel Intro;
    private JPanel mainPanel;

    private JPanel SearchPanel;
    private JLabel CategoriesLabel;
    private JLabel SearchLabel;
    private JLabel tryAgain;

    private RecipeNetworking meals;

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
        //unhighlights the buttons
        beefButton.setFocusable(false);
        breakfastButton1.setFocusable(false);
        chickenButton.setFocusable(false);
        dessertButton.setFocusable(false);
        goatButton.setFocusable(false);
        lambButton.setFocusable(false);
        miscellaneousButton.setFocusable(false);
        pastaButton.setFocusable(false);
        porkButton.setFocusable(false);
        seafoodButton.setFocusable(false);
        sideButton.setFocusable(false);
        starterButton.setFocusable(false);
        veganButton.setFocusable(false);
        vegetarianButton.setFocusable(false);
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
        sideButton.addActionListener(this);
        starterButton.addActionListener(this);
        veganButton.addActionListener(this);
        vegetarianButton.addActionListener(this);
        setVisible(true);
    }

    private Recipe loadRecipe(int ID) {
        return meals.getRecipe(ID);
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
                Recipe mealRecipe = loadRecipe(Integer.parseInt(mealID));
                //switches the screen
                RecipeGUI window3 = new RecipeGUI(mealRecipe);
                window3.setSize(1050, 550);
                setVisible(false);
                window3.setVisible(true);
                window3.updateScreen();
            } else if (button.getText().equals("Clear")) {
                searchByIDTextField.setText("");
                clear();
            } else {
                ArrayList<String> Categories = new ArrayList<>();
                if (button.getText().equals("beef")) {
                    Categories = meals.getRecipeByCategories("Beef");
                } else if (button.getText().equals("breakfast")) {
                    Categories = meals.getRecipeByCategories("Breakfast");
                } else if (button.getText().equals("chicken")) {
                    Categories = meals.getRecipeByCategories("Chicken");
                } else if (button.getText().equals("dessert")) {
                    Categories = meals.getRecipeByCategories("Dessert");
                } else if (button.getText().equals("goat")) {
                    Categories = meals.getRecipeByCategories("Goat");
                } else if (button.getText().equals("lamb")) {
                    Categories = meals.getRecipeByCategories("Lamb");
                } else if (button.getText().equals("miscellaneous")) {
                    Categories = meals.getRecipeByCategories("Miscellaneous");
                } else if (button.getText().equals("pasta")) {
                    Categories = meals.getRecipeByCategories("Pasta");
                } else if (button.getText().equals("pork")) {
                    Categories = meals.getRecipeByCategories("Pork");
                } else if (button.getText().equals("seafood")) {
                    Categories = meals.getRecipeByCategories("Seafood");
                } else if (button.getText().equals("side")) {
                    Categories = meals.getRecipeByCategories("Side");
                } else if (button.getText().equals("starter")) {
                    Categories = meals.getRecipeByCategories("Starter");
                } else if (button.getText().equals("vegan")) {
                    Categories = meals.getRecipeByCategories("Vegan");
                } else if (button.getText().equals("vegetarian")) {
                    Categories = meals.getRecipeByCategories("Vegetarian");
                }
                RecipesByCategoriesGUI window2 = new RecipesByCategoriesGUI(Categories);
                window2.setSize(1050, 550);
                setVisible(false);
                window2.setVisible(true);
                window2.updateScreen();
            }
        }
    }

}
