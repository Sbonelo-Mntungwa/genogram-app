import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Gui {

    public Gui() {
        JFrame frame = new JFrame();
        frame.setBounds(10, 10, 500, 500);
        frame.setDefaultCloseOperation(3);

        JPanel panel = new JPanel() {
            @Override
            public void paint(Graphics g) {
                g.drawRect(10, 10, 100, 100);
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