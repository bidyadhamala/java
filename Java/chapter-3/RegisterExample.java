import java.awt.*;
import java.awt.event.*;

public class RegisterExample extends Frame{

RegisterExample(){
setTitle("Login form");
setSize(400, 400);
setLayout(new FlowLayout());


Label l1 = new Label("Username:");
l1.setBounds(50, 50, 80, 30);
add(l1);
TextField t1 = new TextField();
t1.setBounds(150, 50, 200, 30);
add(t1);
Label l2 = new Label("Password:");
l2.setBounds(50, 100, 80, 30);
add(l2);
TextField t2 = new TextField();
t2.setBounds(150, 100, 200, 30);
 add(t2);

Button b1=new Button("Login");
Button b2=new Button("Cancel");
add(b1);
add(b2);
setVisible(true);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){

String username=t1.getText();
String data ="admin";
String password= t2.getText();
String validusername="admin";
if(username.equals(validUsername)){
System.out.println("Login successful");
}else{
System.out.println("Invalid username!");
}
}
});
}
public static void main(String args[]){
new RegisterExample();
}
}
