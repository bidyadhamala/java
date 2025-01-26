import java.applet.*;
import java.awt.*;


/*<applet code="AppletDemo.class" height="400" width="400"></applet>*/

public class AppletDemo extends Applet{

public void init(){
  setBackground(Color.RED);

}


public void paint(Graphics g){
g.drawString("Hello",20,30);
}


}