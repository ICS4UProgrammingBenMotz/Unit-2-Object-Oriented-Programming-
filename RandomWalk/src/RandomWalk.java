import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class RandomWalk extends JPanel {
    private JPanel panel2;
    private Object Graphics2D;
    public ArrayList colours = new ArrayList();
   public  List pointList;
    public Color selectedColor;
    public Ellipse2D selectedPoint;


    public int randnumb(int max){
        return new Random().nextInt(max)+1;
    }
    public JColorChooser gencolour(){
        int numb = randnumb(colours.size());

        return (JColorChooser) colours.get(numb);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        Ellipse2D e;
        Color color;
        for (int j = 0; j < pointList.size(); j++) {
            e = (Ellipse2D) pointList.get(j);
            if (e == selectedPoint)
                color = Color.BLUE;
            else
                color = Color.blue;
            g2.setPaint(color);
            g2.fill(e);


        }
    }
    public RandomWalk(int FSX, int FSY, int TRX, int TRY){

        pointList = new List();
        panel2.setPreferredSize(new Dimension(FSX,FSY));

        colours.add(Color.BLUE);
        colours.add(Color.RED);
        colours.add(Color.GREEN);
        colours.add(Color.CYAN);
        colours.add(Color.BLACK);
        colours.add(Color.PINK);

    }
    public static void main(int FSX, int FSY, int TRX, int TRY) {
        try {
            JFrame frame = new JFrame("Random Walk");
            frame.setContentPane(new RandomWalk(FSX, FSY, TRX, TRY).panel2);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);

            while (true) {
                frame.repaint();
            }
        }
        catch (Exception e){
            System.exit(0);
        }

    }
}
