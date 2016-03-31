/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.control;

import byui.cit260.raiseADragon.model.Game;
import byui.cit260.raiseADragon.model.Situation;
import raiseadragon.RaiseADragon;

/**
 *
 * @author Chuy
 */
public class ControlSituation {
    
    public Situation getRandomSitution(){
        
        int number = this.getRandomNumber();
        
        Situation [] situations = new Situation[10];
        Game game = RaiseADragon.getCurrentGame();
        situations = game.getSituations();
        Situation currentSituation = situations[number];
        
        return currentSituation;
    }
    
    public int getRandomNumber(){
        int number = 0 + (int)(Math.random() * 9);
        return number;
    }
}
