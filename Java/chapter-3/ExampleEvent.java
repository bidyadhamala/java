import java.awt.*;
import java.awt.event.*;
public class ExampleEvent extends Frame{
ExampleEvent(){
setSize(200,200);
setTitle("Event");
setLayout(new FlowLayout());
Button b1=new Button ("Click Me!");
Label l1=new Label();
add(l1);
add(b1);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
System.out.println("HelloWorld");
l1.setText("Hi");
}
});
setVisible(true);
}
public static void main (String args[]){
new ExampleEvent();
}
}