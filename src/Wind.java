package src;
/* 
 * @author Çaðatay
 * @version 1.00 01.05.2017
 * */
public class Wind
{
  //Properties
  double windVelocity;
  
  //Constructors
  public Wind( double i )
  {
    windVelocity = i;
  }
  
  //Methods
  public double getWind()
  {
    return windVelocity;
  }
  
  public double setWind( double k )
  {
    windVelocity = k;
    return k;
  }
}