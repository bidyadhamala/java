import javax.swing.*;
import java.awt.*;
import javax.awt.event.*;

public class SwingExample extends JFrame{

SwingExample(){
setTitle("Test");
setSize(400,400);
setLayout(new FlowLayout());

JButton b1=new JButton("Test");
add(b1);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
System.out.println("Hello World");
}

});
setVisible(true);
}
public static void main(String args[]){
new SwingExample();
}
}
