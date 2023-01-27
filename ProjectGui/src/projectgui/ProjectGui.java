/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgui;

import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class ProjectGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         MainScreen mainFrame = new MainScreen();
      //   mainMenu.setPreferredSize();
        mainFrame.setSize(1000,600);
         mainFrame.setLocationRelativeTo(null);
         mainFrame.setVisible(true);
         mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    
}
