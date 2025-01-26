import java.awt.*;
public class CheckboxExample extends Frame{
public ChecjboxExample(){
setTittle("Example");
setSize(200,300);
setLayout(null);
setVisual(true);

label l1=new Label("Hobbies");

Checkboxc1= new Checkbox("dancing");
Checkboxc2= new Checkbox("singing");
l1.setBounds(10,30,50,70);
c1.setBounds(80,100,120,140);
c2.setBounds(160,180,200,210);

label l2=new Label("Gender");

Checkboxc3= new Checkbox("Male", cbg,false);
Checkboxc4= new Checkbox("Female", cbg,true);
l1.setBounds(10,30,50,70);
c1.setBounds(80,100,120,140);
c2.setBounds(160,180,200,210);
add(l1);
add(c1);
add(c2);
add(l2);
add(c3);
add(c4);
}
public static void main(String[] args){
new CheckboxExample();
}
}


