import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Testi extends JPanel implements ActionListener{

  Testi2 testiframe;

  /*public static void*/ Testi() {

  JFrame frame = new JFrame();

  JPanel testpanel = new JPanel();

  Testi2 testiframe = new Testi2();

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
  testbutton2.addActionListener(this);
  testbutton2.setActionCommand("testi");
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

   public void actionPerformed(ActionEvent event)    {
        
	if(event.getActionCommand().equals("testi"))
        {
          testiframe.Testi2();
	  repaint();
	  //Testi2 frame = new Testi2();
	  //frame.setVisible(true);
        }
   }





   public static void main( String [] args ) {

    javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Testi testi = new Testi();
            }
    });

  }

}