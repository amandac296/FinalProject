import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.LayoutManager;

public class RecipeFrame extends JFrame {
    private MyRecipeGUI recipePanel;
    private RecipesByCategoryGUI recipeCategoryPanel;

    //Blank panel used for the CardLayout switching screens feature.
    private JPanel panelCards;
    private Recipe control;

    public RecipeFrame() {
        super();
        panelCards = new JPanel(new CardLayout());
        recipePanel = new MyRecipeGUI();
        recipeCategoryPanel = new RecipesByCategoryGUI();
        setupFrame();
    }

    /**
     * Configures the JFrame window subclass to add the panel and set size based information.
     */
    public void setupFrame() {
        setSize(400, 500);  // (window width, window height)
        setTitle("MyRecipe");
        add(panelCards);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // the following calls the add method on the instance variable panelCards,
        // which is a JPanel object (the JPanel class has an add method)
        panelCards.add(recipePanel, "START");
        panelCards.add(recipeCategoryPanel, "NEXT");

        // helper method defined below
        replaceScreen("START");

        // must be the last line of the configuration to allow the GUI to be displayed.
        // If not set as true the window will not display and the app will terminate.
        setVisible(true);
    }

    public void replaceScreen(String screen) {
        // present the appropriate panel based on the name provided in "screen"
        // (either "START" or "NEXT")
        LayoutManager layout = panelCards.getLayout();
        CardLayout cardLayout = (CardLayout) layout;
        cardLayout.show(panelCards, screen);
    }


}
