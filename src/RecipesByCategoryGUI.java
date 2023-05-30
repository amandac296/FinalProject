import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RecipesByCategoryGUI extends JFrame implements ActionListener {
    private JLabel categoryLabel;
    private JLabel label1;
    private JButton backButton;
    private JPanel recipePanel;
    private RecipeFrame rFrame;

    public RecipesByCategoryGUI() {
        createUIComponents();
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

            }

        }
    }
}
