/* 
 * @author Anýl
 * @version 1.00 01.05.2017
 * */
package src;
import java.awt.*;
import javax.swing.*;
public class Bow 
{
  private int power;
  private ImageIcon image;
  public Bow()
  {
    
  }
  public void setPower(int powerOfBow)
  {
    this.power = powerOfBow;
  }
  public int getPower()
  {
    return power;
  }
  public void setImage(ImageIcon image)
  {
     image = new ImageIcon(getClass().getResource("ok.jpg"));
  }
  public ImageIcon getImage()
  {
    return image;
  }
  
}