import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DummyInfo extends JPanel {
/*comment again!*/
  private static void DummyInfo() {

  JFrame frame = new JFrame("Vuokraussovellus");

  ImageIcon icon = new ImageIcon("pipboy.png");

  JLabel mainLabel = new JLabel("VUOKRAUSSOVELLUS", icon, JLabel.CENTER);

  JLabel topicLabel = new JLabel("KATSO DVD-TIETO", JLabel.LEFT);

  JLabel DVD_tietolabel = new JLabel("DVD-numero", JLabel.LEFT);

  JTextField DVD_tieto = new JTextField(10);

  JPanel topicPanel = new JPanel();

  JPanel textPanel = new JPanel();

  JPanel buttonPanel = new JPanel();

  JButton haeButton = new JButton("Hae");

  JButton exitButton = new JButton("Poistu");

  mainLabel.setOpaque(true);
  mainLabel.setPreferredSize(new Dimension(300, 100));
  mainLabel.setBackground(new Color(250,250,250));
  mainLabel.setVerticalTextPosition(JLabel.CENTER);
  mainLabel.setHorizontalTextPosition(JLabel.LEFT);
  mainLabel.setBorder(BorderFactory.createLineBorder(Color.black));

  topicLabel.setOpaque(true);
  //topicLabel.setPreferredSize(new Dimension(300,50));
  //topicLabel.setBorder(BorderFactory.createLineBorder(Color.black));

  topicPanel.setPreferredSize(new Dimension (300,50));
  topicPanel.setBorder(BorderFactory.createLineBorder(Color.black));
  topicPanel.add(topicLabel);

  DVD_tietolabel.setOpaque(true);
  //DVD_tietolabel.setPreferredSize(new Dimension (300,50));
  //DVD_tietolabel.setBorder(BorderFactory.createLineBorder(Color.black));

  textPanel.setPreferredSize(new Dimension(300,100));
  textPanel.setBorder(BorderFactory.createLineBorder(Color.black));
  textPanel.add(topicPanel, BorderLayout.PAGE_START);
  textPanel.add(DVD_tietolabel, BorderLayout.LINE_START);
  textPanel.add(DVD_tieto, BorderLayout.LINE_END);

  buttonPanel.setBorder(BorderFactory.createLineBorder(Color.black));
  haeButton.setPreferredSize(new Dimension(100,25));
  exitButton.setPreferredSize(new Dimension(100,25));
  buttonPanel.add(haeButton);
  buttonPanel.add(exitButton); 
  
  frame.getContentPane().add(mainLabel, BorderLayout.PAGE_START);
  //frame.getContentPane().add(topicPanel, BorderLayout.CENTER);
  frame.getContentPane().add(textPanel, BorderLayout.CENTER);
  frame.getContentPane().add(buttonPanel, BorderLayout.PAGE_END);

  //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  frame.setIconImage(new ImageIcon("pipboy_icon.jpg").getImage());

  frame.setSize(600, 300);

  frame.pack();

  frame.setVisible(true);

  }

  public static void main( String [] args ) {

    javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                DummyInfo();
            }
    });

  }

}

//Metodi-kokoelma

//Sulje ikkuna

/**Paluu.addActionListener (new ActionListener() { 
	  
	  public void actionPerformed(ActionEvent e){
          Container Frame = Paluu.getParent();
          do Frame = Frame.getParent(); 
          while (!(Frame instanceof JFrame));                                      
          ((JFrame) Frame).dispose();
      }

});**/

//Avaa uusi ikkuna

/**Tallenna.addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent event){
  	  if(event.getActionCommand().equals("tallenna"))
        {
          NoInfo();

        }
      }
  }); **/

//Ei tietoa l�ytynyt

/**
 * private static void NoInfo(){
	  
	  JFrame frame = new JFrame("Vuokraussovellus");

	  ImageIcon icon = new ImageIcon("pipboy.png");

	  JLabel mainLabel = new JLabel("VUOKRAUSSOVELLUS", icon, JLabel.CENTER);

	  mainLabel.setOpaque(true);
	  mainLabel.setPreferredSize(new Dimension(300, 100));
	  mainLabel.setBackground(new Color(250,250,250));
	  mainLabel.setVerticalTextPosition(JLabel.CENTER);
	  mainLabel.setHorizontalTextPosition(JLabel.LEFT);
	  mainLabel.setBorder(BorderFactory.createLineBorder(Color.black));
	  
	  JPanel GridPanel = new JPanel();

	  GridPanel.setLayout(new GridBagLayout());

	  GridBagConstraints c = new GridBagConstraints();

	  JLabel AddDVDLabel = new JLabel("Tietoa ei l�ytynyt!");
	  c.fill = GridBagConstraints.HORIZONTAL;
	  c.insets = new Insets(10,0,0,0); 
	  c.gridx = 0;
	  c.gridy = 0;
	  GridPanel.add(AddDVDLabel, c);
	  
	  frame.getContentPane().add(mainLabel, BorderLayout.PAGE_START);
	  
	  frame.add(GridPanel);
	  
	  //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	  frame.setIconImage(new ImageIcon("pipboy_icon.jpg").getImage());

	  frame.setSize(600, 300);

	  frame.pack();

	  frame.setVisible(true);
	  
  }

 **/

