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

        MyRecipeGUI gui = new MyRecipeGUI();

    }
}
