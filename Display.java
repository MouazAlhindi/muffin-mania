import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class Display extends JFrame
{
	private static double muffinCount=0;
   private static int mpc = 1;
   private double mps = 0;
   private static int btuCount = 0;
	private static JLabel countDisplay;
   private JLabel MPS;
	private JButton muffin;
	private JButton btu;
   private JLabel btuDisplay;
   JFrame frame = new JFrame();
   JPanel panel = new JPanel();
   
   private static final Perk perkOne = new Perk("Muffin Stand", 10,0.2);
   private static final JButton perk1=new JButton(perkOne.toString());
   private static final Perk perkTwo = new Perk("Bakery", 100,1.4);
   private static final JButton perk2=new JButton(perkTwo.toString());
   private static final Perk perkThree = new Perk("Factory", 1000,5);
   private static final JButton perk3=new JButton(perkThree.toString());
   private static final Perk perkFour = new Perk("Franchise", 5000,10);
   private static final JButton perk4=new JButton(perkFour.toString());
   private static final Perk perkFive = new Perk("Muffin Monopoly", 10000,50);
   private static final JButton perk5=new JButton(perkFive.toString());
   private static final Perk perkSix = new Perk("Muffin Empire", 50000,500);
   private static final JButton perk6=new JButton(perkSix.toString());
   private static final Perk perkSeven = new Perk("The Muffin Man", 100000,1000);
   private static final JButton perk7=new JButton(perkSeven.toString());
   private static final Perk perkEight = new Perk("Magic Muffin", 1000000,5000);
   private static final JButton perk8=new JButton(perkEight.toString());
   
   private static Perk[] perks = {perkOne,perkTwo,perkThree,perkFour,perkFive,perkSix,perkSeven,perkEight};
   private static JButton[] buttons = {perk1,perk2,perk3,perk4,perk5,perk6,perk7,perk8};
   private double[] mpses = {0.2, 1.4, 5, 10, 50, 500, 1000, 5000};
   private int[] costs = {10,100,1000,5000,10000,50000, 100000, 1000000};
    	
	public Display(final Display display)
	{
		super("Muffin Mania");
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));//Creates title, layout, and background
		panel.setBackground(new Color(238,201,0));
		
		countDisplay = new JLabel("Muffin Count: "+muffinCount);//Displays the Number of Muffins 
		panel.add(countDisplay);
      
      MPS = new JLabel("Muffins Per Second: "+mps);//Displays amount of Muffins per Second
		panel.add(MPS);      
		
		Icon muffinPic = new ImageIcon(getClass().getResource("muffin.png"));//Adds Pic to button / Adds to panel
		muffin = new JButton(muffinPic);
		muffin.setPreferredSize(new Dimension(183,276));
		panel.add(muffin);  
      muffin.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)//When clicked increments muffin Count and updates display of muffins
         {
            muffinCount+=mpc;
            countDisplay.setText("Muffin Count: "+muffinCount);
         }
      });
      
      setDisabled();
      
      panel.add(perk1);      
      perk1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
         {
         if(muffinCount>= perkOne.getCost())
         {
            muffinCount-=perkOne.getCost();
            countDisplay.setText("Muffin Count: "+muffinCount);
            perkOne.update();
            perk1.setText(perkOne.toString());
            mps+=0.2;
            MPS.setText("Muffins Per Second: "+mps);
            perk2.setEnabled(true);
         }
         else
            error();
         }
         });

      panel.add(perk2);
      
      perk2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
         {
         if(muffinCount>= perkTwo.getCost())
         {
            muffinCount-=perkTwo.getCost();
            countDisplay.setText("Muffin Count: "+muffinCount);
            perkTwo.update();
            perk2.setText(perkTwo.toString());
            mps+=1.5;
            MPS.setText("Muffins Per Second: "+mps);
            perk3.setEnabled(true);
         }
         else
            error();
         }
         });
      
      panel.add(perk3);
      
      perk3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
         {
         if(muffinCount>= perkThree.getCost())
         {
            muffinCount-=perkThree.getCost();
            countDisplay.setText("Muffin Count: "+muffinCount);
            perkThree.update();
            perk3.setText(perkThree.toString());
            mps+=5;
            MPS.setText("Muffins Per Second: "+mps);
            perk4.setEnabled(true);
         }
         else
            error();
         }
         });
      
      panel.add(perk4);
      
      perk4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
         {
         if(muffinCount>= perkThree.getCost())
         {
            muffinCount-=perkFour.getCost();
            countDisplay.setText("Muffin Count: "+muffinCount);
            perkFour.update();
            perk4.setText(perkFour.toString());
            mps+=10;
            MPS.setText("Muffins Per Second: "+mps);
            perk5.setEnabled(true);
         }
         else
            error();
         }
         });
      
      panel.add(perk5);
      
      perk5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
         {
         if(muffinCount>= perkFive.getCost())
         {
            muffinCount-=perkFive.getCost();
            countDisplay.setText("Muffin Count: "+muffinCount);
            perkFive.update();
            perk5.setText(perkFive.toString());
            mps+=50;
            MPS.setText("Muffins Per Second: "+mps);
            perk6.setEnabled(true);
         }
         else
            error();
         }
         });
      
      panel.add(perk6);
      
      perk6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
         {
         if(muffinCount>= perkSix.getCost())
         {
            muffinCount-=perkThree.getCost();
            countDisplay.setText("Muffin Count: "+muffinCount);
            perkSix.update();
            perk6.setText(perkSix.toString());
            mps+=500;
            MPS.setText("Muffins Per Second: "+mps);
            perk7.setEnabled(true);
         }
         else
            error();
         }
         });
      
      panel.add(perk7);
      
      perk7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
         {
         if(muffinCount>= perkSeven.getCost())
         {
            muffinCount-=perkSeven.getCost();
            countDisplay.setText("Muffin Count: "+muffinCount);
            perkSeven.update();
            perk7.setText(perkSeven.toString());
            mps+=1000;
            MPS.setText("Muffins Per Second: "+mps);
            perk8.setEnabled(true);
         }
         else
            error();
         }
         });
      
      panel.add(perk8);
      
      perk8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
         {
         if(muffinCount>= perkEight.getCost())
         {
            muffinCount-=perkEight.getCost();
            countDisplay.setText("Muffin Count: "+muffinCount);
            perkEight.update();
            perk8.setText(perkEight.toString());
            mps+=5000;
            MPS.setText("Muffins Per Second: "+mps);
            btu.setEnabled(true);
         }
         else
            error();
         }
         });
           
      btu = new JButton("?");
      btu.setEnabled(false);
      btu.setToolTipText("Buy The Magic Muffin to Unlock this!");
      panel.add(btu);
      
      btuDisplay = new JLabel(btuCount+"");
      
      btu.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e)
         {
            int response = JOptionPane.showConfirmDialog(null,"Break the Universe: Breaking the Universe resets your muffin count and perks to zero. However, after breaking the universe special perks are available.","BTU?",JOptionPane.YES_NO_OPTION);
            
            if(response==JOptionPane.YES_OPTION)
            {
               muffinCount=0;
               countDisplay.setText("Muffin Count: "+muffinCount);
               mps = 0;
               MPS.setText("Muffins Per Second: "+mps);
               for(int i = 0; i<perks.length;i++)
               {
                  perks[i].zero(costs[i]);
                  buttons[i].setText(perks[i].toString());
               }               
               panel.add(btuDisplay);
               btuCount++;
               btuDisplay.setText("Universes Broken: "+btuCount);
               frame.pack();
               setDisabled();
               btu.setEnabled(false);
               
               SpecialPerk sp = new SpecialPerk(display);
            }
         }
      });
      
      frame.add(panel);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
   }
   
   public void setClickerCount()//Continuously adds total Muffins and Muffins per second
   {
      muffinCount+=mps;
      countDisplay.setText(String.format("Muffin Count: %1$.01f",muffinCount));
   }
   
   private void error()
   {
      JOptionPane.showMessageDialog(null, "Sorry, you don't have enough muffins!");
   }
   
   public void setDisabled()
   {
      for(int i = 1; i< buttons.length; i++)
      {
         buttons[i].setEnabled(false);
      }      
   }
   
   public static void setMufCount()
   {
      muffinCount+=100;
      countDisplay.setText("Muffin Count: "+muffinCount);
   }
   
   public static void setMPC()
   {
      mpc+=3;
   }
   
   public static void reduceCosts()
   {
      for(int i =0; i < perks.length; i++)
      {
         perks[i].reducePerkCost();
         buttons[i].setText(perks[i].toString());
      }
   }
}

