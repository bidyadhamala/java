import java.awt.*;
public class TextFieldExample extends Frame{
public TextFieldExample(){
setTitle("TextField Example");
setSize(400,400);
setLayout(null);
setVisible(true);
TextField t1 =new TextField(20);
t1.setEchoChar('*');
t1.setBounds(40,120,160,200);
add(t1);
}
public static void main(String args[]){
new TextFieldExample();
}
}
