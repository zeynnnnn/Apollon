package src;
/* 
 * @author Zeynep Sonkaya
 * @version 1.00 01.05.2017
 * */
public class LimitedArrow extends BasicGame {
   
   final int NUMBER_OF_ARROW = 10;
   
   int time;
   Arrow arrow ;
   Environment environment;
   int vInit;
   int noArrow;
      
   public LimitedArrow( Arrow arrow ,Environment environment) 
   { 
      super(arrow,environment);
      noArrow = NUMBER_OF_ARROW ;
   }
      
   public void aArrowUsed()
   {
      noArrow --;
      
   }
   public int getleftArrow()
   {
      return noArrow;
   }
   
   public boolean isGameOver()
   {
      boolean gameOver = false;
      if (noArrow < 0)
         gameOver = false;
         return gameOver;
   }
   
   
}
