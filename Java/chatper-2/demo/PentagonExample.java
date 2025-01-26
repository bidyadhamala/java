import java.awt.*;

public class PentagonExample extends Frame {
public PentagonExample() {
this.setTitle("Pentagon draw");
this.setSize(400, 400); 
this.setLayout(null);
this.setVisible(true);
}
public void paint(Graphics g) {
g.setColor(Color.red);
int[] xPoints = {100, 150, 125, 75, 50};
        int[] yPoints = {50, 100, 150, 150, 100};

        g.fillPolygon(xPoints, yPoints, 5); 
    }

    public static void main(String[] args) {
        new PentagonExample();
    }
}
