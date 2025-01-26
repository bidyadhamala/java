import java.awt.*;
import java.awt.event.*;

public class ButtonExample extends Frame{

ButtonExample(){
setSize(200,200);
setTitle("Event");
setLayout(new FlowLayout());
TextField t1= new TextField(40);
add(t1);
Button b1= new Button("Click");
Label l1=new Label();

add(b1);
add(l1);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
System.out.println("Click");
l1.setText(t1.getText());
}
});
setVisible(true);
}
public static void main (String args[]){
 new ButtonExample();
}
} 