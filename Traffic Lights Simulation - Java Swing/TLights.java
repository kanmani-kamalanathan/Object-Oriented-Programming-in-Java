import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
class Trafficlight extends JFrame implements ItemListener
{
public JLabel l1, l2;
public JRadioButton r1, r2, r3;
public ButtonGroup bg;
public JPanel p, p1;
CheckboxGroup lngGrp;
public Trafficlight()
{
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new GridLayout(2, 1));
setSize(800, 400);
p = new JPanel(new FlowLayout());
p1 = new JPanel(new FlowLayout());
l1 = new JLabel();
Font f = new Font("Verdana", Font.BOLD, 60);
l1.setFont(f); add(l1); p.add(l1);
add(p);
l2 = new JLabel("Select Lights");
p1.add(l2);
lngGrp = new CheckboxGroup();
Checkbox r1 = new Checkbox("Red Light", lngGrp, true);
r1.setBackground(Color.red);
p1.add(r1);
r1.addItemListener(this);
Checkbox r2 = new Checkbox("Yellow Light", lngGrp, true);
r2.setBackground(Color.YELLOW);
p1.add(r2);
r2.addItemListener(this);
Checkbox r3 = new Checkbox("Green Light", lngGrp, true);
r3.setBackground(Color.GREEN);
p1.add(r3);
r3.addItemListener(this);
add(p1);
setVisible(true);
}
public void itemStateChanged(ItemEvent i)
{
Checkbox chk = lngGrp.getSelectedCheckbox();
switch (chk.getLabel())
{
case "Red Light":
l1.setText("STOP");
l1.setForeground(Color.red);
break;
case "Yellow Light":
l1.setText("Ready");
l1.setForeground(Color.YELLOW);
break;
case "Green Light":
l1.setText("GO");
l1.setForeground(Color.GREEN);
break;
}
}
}
public class TLights {
public static void main(String[] args)
{
Trafficlight a = new Trafficlight();
}
}