/*
   private final I i = new I();
   private final ArrayList<JButton> buttons = new ArrayList<JButton>();
   private final ArrayList<Perk> perks = new ArrayList<Perk>();
   String[] perkNames = {"Muffin Stand", "Bakery", "Factory", "Franchise", "Muffin Monopoly", "Muffin Empire", "The Muffin Man", "Magic Muffin"};
   int[] costs = {10,100,1000,5000,10000,50000, 100000, 1000000};
   double[] mpses = {0.2, 1.4, 5, 10, 50, 500, 1000, 5000};
   
  for(int i=0; i<perkNames.length; i++)//Creates buttons with Perk objects
      {
         Perk p = new Perk(perkNames[i], costs[i], mpses[i]);
         perks.add(p);
         buttons.add(new JButton(p.toString()));
      }
      
      for(int i = 1; i< buttons.size(); i++)//Sets all but 1st button to non-clickable
      {
         buttons.get(i).setEnabled(false);
      }
      
      while(i.getI()<buttons.size()) 
      {
         panel.add(buttons.get(i.getI()));
         Perk p = perks.get(i.getI());
         buttons.get(i.getI()).addActionListener(new ActionListener() {
                        
            public void actionPerformed(ActionEvent e) {
               int c = p.getCost();
               if(muffinCount >= c) 
               {
                  System.out.println(i.getI());
                  muffinCount -= c;
                  countDisplay.setText("Muffin Count: "+muffinCount);
                  p.update();
                  buttons.get(i.getI()).setText(p.toString());
                  mps += p.getMps();
                  MPS.setText("Muffins Per Second: "+mps);
                  if(i.getI() < perks.size() - 1) 
                  {
                     buttons.get(i.getI()+1).setEnabled(true);
                  }
               } 
               else  
               {
                  error();
               }
            }
         });
         i.increment();
         
      }*/