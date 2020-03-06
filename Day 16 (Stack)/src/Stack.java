import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class Main {

    private JLabel lblEnter;
    private JButton btnAddVal;
    private JTextField txtEnterText;
    private JPanel panel1;
    private JList lstEnteredVals;

    ArrayList<String> values = new ArrayList<String>();

    public Stack() {
        btnAddVal.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                String EnteredVals=txtEnterText.getText();
                values.add(EnteredVals);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new Stack().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
