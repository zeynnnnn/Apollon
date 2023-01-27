package src;
/* 
 * @author Berkin
 * @version 1.00 01.05.2017
 * */
public class Environment
{
    static double windVelocity;
    static double gravitation;
   Gravity gravity;
   Wind wind;
   
   public Environment()
   {
      gravitation = 0;
      windVelocity = 0;
      gravity = new Gravity(gravitation);
      wind = new Wind(windVelocity);
   }
   
   public void setWindVelocity( double wind )
   {
      this.windVelocity = wind;
   }
   
   public double getWindVelocity()
   {
      return windVelocity;
   }
 
   public void setGravitation( double gravity )
   {
      this.gravitation = gravity;
   }
   
   public double getGravitation()
   {
      return gravitation;
   }
}