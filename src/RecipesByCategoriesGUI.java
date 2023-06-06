import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RecipesByCategoriesGUI extends JFrame implements ActionListener {

    private JButton backButton;
    private JPanel mealPanel;
    private JTextArea Recipes;
    private JLabel RecipeByCategoryLabel;
    private JLabel RecipeIDLabel;
    private JScrollBar vbar;
    private JScrollPane Recipes1;
    private ArrayList<String> names;

    public RecipesByCategoriesGUI(ArrayList<String> recipes) {
        createUIComponents();
        this.names = recipes;
    }

    private void createUIComponents() {
        setContentPane(mealPanel);
        setTitle("Recipe");
        setSize(1050, 550);
        setLocation(450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //sets up listeners
        backButton.addActionListener(this);
        setVisible(false);
        Recipes.setEditable(false);        //sets the TextArea as uneditable

    }

    //prints out all the recipes in that catergory including the recipe ID
    public void updateScreen() {
        for(int i = 0; i < names.size(); i++) {
            Recipes.append(i+1 + "." + names.get(i) + "\n");
        }
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
