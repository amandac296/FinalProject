import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RecipeGUI extends JFrame implements ActionListener {

    private JButton backButton;
    private JPanel mealPanel;
    private JTextArea Names;
    private RecipeFrame rFrame;
    private ArrayList<String> names;

    public RecipeGUI(ArrayList<String> names) {
        createUIComponents();
        this.names = names;
//        rFrame = new RecipeFrame();
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

    }
    private void updateScreen() {

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
