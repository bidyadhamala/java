import java.awt.*;
public class ButtonExample extends Frame{
public ButtonExample(){
setTitle("Button Example");
setSize(400,400);
setLayout(null);
setVisible(true);
Button b1 =new Button();
b1.setLabel("Submit");
b1.setBounds(20,30,40,60);
add(b1);
}
public static void main(String args[]){
new ButtonExample();
}
}
