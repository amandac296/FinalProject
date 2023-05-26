import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RecipeGUI extends JFrame implements ActionListener {

    private JLabel meal;
    private JTextField instructionsLabel;
    private JButton backButton;
    private JPanel meaPanel;
    private JTextField ingredientsTextField;
    private JPanel instructionsPanel;
    private JPanel backPanel;

    public RecipeGUI() {
        createUIComponents();
    }

    private void createUIComponents() {
        setContentPane(meaPanel);
        setTitle("Recipe");
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
