/*
 * Created by: Ben Motz
 * Created on: 6-03-2020
 * Created for: ICS4U Programming
 * Daily Assignment – Day 16-Stack
 * This program does some stuff
 */
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
    private JButton btnPop;
    private JButton btnPeekTopVal;
    private JButton btnClear;
    private JLabel lblPeekValue;
    private JLabel lblpopval;
    private DefaultListModel<String> model= new DefaultListModel<>();
    private Stack stackclass;
    public int buttonpresses=0;

    public Form() {

        //sets list as model
        list1.setModel(model);
        stackclass = new Stack();

        btnEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //gets info
                String enteredinfo = txtValue.getText();

                try {
                    //trys to parse the int
                    int infoentered=Integer.parseInt(enteredinfo);

                    if (enteredinfo==null){
                        //displays message
                        JOptionPane.showMessageDialog(null, "Please enter valid information");
                    }
                    else {
                        //adds stuff to model
                        model.addElement(enteredinfo);

                        //adds to stack
                        stackclass.Push(enteredinfo);
                    }
                }catch(Exception e1){
                    //displays message
                    JOptionPane.showMessageDialog(null, "Please enter valid information");
                }

            }
        });
        btnPop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //error checking
                if (model.size()==0){
                    //displays message
                    JOptionPane.showMessageDialog(null, "The stack is empty");
                }
                else {
                    //pops info
                    stackclass.Pop();

                    lblpopval.setText("Poped Value: "+ model.get(model.size()-1));

                    //removes items from list
                    model.remove(model.size() - 1);
                }
            }
        });
        btnPeekTopVal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //checks to see if the stack is full
                if (model.size()>0) {
                    //determines the peek
                    stackclass.Peek();

                    //sets text
                    lblPeekValue.setText("The peak value is: " + model.get(model.size() - 1));
                } else{
                    //if there is an error
                    JOptionPane.showMessageDialog(null, "The stack is empty");
                }
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //if the user clears the information
                stackclass.Clear();
                model.clear();
                lblPeekValue.setText("The peak value is: ");
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
