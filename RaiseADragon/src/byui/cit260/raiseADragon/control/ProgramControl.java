/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.control;

import byui.cit260.raiseADragon.model.Player;
import raiseadragon.RaiseADragon;

/**
 *
 * @author John
 */
public class ProgramControl {
    
    public static Player createPlayer(String name){
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        RaiseADragon.setPlayer(player); // save the player
        
        return player;
    }
    
}
