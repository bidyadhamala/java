import java.awt.*;                                                              

public class LabelExample extends Frame{
public LabelExample(){
setTitle("Label Example");
setSize(400, 400);
setLayout(null);
Label l1 = new Label();
l1.setText("First Label");
l1.setAlignment(Label.LEFT);
l1.setBounds(20, 30, 40, 60);

Label l2=new Label("Second Lable",Lable.RIGHT);
ss
}
public static void main(String[] args){
new LabelExample();
}
}