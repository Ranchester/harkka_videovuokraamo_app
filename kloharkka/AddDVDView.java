import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddDVDView extends JPanel {

  private static void AddDVDView() {

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

  JLabel AddDVDLabel = new JLabel("Lisää DVD-tieto");
  c.fill = GridBagConstraints.HORIZONTAL;
  c.insets = new Insets(10,0,0,0); 
  c.gridx = 0;
  c.gridy = 0;
  GridPanel.add(AddDVDLabel, c);

  JLabel DVDnro = new JLabel("DVD-nro");
  c.fill = GridBagConstraints.HORIZONTAL;
  c.insets = new Insets(10,0,0,0); 
  c.gridx = 0;
  c.gridy = 2;
  GridPanel.add(DVDnro, c);

  JTextField DVDnroT = new JTextField(10);
  c.fill = GridBagConstraints.HORIZONTAL;
  c.insets = new Insets(10,0,0,0); 
  c.gridx = 1;
  c.gridy = 2;
  GridPanel.add(DVDnroT, c);

  JLabel AsiakasNro = new JLabel("DVD-nimi");
  c.fill = GridBagConstraints.HORIZONTAL;
  c.insets = new Insets(10,0,0,0); 
  c.gridx = 0;
  c.gridy = 4;
  GridPanel.add(AsiakasNro, c);

  JTextField AsiakasNroT = new JTextField(10);
  c.fill = GridBagConstraints.HORIZONTAL;
  c.insets = new Insets(10,0,0,0); 
  c.gridx = 1;
  c.gridy = 4;
  GridPanel.add(AsiakasNroT, c);

  JLabel VuokrausPv = new JLabel("DVD-genre");
  c.fill = GridBagConstraints.HORIZONTAL;
  c.insets = new Insets(10,0,0,0); 
  c.gridx = 0;
  c.gridy = 6;
  GridPanel.add(VuokrausPv, c);

  JTextField VuokrausPvT = new JTextField(10);
  c.fill = GridBagConstraints.HORIZONTAL;
  c.insets = new Insets(10,0,0,0); 
  c.gridx = 1;
  c.gridy = 6;
  GridPanel.add(VuokrausPvT, c);

  JLabel PalautusPv = new JLabel("Ikäraja");
  c.fill = GridBagConstraints.HORIZONTAL;
  c.insets = new Insets(10,0,0,0); 
  c.gridx = 0;
  c.gridy = 8;
  GridPanel.add(PalautusPv, c);

  JTextField PalautusPvT = new JTextField(10);
  c.fill = GridBagConstraints.HORIZONTAL;
  c.insets = new Insets(10,0,0,0); 
  c.gridx = 1;
  c.gridy = 8;
  GridPanel.add(PalautusPvT, c);

  JButton Tallenna = new JButton("Tallenna");
  
  Tallenna.setActionCommand("tallenna");
  Tallenna.addActionListener(new ActionListener() { 
	    public void actionPerformed(ActionEvent event){
	  	  if(event.getActionCommand().equals("tallenna"))
	        {
	          NoInfo();

	        }
	      }
	  });
  
  c.fill = GridBagConstraints.HORIZONTAL;
  //c.weighty = 1.0;
  c.insets = new Insets(10,0,0,0); 
  c.gridx = 0;
  c.gridy = 10;
  GridPanel.add(Tallenna, c);

  final JButton Paluu = new JButton("Paluu");

  Paluu.addActionListener (new ActionListener() { 
	  
	  public void actionPerformed(ActionEvent e){
          Container Frame = Paluu.getParent();
          do Frame = Frame.getParent(); 
          while (!(Frame instanceof JFrame));                                      
          ((JFrame) Frame).dispose();
      }

  });

  c.fill = GridBagConstraints.HORIZONTAL;
  //c.weighty = 1.0;
  c.insets = new Insets(10,0,0,0); 
  c.gridx = 1;
  c.gridy = 10;
  GridPanel.add(Paluu, c);

  frame.getContentPane().add(mainLabel, BorderLayout.PAGE_START);
  
  frame.add(GridPanel);

  //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  frame.setIconImage(new ImageIcon("pipboy_icon.jpg").getImage());

  frame.setSize(600, 300);

  frame.pack();

  frame.setVisible(true);

  }
  
  private static void NoInfo(){
	  
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

	  JLabel AddDVDLabel = new JLabel("Tiedot puutteelliset!");
	  c.fill = GridBagConstraints.HORIZONTAL;
	  c.insets = new Insets(10,0,0,0); 
	  c.gridx = 0;
	  c.gridy = 0;
	  GridPanel.add(AddDVDLabel, c);
	  
	  final JButton Paluu = new JButton("Paluu");
	  
	  Paluu.addActionListener (new ActionListener() { 
		  
		  public void actionPerformed(ActionEvent e){
	          Container Frame = Paluu.getParent();
	          do Frame = Frame.getParent(); 
	          while (!(Frame instanceof JFrame));                                      
	          ((JFrame) Frame).dispose();
	      }

	  });

	  c.fill = GridBagConstraints.HORIZONTAL;
	  //c.weighty = 1.0;
	  c.insets = new Insets(10,0,0,0); 
	  c.gridx = 0;
	  c.gridy = 1;
	  GridPanel.add(Paluu, c);
	  
	  frame.getContentPane().add(mainLabel, BorderLayout.PAGE_START);
	  
	  frame.add(GridPanel);
	  
	  //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	  frame.setIconImage(new ImageIcon("pipboy_icon.jpg").getImage());

	  frame.setSize(600, 300);

	  frame.pack();

	  frame.setVisible(true);
	  
  }

  public static void main( String [] args ) {

    javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                AddDVDView();
            }
    });

  }

}
