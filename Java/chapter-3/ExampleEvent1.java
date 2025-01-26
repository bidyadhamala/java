import java.awt.*;
import java.awt.event.*;
public class ExampleEvent1 extends Frame implements Action Listener{
Label l1;
Button b1;
ExampleEvent(){
setSize(200,200);
setTitle("Event");
setLayout(new FlowLayout());
 b1=new Button ("Click Me!");
 l1=new Label();
add(l1);
add(b1);
b1.addActionListener(this);
setVisible(true);
public void actionPerformed(ActionEvent e){
System.out.println("HelloWorld");
l1.setText("Hi");
}
});
}
public static void main (String args[]){
new ExampleEvent();
}
