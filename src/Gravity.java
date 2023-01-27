package src;
/* 
 * @author Çaðatay
 * @version 1.00 01.05.2017
 * */
public class Gravity
{
  //Properties
  double pull;
  
  //Constructors
  public Gravity( double i )
  {
    pull = i;
  }
  
  //Methods
  public double getGravity()
  {
    return pull;
  }
  
  public double setGravity( double k )
  {
    pull = k;
    return k;
  }
}