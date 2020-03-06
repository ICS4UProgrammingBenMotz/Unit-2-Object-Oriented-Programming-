import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Form {
    private JLabel lblEnterText;
    private JTextField txtValue;
    private JButton btnEnter;
    private JList list1;
    private JPanel panel1;
    private DefaultListModel<String> model= new DefaultListModel<>();
    private Stack stackclass;

    public Form() {

        //sets list as model
        list1.setModel(model);

        btnEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //gets info
                String enteredinfo = txtValue.getText();

                //adds stuff to model
                model.addElement(enteredinfo);

                //adds to stack
                stackclass.Push(enteredinfo);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new Form().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
