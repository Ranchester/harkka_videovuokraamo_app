import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainView extends JPanel {
/*comment 3*/
  private static void MainView() {

  //JFrame.setDefaultLookAndFeelDecorated(true);

  JFrame frame = new JFrame("Vuokraussovellus");

  ImageIcon icon = new ImageIcon("pipboy.png");

  JButton DVD_katso = new JButton("Katso DVD-tieto");
  JButton DVD_lisaa = new JButton("Lisää DVD-tieto");
  JButton DVD_poista = new JButton("Poista DVD-tieto");

  JButton vuokraus_katso = new JButton("Katso vuokraustietoja");
  JButton vuokraus_lisaa = new JButton("Lisää vuokraustieto");
  JButton vuokraus_poista = new JButton("Poista vuokraustietoja");

  JButton asiakas_katso = new JButton("Katso asiakastietoja");
  JButton asiakas_lisaa = new JButton("Lisää asiakastieto");
  JButton asiakas_poista = new JButton("Poista asiakastieto");

  JLabel mainLabel = new JLabel("VUOKRAUSSOVELLUS", icon, JLabel.CENTER);
  
  mainLabel.setOpaque(true);
  mainLabel.setPreferredSize(new Dimension(800, 100));
  mainLabel.setBackground(new Color(250,250,250));
  mainLabel.setVerticalTextPosition(JLabel.CENTER);
  mainLabel.setHorizontalTextPosition(JLabel.LEFT);
  mainLabel.setBorder(BorderFactory.createLineBorder(Color.black));

  JLabel leftLabel = new JLabel("DVD-tiedot", JLabel.CENTER);
  leftLabel.setOpaque(true);
  leftLabel.setPreferredSize(new Dimension(250,50));
  leftLabel.setBorder(BorderFactory.createLineBorder(Color.black));

  JPanel leftPanel = new JPanel();
  leftPanel.setPreferredSize(new Dimension(250,300));
  leftPanel.setBorder(BorderFactory.createLineBorder(Color.black));
  DVD_katso.setPreferredSize(new Dimension(200,25));
  DVD_lisaa.setPreferredSize(new Dimension(200,25));
  DVD_poista.setPreferredSize(new Dimension(200,25));
  leftPanel.add(leftLabel);
  leftPanel.add(DVD_katso);
  leftPanel.add(DVD_lisaa);
  leftPanel.add(DVD_poista);
  
  JLabel centerLabel = new JLabel("Vuokraustiedot", JLabel.CENTER);
  centerLabel.setOpaque(true);
  centerLabel.setPreferredSize(new Dimension(300,50));
  centerLabel.setBorder(BorderFactory.createLineBorder(Color.black));

  JPanel centerPanel = new JPanel();
  centerPanel.setPreferredSize(new Dimension(300,300));
  centerPanel.setBorder(BorderFactory.createLineBorder(Color.black));
  vuokraus_katso.setPreferredSize(new Dimension(250,25));
  vuokraus_lisaa.setPreferredSize(new Dimension(250,25));
  vuokraus_poista.setPreferredSize(new Dimension(250,25));
  centerPanel.add(centerLabel);
  centerPanel.add(vuokraus_katso);
  centerPanel.add(vuokraus_lisaa);
  centerPanel.add(vuokraus_poista);

  JLabel rightLabel = new JLabel("Asiakastiedot", JLabel.CENTER);
  rightLabel.setOpaque(true);
  rightLabel.setPreferredSize(new Dimension(250,50));
  rightLabel.setBorder(BorderFactory.createLineBorder(Color.black));

  JPanel rightPanel = new JPanel();
  rightPanel.setPreferredSize(new Dimension(250,300));
  rightPanel.setBorder(BorderFactory.createLineBorder(Color.black));
  asiakas_katso.setPreferredSize(new Dimension(200,25));
  asiakas_lisaa.setPreferredSize(new Dimension(200,25));
  asiakas_poista.setPreferredSize(new Dimension(200,25));
  rightPanel.add(rightLabel);
  rightPanel.add(asiakas_katso);
  rightPanel.add(asiakas_lisaa);
  rightPanel.add(asiakas_poista);

  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  frame.setIconImage(new ImageIcon("pipboy_icon.jpg").getImage());

  frame.setSize(600, 300);

  frame.getContentPane().add(mainLabel, BorderLayout.PAGE_START);
  frame.getContentPane().add(leftPanel, BorderLayout.LINE_START);
  frame.getContentPane().add(centerPanel, BorderLayout.CENTER);
  frame.getContentPane().add(rightPanel, BorderLayout.LINE_END);


  frame.pack();

  frame.setVisible(true);

  }

  public static void main( String [] args ) {

    javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainView();
            }
    });

  }

}