/*
 * Created by: Ben Motz
 * Created on: March 28, 2020
 * Created for: ICS4U
 * Major Assignment #3, Binary Search
 * This program uses binary search to find a value in an array
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.ArrayList;

public class BinarySearch {

    private JPanel panel1;
    private JList list1;
    private JButton btnGenerateValues;
    private JButton btnSortValues;
    private JTextField txtdesiredval;
    private JButton btnfindThisValue;
    private JLabel lblValueAt;
    private DefaultListModel<String> model= new DefaultListModel<>();

    public static int randomnumb;

    public static int desval;


    public static String binarysearch(ArrayList valsarray, int desval){
        String indexfound;

        int prevmidindex = 0;
        int midindex=0;
        int minindex;
        int maxindex;

        int length = valsarray.size();

        if (desval > (int) valsarray.get(length-1) || desval < (int) valsarray.get(0)){
            indexfound="This value does not exist in this number set";
        }
        else{
            maxindex = length;
            minindex=0;
            midindex=(maxindex+minindex)/2;

            while (desval!=(int)valsarray.get(midindex) && prevmidindex!=midindex){
                prevmidindex=midindex;
                if (desval<(int) valsarray.get((midindex))){
                    maxindex=midindex;
                }
                else{
                    minindex=midindex;
                }
                midindex= (maxindex+minindex)/2;
                System.out.println(midindex);
                System.out.println(prevmidindex);
            }

            if (desval==(int)valsarray.get(midindex)){
                indexfound= "This value is found at index: " + String.valueOf(midindex);
            }
            else {
                indexfound="This value does not exist in this number set";
            }
        }
        return indexfound;
    }

    void Sort(ArrayList valuesarr)
    {
        int length = valuesarr.size();

        //loops until array is ordered properly
        for (int counter = 0; counter < length - 1; counter++)

            for (int counter2 = 0; counter2 < length-1; counter2++)

                //checks if the values need to be switched
                if ((int) valuesarr.get(counter2) > (int) valuesarr.get(counter2+1))
                {
                    //changes the index of each value as they are not sorted properly
                    int unedited = (int) valuesarr.get(counter2);
                    valuesarr.set(counter2, valuesarr.get(counter2 + 1));
                    valuesarr.set(counter2+1, unedited);
                }
    }

    public BinarySearch() {
        //sets list as model
        list1.setModel(model);
        panel1.setPreferredSize( new Dimension(1300, 250));


        ArrayList values = new ArrayList();

        btnGenerateValues.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                values.clear();
                model.clear();

                for (int counter = 0; counter<= 249; counter++){
                    randomnumb= new Random().nextInt(1000)+1;

                    values.add(randomnumb);

                    model.addElement(String.valueOf(randomnumb));
                }
            }
        });
        btnSortValues.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Sort(values);
                model.clear();

                for (int counter=0; counter <=249; counter++){
                    model.addElement(String.valueOf(values.get(counter)));
                }
            }
        });
        btnfindThisValue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    desval= Integer.parseInt(txtdesiredval.getText());

                    if (desval>1000 || desval < 0){
                        JOptionPane.showMessageDialog(null, "Please only enter ints between 0-1000");
                    }
                    else{

                        lblValueAt.setText(binarysearch(values, desval));
                    }
                }
                catch(Exception e1){
                    JOptionPane.showMessageDialog(null, "Please enter valid information");
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new BinarySearch().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
