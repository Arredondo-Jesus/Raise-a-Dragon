/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.control;

import byui.cit260.exceptions.BodyPartControlException;
import byui.cit260.raiseADragon.model.BodyPart;
import byui.cit260.raiseADragon.model.Dragon;

/**
 *
 * @author Chuy
 */
public class ControlDragon {
  
    
    public String ValidateInput(double input){
        String error=null;
        
        if (input<0){
            return "Input cannot be less than 0";
        }
        
        return error;
    }

    public BodyPart[] initializeDragon() throws BodyPartControlException{
        Dragon dragon = new Dragon();
        
        String name = null;
        String color =null;
              
        dragon.setColor(color);
        dragon.setAge(2);
        this.ValidateInput(1);
        dragon.setSize(1);
        this.ValidateInput(1);
        
        BodyPart[] bodyParts = new BodyPart[10];
        
        bodyParts[0]= this.createBodyPart("Leg","Right front leg","",3);
        bodyParts[1]= this.createBodyPart("Leg","Left front leg","",11);
        bodyParts[2]= this.createBodyPart("Leg","Right back leg","",10);
        bodyParts[3]= this.createBodyPart("Leg","Left back Leg","",10);
        bodyParts[4]= this.createBodyPart("Brain","The Brain","",10);
        bodyParts[5]= this.createBodyPart("Heart","The Heart","",10);
        bodyParts[6]= this.createBodyPart("Wing","Right wing","",10);
        bodyParts[7]= this.createBodyPart("Wing","Left wing","",10);
        bodyParts[8]= this.createBodyPart("Tail","The Tail","",10);
        bodyParts[9]= this.createBodyPart("Body","The Body","",10);
        
        this.getStatus(bodyParts);
        
        return bodyParts;
    }
  
    
    public BodyPart createBodyPart(String name, String description, String status, int points) throws BodyPartControlException{
        BodyPart bodyPart = new BodyPart();
        
        bodyPart.setName(name);
        bodyPart.setDescription(description);
        bodyPart.setStatus(status);
        bodyPart.setPoints(points);
        
        return bodyPart;
    }
    
    
    public void getStatus(BodyPart[] bodyParts) throws BodyPartControlException{
        String status= null;
        int i=0;
        
      
        for (i=0;i<bodyParts.length;i++){
            
            bodyParts[i].setValid(true);
            
            ControlBodyPartStatus partStatus= new ControlBodyPartStatus();
            status = partStatus.calcBodyPartStatus(bodyParts[i]);
            bodyParts[i].setStatus(status);
        }   
    }
}
