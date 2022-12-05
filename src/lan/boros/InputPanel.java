package lan.boros;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * Az inputPAnel egy swing komponens, aim segít bekérni egy értéket.
 * Van egy felirat és egy beviteli mezője
 * @author BorosFather
 * @version 1.0 early alpha
 * @since 2022-12-05
 */
public class InputPanel extends JPanel {
    private JLabel label;
    private JTextField field;
    /**
     * Paraméter nélkuli konstruktor
     */
    public InputPanel() {
        this.label = new JLabel("InputPanel");
        this.field = new JTextField();
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        this.setBorder(new EmptyBorder(5, 10, 5 ,10));
        this.label.setBorder(new EmptyBorder(0, 0, 0 ,10));
        this.addComponent();

    }
    private void addComponent() {
        this.add(label);
        this.add(field);
    }

    /**
     * konstruktor. Paraméterként a komponens felirata megadható
     * @param label A koponens feleirata
     */
    public InputPanel(JLabel label) {
        this.label = label;
    }
    /**
    * A kpmponens szövegének beállításan
    * @param text A felirat szövege
    */
    public void setText(String text) {
        this.label.setText(text);
    }
    /**
     * A komponens szövege lekérdezhető 
     * @return A komponens értéke
     */
    public String getText() {
        return this.label.getText();
    }    
    /**
     * A komkponens értékénel beákkítása
     * @param value A komponens értéke
     */
    public void setValue(String value) {
        this.field.setText(value);
    }
    /**
     * A komponens értékének lekérdezése
     * @return A komponens értékét adja
     */
    public String getValue() {
        return this.field.getText();
    }
}
