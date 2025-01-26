import java.awt.*;
public class LayoutDemoExample extends Frame{
public LayoutDemoExample(){
setSize(200,200);
setTitle("Form");
setLayout(null);
setVisible(true);

Label l1=new Label("Name:-");
l1.setBounds(100,100,80,20);
add(l1);
TextField t1=new TextField("");
t1.setBounds(180,100,80,20);
add(t1);

Label l2=new Label("Address:-");
l2.setBounds(100,140,80,20);
add(l2);
TextField t2=new TextField("");
t2.setBounds(180,140,80,20);
add(t2);

Label l3=new Label("Gender");
l3.setBounds(100,240,80,20);
 add(l3);
Checkbox c1= new Checkbox("F");
Checkbox c2= new Checkbox("M");
c1.setBounds(190,240,80,20);
c2.setBounds(280,240,80,20);
add(c1);
add(c2);

Label l4=new Label("Country");
l4.setBounds(100,380,80,20);
add(l4);
Choice c=new Choice();
c.setBounds(180,380,80,20);
c.add("Nepal");
c.add("India");
c.add("China");
c.add("Japan");
add(c);
Button submitButton = new Button("Submit");
submitButton.setBounds(220, 480, 80, 20);
add(submitButton);
Button cancelButton = new Button("Cancel");
cancelButton.setBounds(360, 480, 80, 20);
add(cancelButton);
}
public static void main(String []args){
new LayoutDemoExample();
}
}
