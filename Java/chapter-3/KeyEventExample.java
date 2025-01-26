import java.awt.*;
import java.awt.event.*;

public class KeyEventExample extends Frame {

    KeyEventExample() {
        setSize(200, 200);
        setTitle("Key Event Example");
        setLayout(new FlowLayout());

        TextField t1 = new TextField(60);
        add(t1);

              t1.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
                System.out.println(t1.getText()); 
            }

            public void keyReleased(KeyEvent e) {
                
            }

            public void keyTyped(KeyEvent e) {
                
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyEventExample();  
    }
}
