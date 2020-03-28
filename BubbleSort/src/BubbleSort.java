/*
 * Created by: Ben Motz
 * Created on: March 28, 2020
 * Created for: ICS4U
 * Major Assignment #3, Bubble Sort
 * This program uses a bubble sort to order 250 values
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.ArrayList;

public class BubbleSort {
    private JButton bthGenVals;
    private JList list1;
    private JButton btnSort;
    private JPanel panel1;
    private DefaultListModel<String> model= new DefaultListModel<>();

    public static int randnumb;

    public static void bubblesort (ArrayList gennumbsarr){
        {
            int length = gennumbsarr.size();

            //loops until array is ordered properly
            for (int counter = 0; counter < length - 1; counter++)

                for (int counter2 = 0; counter2 < length-1; counter2++)

                    //checks if the values need to be switched
                    if ((int) gennumbsarr.get(counter2) > (int) gennumbsarr.get(counter2+1))
                    {
                        //changes the index of each value as they are not sorted properly
                        int unedited = (int) gennumbsarr.get(counter2);
                        gennumbsarr.set(counter2, gennumbsarr.get(counter2 + 1));
                        gennumbsarr.set(counter2+1, unedited);
                    }
        }
    }

    public BubbleSort() {

        //sets the jlist to be what will be edited
        list1.setModel(model);

        //sets the size of the form
        panel1.setPreferredSize( new Dimension(1300, 250));

        //creates arraylist
        ArrayList gennumbs = new ArrayList();

        bthGenVals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //clears the arrlist
                gennumbs.clear();

                //clears the jlist
                model.clear();

                //adds the random numbs to the jlist and the arraylist
                for (int counter = 0; counter<= 249; counter++){
                    randnumb= new Random().nextInt(1000)+1;

                    gennumbs.add(randnumb);

                    model.addElement(String.valueOf(randnumb));
                }

            }
        });
        btnSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (gennumbs.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please generate values first");

                }
                else{
                    //sorts the arraylist
                    bubblesort(gennumbs);

                    //clears the list
                    model.clear();

                    for (int counter=0; counter <=249; counter++){
                        //adds the ordered values to the jlist
                        model.addElement(String.valueOf(gennumbs.get(counter)));
                    }
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new BubbleSort().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
