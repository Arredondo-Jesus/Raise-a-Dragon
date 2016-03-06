/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.control;

import byui.cit260.raiseADragon.model.BodyPart;

/**
 *
 * @author Chuy
 */
public class ControlDragonInteraction {
    
    public int playWithDragon(BodyPart bodyPart){
        
        String name = bodyPart.getName();
        int points = bodyPart.getPoints();
        
        if (points ==10 ){
            return -1;
        }
        
        if (!bodyPart.isValid()){
            return -1;
        }
        
        if (name.equals("Leg") && points< 10 ){
          points = points++; 
        }
        
        if (name.equals("Wing") && points< 10 ){
          points = points++; 
        }
        
        if (name.equals("Body") && points < 10 ){
          points = points++; 
        }
        
        return points;
    }
}
