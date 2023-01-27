package src;
/* 
 * @author Anýl
 * @version 1.00 01.05.2017
 * */
import java.awt.*;
import javax.swing.*;
public class ArrowController
{
  private int type ;
  private Arrow arrow;
  private final ImageIcon IMAGE1;
  private final ImageIcon IMAGE2;
  private final int MASS1 = 1 ;
  private final int MASS2 = 2 ;
  
  public ArrowController(int type)
  {
      this.type = type;
      arrow = new Arrow();
      IMAGE1 = new ImageIcon(getClass().getResource("ok.jpg"));
      IMAGE2 = new ImageIcon(getClass().getResource("ok.jpg"));
  }
  
  public Arrow createType(int type)
  {
    if( type == 1)
    {
      arrow.setImage(IMAGE1);
      arrow.setMass(MASS1);
    }
    if( type == 2)
    {
      arrow.setImage(IMAGE2);
      arrow.setMass(MASS2);
    }
   return arrow;
  }
     public Arrow getArrow()
   {
     return arrow;
   }
  
}