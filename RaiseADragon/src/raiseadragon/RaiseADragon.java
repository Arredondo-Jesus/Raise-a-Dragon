/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raiseadragon;

import byui.cit260.raiseADragon.model.Player;

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
        
        System.out.println("The name of the firs player is "+ player01.getName());
    }
    
}
