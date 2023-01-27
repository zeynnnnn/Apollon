package src;
/* 
 * @author �a�atay
 * @version 1.00 01.05.2017
 * */
import java.util.ArrayList;

public class Targets
{
   //Properties
   ArrayList< Target > targets;
   int width;
   int height;
   
   //Constructors
   Targets()
   {
      targets = new ArrayList< Target >();
   }
   
   //Properties
   public void createTarget()
   {
      int points = (int)(Math.random() * 10);
      targets.add( new Target( (int)Math.random() * width, (int)Math.random() * height ) );
      (targets.get( targets.size() - 1 )).setPointsGained( points );
   }
   public void removeTarget( int i )
   {
      targets.remove( i );
   }
   
   public Target getTarget ( int index) {
     return targets.get( index);
   }
}