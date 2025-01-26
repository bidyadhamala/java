import java.awt.*;


public class DialogboxExample extends Frame {
Dialog msgDialog;
public DialogboxExample(){
setLayout(new FlowLayout());
setVisible(true);
setSize(300,500);

msgDialog = new Dialog(this, "Dialog Test", true);
msgDialog.setLayout(new FlowLayout());
msgDialog.setSize(250, 100);
msgDialog.setVisible(true);
}
public static void main(String arg[]){
new DialogboxExample();
}

}