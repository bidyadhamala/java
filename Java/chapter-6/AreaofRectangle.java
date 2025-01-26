import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="AreaofRectangle.class" height="400" width="400"></applet>*/

public class AreaofRectangle extends Applet implements ActionListener {

TextField lengthField, breadthField, resultField;
Button calculateButton;

public void init() {
setLayout(new FlowLayout());

add(new Label("Length:"));
lengthField = new TextField(10);
add(lengthField);

add(new Label("Breadth:"));
breadthField = new TextField(10);
add(breadthField);

calculateButton = new Button("Calculate");
calculateButton.addActionListener(this);
add(calculateButton);

add(new Label("Area of Rectangle:"));
resultField = new TextField(10);
resultField.setEditable(false);
add(resultField);
}
public void actionPerformed(ActionEvent e) {
try {
double length = Double.parseDouble(lengthField.getText());
double breadth = Double.parseDouble(breadthField.getText());
double areaOfRectangle = length * breadth;
resultField.setText(String.valueOf(areaOfRectangle));
} catch (NumberFormatException ex) {
resultField.setText("Invalid input. Please enter numbers only.");
        }
    }
}