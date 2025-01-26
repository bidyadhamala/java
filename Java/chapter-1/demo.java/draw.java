import java.awt.*;

public class draw{
   
  public static void main(String args[]){
    Frame frame = new Frame();
              
    frame.setTitle("Draw");
    frame.setSize(400, 400); 
    frame.setLayout(null);

    frame.setVisible(true); 

    Label label = new Label("Hello");
    label.setBounds(40, 20, 80, 50);
    frame.add(label);
  }
}