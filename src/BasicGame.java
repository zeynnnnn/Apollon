package src;
/* 
 * @author Tarýk
 * @version 1.00 01.05.2017
 * */
public class BasicGame {
 // Properties
 Arrow arrow;
 Environment environment;
 Target target1;
 Target target2;
 Targets targets;
 int time; // Unit is miliSecond
 int vInit;
 int xInit;
 int yInit;
 double tanThetaInit;
 double tanTheta;
 int vXInit;
 int vYInit;
 int vX;
 int vY;
 int x;
 int y;
 int x1;
 int y1;
 int totalScore;
 // ~~Not sure about Units
 // Constructors
 public BasicGame( Arrow arrow, Environment environment) {
  time = 0;
  vInit = 0;
  this.arrow = arrow;
  this.environment = environment;
  totalScore = 0;
  setNewTarget();
 }
 // Methods
 public void play( int newVInit) {
  setTime();
  setVInit( vInit);
  setNewTarget();
  
 }
 private int getLengthX() {
  xInit = arrow.getX1() - arrow.getX2();
  yInit = arrow.getY1() - arrow.getY2();
  tanThetaInit = yInit / xInit;
  vXInit = (int) (vInit / tanThetaInit);
  vYInit = (int)(vInit *  tanThetaInit);
  vX = (int)(vXInit +  environment.getWindVelocity());
  vY = (int) (vYInit + time * environment.getGravitation());
  tanTheta = tanThetaInit - ( vY / vX);
  x = arrow.getLength() / (int)Math.sqrt( 1 + ( tanTheta * tanTheta));
  return x;
 }
 
 private int getLengthY() {
  xInit = arrow.getX1() - arrow.getX2();
  yInit = arrow.getY1() - arrow.getY2();
  tanThetaInit = yInit / xInit;
  vXInit = (int)(vInit / tanThetaInit);
  vYInit = (int)(vInit * tanThetaInit);
  vX = (int)(vXInit + environment.getWindVelocity());
  vY = (int)(vYInit +  time * environment.getGravitation());
  tanTheta = tanThetaInit - ( vY / vX);
  x = arrow.getLength() / (int)Math.sqrt( 1 + ( tanTheta * tanTheta));
  y = (int) (x * tanTheta);
  return y;
 }
 
 
 public int getLocationX1() {
  xInit = arrow.getX1() - arrow.getX2();
  yInit = arrow.getY1() - arrow.getY2();
  tanThetaInit = yInit / xInit;
  vXInit = (int) (vInit / tanThetaInit);
  x1 = (int)(arrow.getX1() + vXInit * time + environment.getWindVelocity());
  return x1;    
 }
 
 public int getLocationY1() {
  xInit = arrow.getX1() - arrow.getX2();
  yInit = arrow.getY1() - arrow.getY2();
  tanThetaInit = yInit / xInit;
  vYInit = (int) (vInit * tanThetaInit);
  y1 = (int)(arrow.getY1() + vYInit * time + 0.5 * environment.getGravitation() * time * time);
  return y1;    
 }
 
 public int getLocationX2() {
  return getLocationX1() + getLengthX();  
 }
 
 public int getLocationY2() {
  return getLocationY1() + getLengthY();  
 }
 
 public void setTotalScore() 
 {
  totalScore += target1.getPointsGained();
 }
 
 public int getTotalScore() {
  return totalScore;
 }
 
 public int isHitTheTarget() {
  return 0; // It will Completed
 } 
 
 public void setTime() {
  time++;
 } 
 
 public void resetTime() {
  time = 0;
 }
 
 public void setVInit( int vInitial) {
   vInit = vInitial;
 }
 
 public void setNewTarget() {
   targets = new Targets();
   targets.createTarget();
   target1 = targets.getTarget( 0);
 }
 
 public boolean isGameOver() {
   return true;
 }
 
 
 
 
}