import java.awt.*;
public class Login extends Frame {
public Login() {
this.setTitle("TextField Example");
this.setSize(400, 400);
this.setLayout(null);
this.setVisible(true);

Label l1 = new Label("Username:");
l1.setBounds(50, 100, 80, 30); 
add(l1);
TextField textField1 = new TextField();
textField1.setBounds(150, 100, 200, 30);
add(textField1);
 Label l2 = new Label("Password:");
l2.setBounds(50, 150, 80, 30); 
 add(l2);
TextField textField2 = new TextField();
textField2.setBounds(150, 150, 200, 30);
textField2.setEchoChar('*'); 
add(textField2);
Button submitButton = new Button("Submit");
submitButton.setBounds(150, 200, 80, 30);
add(submitButton);
Button cancelButton = new Button("Cancel");
cancelButton.setBounds(250, 200, 80, 30);
add(cancelButton);
}
public static void main(String[] args) {
new Login();
}
}
