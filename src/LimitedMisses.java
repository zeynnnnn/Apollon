package src;
/* 
 * @author Zeynep Sonkaya
 * @version 1.00 01.05.2017
 * */
public class LimitedMisses extends BasicGame {
  //properties
  int misses;
  
  //constructor
  public LimitedMisses( Arrow arrow ,Environment environment) 
  { 
    super(arrow ,environment);
    misses = 5;
  }
  
  
//Methods
  public void ifDecreaseMisses() {
    if ( isHitTheTarget() == -1)
      decreaseMisses();
  }
  public int getMisses()
  {
    return misses;
  }
  public void decreaseMisses()
  {
    misses--;
  }
  
  public boolean isGameOver() {
    if ( misses < 0)
      return true;
    else
      return false;
  }
}
