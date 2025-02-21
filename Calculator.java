import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 class calculatordemo implements ActionListener {
  private JFrame frame;
  private JTextField tf;
  private JButton b1;

  void calculator(){
  frame = new JFrame("DEMO");
  frame.setSize(400,300);
  frame.setLayout(new BorderLayout());
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 tf= new JTextField(50);
frame.add(tf, BorderLayout.NORTH);
JPanel panel = new JPanel();
panel.setSize(400,300);
panel.setLayout(new GridLayout(4,4,3,3));

b1=new JButton ("1");
b1.setSize(100,100);
b1.addActionListener(this);
JButton b2=new JButton ("2");
b2.setSize(100,100);
b2.setLayout(null);
JButton b3=new JButton ("3");
b3.setSize(100,100);
b3.setLayout(null);
JButton b4=new JButton ("4");
b4.setSize(100,100);
b4.setLayout(null);
JButton b5=new JButton ("5");
b5.setSize(100,100);
b5.setLayout(null);
JButton b6=new JButton ("6");
b6.setSize(100,100);
b6.setLayout(null);
JButton b7=new JButton ("7");
b7.setSize(100,100);
b7.setLayout(null);
JButton b8=new JButton ("8");
b8.setSize(100,100);
b8.setLayout(null);
JButton b9=new JButton ("9");
b9.setSize(100,100);
b9.setLayout(null);
JButton b10=new JButton ("0");
b10.setSize(100,100);
b10.setLayout(null);
JButton b11=new JButton ("+");
b11.setSize(100,100);
b11.setLayout(null);
JButton b12=new JButton ("-");
b12.setSize(100,100);
b12.setLayout(null);
JButton b13=new JButton ("*");
b13.setSize(100,100);
b13.setLayout(null);
JButton b14=new JButton ("/");
b14.setSize(100,100);
b14.setLayout(null);
JButton b15=new JButton ("=");
b15.setSize(100,100);
b15.setLayout(null);
JButton b16=new JButton ("CLEAR");
b16.setSize(100,100);
b16.setLayout(null);

panel.add(b1);
panel.add(b2);
panel.add(b3);
panel.add(b4);
panel.add(b5);
panel.add(b6);
panel.add(b7);
panel.add(b8);
panel.add(b9);
panel.add(b10);
panel.add(b11);
panel.add(b12);
panel.add(b13);
panel.add(b14);
panel.add(b15);
panel.add(b16);
frame.add(panel, BorderLayout.CENTER);
 frame.setVisible(true);
  }
public static void main(String [] args){
    calculatordemo obj = new calculatordemo();
    obj.calculator();
}

public void actionPerformed(ActionEvent e) {
    System.out.println("Button 1 called");
     tf.setText(b1.getText());
    if(e.getSource() == b1) {
        System.out.println("Button 1 called");
       
    }
}
}
