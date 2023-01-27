package src;
import java.util.*;
public class Level {
  //properties
  BasicGame game;
  EnvironmentController envi;
  ArrowController arro;
  //ArrayList<Level> levels  ;
  //constructor
  public Level(int type, int environmentNo, int arrowNo) { 
    envi = new EnvironmentController(environmentNo);
    arro = new   ArrowController(arrowNo);
    if(type ==1)
      game = new LimitedMisses(arro.getArrow(),envi.getEnvironment());
    else if(type ==2)
      game = new LimitedTime(arro.getArrow(),envi.getEnvironment());
    else if(type ==3)
      game = new LimitedArrow(arro.getArrow(),envi.getEnvironment());
    // else if(type == 4) //Should be created
    //   game = QuizGame(); 
    
  }
  public boolean isSucceed(){
    boolean done = false;
    if(isLevelOver())
    {
      if(game instanceof LimitedTime)
      { 
        if( game.getTotalScore()>100)
          done = true;
      }
      else if(game instanceof LimitedTime)
      { 
        if( game.getTotalScore()>100)
          done = true;
      }
      else{
        if(game.getTotalScore() > 200)
          done = true;
      }
    }
    else 
      done = false;
    return done;
  }
  
  
  public boolean isLevelOver(){
    if (game.isGameOver())
      return true;
    else if ( isSucceed())
      return true;
    else
      return false;
  }
  
  public BasicGame getGame( int indexOfLevel)
  {
    return game;
  }
  
  
}
