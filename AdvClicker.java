import javax.swing.JFrame;
import java.util.*;
//hi
public class AdvClicker
{
   private static Display window;
   private static Timer t = new Timer();
   
   public static void timeKeeper()//Calls setClickerCount every second
   {
      t.schedule(new TimerTask()
      {
         public void run()
         {
            window.setClickerCount();
         }
      }
      ,1000,1000);
   }
   
   public static void main(String[] args)
	{      
		window = new Display(window);     
      timeKeeper();
	}
}