package src;
/* 
 * @author �a�atay
 * @version 1.00 01.05.2017
 * */
public class Target
{
   //Props
   int pointsGained;
   int x;
   int y;
   //Constructors
   Target( int i, int j )
   {
      x = i;
      y = j;
   }
   //Methods
   public int getX()
   {
      return x;
   }
   public int getY()
   {
      return y;
   }
   public int getPointsGained()
   {
      return pointsGained;
   }
   public void setPointsGained( int newPoint )
   {
      pointsGained = newPoint;
   }

}