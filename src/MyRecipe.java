import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;


public class MyRecipe extends JFrame implements ActionListener, ItemListener{
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
    private JPanel MainPanel;
    private JPanel SearchPanel;
    private JLabel CatergoriesLabel;
    private JLabel SearchLabel;

    private RecipeNetworking meal;

    public MyRecipe() {
        createUIComponents();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        setContentPane(MainPanel);
        setTitle("Recipe Finder");
        setSize(550, 250);
        setLocation(450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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
            } else if (button.getText().equals("beef")) {
            } else if (button.getText().equals("breakfast")) {
            } else if (button.getText().equals("chicken")) {
            } else if (button.getText().equals("dessert")) {
            } else if (button.getText().equals("goat")) {
            } else if (button.getText().equals("lamb")) {
            } else if (button.getText().equals("miscellaneous")) {
            } else if (button.getText().equals("pasta")) {
            } else if (button.getText().equals("pork")) {
            } else if (button.getText().equals("seafood")) {
            } else if (button.getText().equals("sides")) {
            } else if (button.getText().equals("starters")) {
            } else if (button.getText().equals("vegan")) {
            } else if (button.getText().equals("vegetarian")) {

            } else {
                clear();
            }
        }
    }

}
