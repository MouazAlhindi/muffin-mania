public class Perk
{
   private String name;
   private int cost;
   private int quantity;
   private double mps;
   
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
      
   public void update() //sets cost to 1.25*current price and increments quantity.
   {
      cost+=(int)(cost*0.25);
      quantity++;
   }
   
   public void reducePerkCost()
   {
      cost= (int)(cost*0.75);
   }
   
   public void zero(int x)
   {
      cost=x;
      quantity = 0;
   }
}