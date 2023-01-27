package src;
/* 
 * @author Anýl
 * @version 1.00 01.05.2017
 * */
import java.awt.*;
import javax.swing.*;
public class BowController
{
  private int type ;
  private Bow bow;
  private final ImageIcon IMAGE1;
  private final ImageIcon IMAGE2;
  private final int POWER1 = 1 ;
  private final int POWER2 = 2 ;
  public BowController()
  {
    bow = new Bow();
      IMAGE1 = new ImageIcon(getClass().getResource("ok.jpg"));
      IMAGE2 = new ImageIcon(getClass().getResource("ok.jpg"));
  }
  public Bow createType(int type)
  {
    if(type == 1)
    {
      bow.setImage(IMAGE1);
      bow.setPower(POWER1);
    }
     if(type == 2)
    {
      bow.setImage(IMAGE2);
      bow.setPower(POWER2);
    }
     return bow;
  }
}