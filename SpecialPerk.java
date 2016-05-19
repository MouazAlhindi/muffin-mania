import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class SpecialPerk extends JFrame
{
   private JFrame frame2 = new JFrame();
   private JPanel panel2 = new JPanel();
   private JButton b1;
   private JButton b2;
   private JButton b3;
   private JButton b4;
      
   public SpecialPerk(Display display)
   {
      super("Special Perks");
      panel2.setLayout(new FlowLayout());//Creates title, layout, and background
		panel2.setBackground(new Color(238,201,0));
      
      b1 = new JButton("Start with 100 more muffins!");
      panel2.add(b1);
      
      b1.addActionListener(new ActionListener() {			//creates button and when clicked adds 100
         public void actionPerformed(ActionEvent e)		//muffins to muffin count
         {
            Display.setMufCount();
            frame2.setVisible(false);
         }
      });
      
      b2 = new JButton("Get 3 more muffins per click!");
      panel2.add(b2);
      
      b2.addActionListener(new ActionListener() {			//adds button and when clicked increse muffins per click
         public void actionPerformed(ActionEvent e)
         {
            Display.setMPC();
            frame2.setVisible(false);
         }
      });
      
      b3 = new JButton("The cost of perks are reduced!");
      panel2.add(b3);
      
      b3.addActionListener(new ActionListener() {		//adds button and when clicked reduces cost of perks by 25%
         public void actionPerformed(ActionEvent e)
         {
            Display.reduceCosts();
            frame2.setVisible(false);
         }
      });
      
      b4 = new JButton();
      b4.setOpaque(false);
      b4.setContentAreaFilled(false);
      b4.setBorderPainted(false);
      panel2.add(b4);
      
      b4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
         {
            Display.setMufCount();
            Display.setMPC();
            Display.reduceCosts();
            frame2.setVisible(false);
         }
      });
      
      
      
      frame2.add(panel2);
      frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.pack();
		frame2.setVisible(true);
   }
}