package src;
/* 
 * @author Zeynep Sonkaya
 * @version 1.00 01.05.2017
 * */
public class LimitedTime extends BasicGame {
  //properties
  int noOfHittenTarget;
  int time;

  public LimitedTime(Arrow arrow,Environment environment) 
  { 
    super(arrow,environment);
    noOfHittenTarget =0;
    time =1000;
  }
  
//Methods
  
  public boolean isGameOver()
  {
    boolean over = false;
    if (time <0) 
      over = true;
    return over;
  }
  
  public int getHittedTargetNumber()
  {
    return   noOfHittenTarget;
  }
  
  public void increaseHittedTargetNumber(int n){
    noOfHittenTarget++;
  }
  
  public void decreaseTime()
  {
    time --;
  }
  public int getTime(){
    return time;
  }
}
