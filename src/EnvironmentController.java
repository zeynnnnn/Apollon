/* 
 * @author Berkin
 * @version 1.00 01.05.2017
 * */
package src;

public class EnvironmentController
{
   //DEÐERLERÝ RASTGELE YAZDIM OYUNA GÖRE DÜZENLERÝZ
   final double GRAVITATION_1 = 9.81;  //DÜNYA
   final double GRAVITATION_2 = 1.62;  //AY
   final double GRAVITATION_3 = 23.3;  //JÜPÝTER
   final double GRAVITATION_4 = 3.77;  //MARS
   final double GRAVITATION_5 = 8.69;  //URANÜS
   
   final double WIND_STRENGTH_1 = 10;
   final double WIND_STRENGTH_2 = 15;
   final double WIND_STRENGTH_3 = 20;
   
   Environment environment = new Environment();
   
   public EnvironmentController( int type )
   {
      createType( type );
   }
   
   public void createType( int type )
   {
      int windStrength = (int) ( Math.random() * 3 ) + 1;
      
      //BURADA RÜZGAR RANDOM BELÝRLENÝYOR YERÇEKÝMÝNDEN BAÐIMSIZ OLARAK
      if ( windStrength == 1 )
      {
         environment.setWindVelocity( WIND_STRENGTH_1 );
      }
      else if ( windStrength == 2 )
      {
         environment.setWindVelocity( WIND_STRENGTH_2 );
      }
      else
      {
         environment.setWindVelocity( WIND_STRENGTH_3 );
      }
      
      //BURADA GRAVITY BELÝRLENÝYOR (INVALID SAYI GÝRÝLÝRSE NE OLACAK??)
      if ( type == 1 )
      {
         environment.setGravitation( GRAVITATION_1 );
      }
      if ( type == 2 )
      {
         environment.setGravitation( GRAVITATION_2 );
      }
      if ( type == 3 )
      {
         environment.setGravitation( GRAVITATION_3 );
      }
      if ( type == 4 )
      {
         environment.setGravitation( GRAVITATION_4 );
      }
      if ( type == 5 )
      {
         environment.setGravitation( GRAVITATION_5 );
      }
   }
   
   public Environment getEnvironment()
   {
      return environment;
   }
}