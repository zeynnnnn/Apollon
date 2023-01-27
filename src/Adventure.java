/* 
 * @author Zeynep Sonkaya
 * @version 1.00 01.05.2017
 * */
package src;
import java.util.ArrayList;
public class Adventure {
   ArrayList<Level> levels  ;  
   Level level;
   int indexOfLevel;
     
   public Adventure(int player) { 
   levels = new ArrayList<Level>();
   levels.add(new Level(1,1,1));
   levels.add( new Level(2,2,1));
   levels.add( new Level(3,3,2));
   levels.add(new Level(2,4,1));
   levels.add(new Level(1,3,2));
   levels.add( new Level(3,4,1));
    indexOfLevel = 0;
   }
  
   public boolean isGameOver()
   { 
      if(  indexOfLevel > levels.size())
         return true;
      return false;
   }
   
   public void playLevel()
   {
       level.getGame( indexOfLevel).play(100);
       nextLevel();
   }
   public void  nextLevel()
   { 
      if((levels.get( indexOfLevel)).isSucceed())
         indexOfLevel++;
   }
}
