import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Testi2 extends JPanel {

  public static void Testi2() {

  JFrame frame = new JFrame();

  JPanel testpanel = new JPanel();

  testpanel.setLayout(new GridBagLayout());

  GridBagConstraints c = new GridBagConstraints();

  JButton testbutton = new JButton("Close");

  testbutton.addActionListener (new ActionListener() { 
      public void actionPerformed(ActionEvent event){
	    System.exit(0);
      }
  });

  c.fill = GridBagConstraints.HORIZONTAL;
  c.gridx = 0;
  c.gridy = 0;
  testpanel.add(testbutton, c);

  JButton testbutton2 = new JButton("Testbutton 2");
  c.fill = GridBagConstraints.HORIZONTAL;
  c.weightx = 0.5;
  c.gridx = 1;
  c.gridy = 0;
  testpanel.add(testbutton2, c);

  JLabel testlabel = new JLabel("höpöhöpö");
  c.fill = GridBagConstraints.HORIZONTAL;
  c.ipady = 40;
  c.gridx = 0;
  c.gridy = 3;
  testpanel.add(testlabel, c);

  JButton testbutton3 = new JButton("Testbutton 3");
  c.ipady = 0;
  c.ipadx = 20;
  c.weightx = 1.0;
  c.gridx = 0;
  c.gridy = 4;
  //c.ipadx = 40;
  testpanel.add(testbutton3, c);

  JLabel statusbar = new JLabel("Jee");  
  c.gridx = 0;
  c.gridy = 20;
  testpanel.add(statusbar, c);

  frame.setSize(600,300);

  frame.add(testpanel);

  frame.pack();
  
  frame.setVisible(true);

  }






   public static void main( String [] args ) {

    javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Testi2();
	
		//testi.setResizable(false);
            }
    });

  }

}