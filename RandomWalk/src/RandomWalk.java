import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class RandomWalk extends JPanel {
    private JPanel panel2;
    private Object Graphics2D;
    public ArrayList colours = new ArrayList();

    public int randnumb(int max){
        return new Random().nextInt(max)+1;
    }
    public JColorChooser gencolour(){
        int numb = randnumb(colours.size());

        return (JColorChooser) colours.get(numb);
    }

    protected void paintcomponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        panel2.paint(g2);

        g2.setPaint((Paint) gencolour());

        g2.drawLine(1,1,1,1);


    }

    public RandomWalk(int FSX, int FSY, int TRX, int TRY){


        panel2.setPreferredSize(new Dimension(FSX,FSY));
        Graphics g= 0;
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        panel2.paint(g2);
        


        colours.add(Color.BLUE);
        colours.add(Color.RED);
        colours.add(Color.GREEN);
        colours.add(Color.CYAN);
        colours.add(Color.BLACK);
        colours.add(Color.PINK);

        g2.setPaint((Paint) gencolour());
        g2.drawLine(1,1,1,1);
    }
    public static void main(int FSX, int FSY, int TRX, int TRY) {
        JFrame frame = new JFrame("Random Walk");
        frame.setContentPane(new RandomWalk(FSX, FSY, TRX, TRY).panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
