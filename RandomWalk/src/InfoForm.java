import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Normalizer;

public class InfoForm {
    private JLabel lblFormSize;
    private JLabel lblTargetSize;
    private JSpinner spnFormSizeY;
    private JSpinner spnTargetSizeY;
    private JSpinner spnTargertSizeX;
    private JSpinner spnFormSizeX;
    private JLabel lbl1;
    private JLabel lbl2;
    private JPanel panel1;
    private JButton btnSubmit;

    public int FSX;
    public int FSY;
    public int TRX;
    public int TRY;

    public InfoForm() {

        panel1.setPreferredSize(new Dimension(400,250));
        spnFormSizeX.setValue(200);
        spnFormSizeY.setValue(200);
        spnTargetSizeY.setValue(20);
        spnTargertSizeX.setValue(20);

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                FSX = (int) spnFormSizeX.getValue();
                FSY = (int) spnFormSizeY.getValue();

                TRX = (int) spnTargertSizeX.getValue();
                TRY = (int) spnTargetSizeY.getValue();

                RandomWalk.main(FSX, FSY, TRX, TRY);
                panel1.setVisible(false);
                panel1.setOpaque(true);
                panel1.setEnabled(false);
            }
        });
        spnFormSizeX.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                if ((int)spnFormSizeX.getValue()<200){
                    spnFormSizeX.setValue(200);
                }
                else if ((int)spnFormSizeX.getValue()>800 ){
                    spnFormSizeX.setValue(800);
                }
            }
        });

        spnFormSizeY.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                if ((int)spnFormSizeY.getValue()<200){
                    spnFormSizeY.setValue(200);
                }
                else if ((int)spnFormSizeY.getValue()>800 ){
                    spnFormSizeY.setValue(800);
                }
            }
        });
        spnTargertSizeX.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                if ((int)spnTargertSizeX.getValue()<20){
                    spnTargertSizeX.setValue(20);
                }
                else if ((int)spnTargertSizeX.getValue()>100 ){
                    spnTargertSizeX.setValue(100);
                }
            }
        });
        spnTargetSizeY.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                if ((int)spnTargetSizeY.getValue()<20){
                    spnTargetSizeY.setValue(20);
                }
                else if ((int)spnTargetSizeY.getValue()>100 ){
                    spnTargetSizeY.setValue(100);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new InfoForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
