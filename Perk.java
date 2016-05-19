public class Perk
{
   private String name;//name of perk
   private int cost;//cost of perk
   private int quantity;//number of that perk you own
   private double mps;//the effect of the perk on Muffins per second
   
   public Perk(String s, int c, double m)
   {
      name = s;
      cost = c;
      mps = m;
      quantity = 0;
   }
   
   public double getMps() { return mps; }
   
   public int getCost(){return cost;}
   
   public int getQuantity(){return quantity;}
   
   public String toString()
   {
      return name + " $" + cost + " Owned: " + quantity;
   }
   
	//sets cost to (5/4)of the current price and increments quantity.   
   public void update()
   {
      cost+=(int)(cost*0.25);
      quantity++;
   }
   
	//Makes the Perk cheaper by 25%
   public void reducePerkCost()
   {
      cost= (int)(cost*0.75);
   }
   
	//Resets the cost and quantity
   public void zero(int x)
   {
      cost=x;
      quantity = 0;
   }
}