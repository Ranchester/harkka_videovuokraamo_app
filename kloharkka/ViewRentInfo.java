import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ViewRentInfo extends JPanel {
/*comment again!*/
  private static void ViewRentInfo() {

  JFrame frame = new JFrame("Vuokraussovellus");

  ImageIcon icon = new ImageIcon("pipboy.png");

  JLabel mainLabel = new JLabel("VUOKRAUSSOVELLUS", icon, JLabel.CENTER);

  JLabel topicLabel = new JLabel("KATSO VUOKRAUSTIETO", JLabel.LEFT);

  mainLabel.setOpaque(true);
  mainLabel.setPreferredSize(new Dimension(300, 100));
  mainLabel.setBackground(new Color(250,250,250));
  mainLabel.setVerticalTextPosition(JLabel.CENTER);
  mainLabel.setHorizontalTextPosition(JLabel.LEFT);
  mainLabel.setBorder(BorderFactory.createLineBorder(Color.black));

  JPanel GridPanel = new JPanel();

  GridPanel.setLayout(new GridBagLayout());

  GridBagConstraints c = new GridBagConstraints();
  
  JLabel AddDVDLabel = new JLabel("Katso vuokraustieto");
  c.fill = GridBagConstraints.HORIZONTAL;
  c.insets = new Insets(10,0,0,0); 
  c.gridx = 0;
  c.gridy = 0;
  GridPanel.add(AddDVDLabel, c);
  
  JTextArea RentInfo = new JTextArea(10, 10);
  c.fill = GridBagConstraints.HORIZONTAL;
  c.insets = new Insets(10,0,0,0); 
  c.gridx = 0;
  c.gridy = 1;
  GridPanel.add(RentInfo, c);
  
  final JButton Paluu = new JButton("Paluu");
  c.fill = GridBagConstraints.HORIZONTAL;
  c.insets = new Insets(10,0,0,0); 
  c.gridx = 0;
  c.gridy = 2;
  GridPanel.add(Paluu, c);
  
  Paluu.addActionListener (new ActionListener() { 
	  
	  public void actionPerformed(ActionEvent e){
          Container Frame = Paluu.getParent();
          do Frame = Frame.getParent(); 
          while (!(Frame instanceof JFrame));                                      
          ((JFrame) Frame).dispose();
      }

  });
  
  topicLabel.setOpaque(true);

//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  
  frame.getContentPane().add(mainLabel, BorderLayout.PAGE_START);
  
  frame.add(GridPanel);

  frame.setIconImage(new ImageIcon("pipboy_icon.jpg").getImage());

  frame.setSize(600, 300);

  frame.pack();

  frame.setVisible(true);

  }

  public static void main( String [] args ) {

    javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ViewRentInfo();
            }
    });

  }
}