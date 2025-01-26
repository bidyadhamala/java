import javax.swing.*;
import java.awt.*;
import javax.awt.event.*;

public class SwingButtonExample extends JFrame{
SwingButtonExample(){
setSize(200,200);
setTitle("Event");
setLayout(new GridLayout(2,2));

JLabel l1= new JLabel("Name");
l1.setBounds(50,50,80,20);
add(l1);

JTextField t1=new JTextField("");
t1.setBounds(150,50,100,20);
add(t1);
JLabel l3=new JLabel("");
add(l3);

JButton b1 = new JButton("Click");
b1.setBounds(100, 180, 80, 30);
add(b1);

b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
System.out.println("Click");
String a=t1.getText();

l3.setText("my name is " +a);


}
});
setVisible(true);
}
public static void main(String args[]){
new SwingButtonExample();
}
}

