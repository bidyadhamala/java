import java.awt.*;
import java.awt.event.*;

public class RadioButtonEvent extends Frame{

RadioButtonEvent(){
setSize(200,200);
setTitle("event");
setLayout(FlowLayout());

cbg=new CheckboxGroup();
Checkbox c1= new Checkbox("Male",cbg,false);
c1.setBounds(10,50,100,30);

Checkbox c1= new Checkbox("Female",cbg,false);
c1.setBounds(10,100,100,30);

c1.ItemListener(new ItemListener(){
public void itemStateChanged(ItemEvent e){
}
});
setVisible(true);
}
public static void main (String args[]){
new RadioButtonEvent();
}
}