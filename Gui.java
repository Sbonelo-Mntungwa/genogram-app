import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;

public class Gui {

    public Gui() {
        JFrame frame = new JFrame();
        frame.setBounds(10, 10, 500, 500);
        frame.setDefaultCloseOperation(3);

        JPanel panel = new JPanel() {
            @Override
            public void paint(Graphics graphics)  {
                Graphics2D graphics2D = (Graphics2D)graphics.create();
                graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                graphics2D.drawRect(10, 10, 100, 100);
                graphics2D.drawOval(150, 10, 100, 100);
                graphics2D.draw(new Polygon(new int[]{350, 320, 380}, new int[]{350, 380, 380}, 3));
            };
        };
        frame.add(panel);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        new Gui();
    }
}