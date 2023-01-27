package src;
import java.awt.*;
import javax.swing.*;
public class PlayerController 
{
  
  // Properties
  Player player = new Player();
  int type;
  ImageIcon IMAGE_1;
  ImageIcon IMAGE_2;
  // Constructors
  public PlayerController( int type) 
  {
    this.type = type;
    IMAGE_1 = new ImageIcon(getClass().getResource("img1.jpg"));
    IMAGE_2 = new ImageIcon(getClass().getResource("img2.jpg"));
  }
  // Methods
  
  public void createType() 
  {
    if ( type == 1)
      player.setImage( IMAGE_1);
    else if ( type == 2)
      player.setImage( IMAGE_2);
    else
      System.out.println( "Player Creation Error!");
  }
  
  public Player getPlayer() {
    return player;
  }
}