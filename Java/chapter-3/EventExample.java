import java.awt.*;
import java.awt.event.*;

public class EventExample extends Frame{

EventExample(){
setSize(200,200);
setTitle("Event");
setLayout(new GridLayout(2,2));

Label l1= new Label("Name");
l1.setBounds(50,50,80,20);
add(l1);

TextField t1=new TextField("");
t1.setBounds(150,50,100,20);
add(t1);

Label l2= new Label("Last Name");
l2.setBounds(50,100,80,20);
add(l2);

TextField t2=new TextField("");
t2.setBounds(150,100,100,20);
add(t2);

Label l3= new Label("");
l3.setBounds(50,200,80,20);
add(l3);
Button b1 = new Button("Click");
b1.setBounds(100, 180, 80, 30);
add(b1);


b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
System.out.println("Click");
String a=t1.getText();
String b= t2.getText();
l3.setText("my name is"+ a + " "+b);


}
});
setVisible(true);
}
public static void main(String args[]){
new EventExample();
}
}
