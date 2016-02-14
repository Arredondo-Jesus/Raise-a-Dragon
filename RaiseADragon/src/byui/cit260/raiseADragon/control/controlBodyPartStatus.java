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
public class controlBodyPartStatus {
    
    
    public String calcBodyPartStatus(int points,BodyPart bodyPart, boolean valid){
        String status = null;
        
        if (points < 0){
            return "Error: Points cannot be less than 0";
        }
        
        if (points > 10){
            return "Error: Points cannot be greater than 10";
        }
        
        if (bodyPart == null){
            return "Body Part is missing";
        }
        
        if (valid == false){
            return "Error: Invalid Body Part";
        }
        
        
        String bodyPartName = bodyPart.getName();
        
        
        if (points == 0 && ("Brain".equals(bodyPartName) || "Heart".equals(bodyPartName))){
            status = "Dead";
            return status;
        }
        
        if (points == 0 && valid){
            status = "Lost";
            return status;
        }
        
        if ((points==1 && points<=2) && valid){
            status="Really Bad";
            return status;
        }
        
        if ((points>=3 && points<=4) && valid){
            status="Bad";
            return status;
        }
        
        if ((points>=5 && points<=6) && valid){
            status="Normal";
            return status;
        }
        
        
        if ((points>=7 && points<=8) && valid){
            status="Good";
            return status;
        }
        
        if ((points>=9 && points<=10) && valid){
            status="Excellent";
            return status;
        }
        
        return status;
    }
  
}
