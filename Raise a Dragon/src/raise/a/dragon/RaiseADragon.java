/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raise.a.dragon;

import byui.cit2660.raiseADragon.model.Player;

/**
 *
 * @author JESUS
 */
public class RaiseADragon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Player player01 = new Player();
       player01.setName("Gotzila");
       
       System.out.println("Player 1 is " + player01.getName());
    }
    
}
