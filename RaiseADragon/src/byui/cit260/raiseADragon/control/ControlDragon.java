/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.control;

import byui.cit260.raiseADragon.model.BodyPart;
import byui.cit260.raiseADragon.model.Dragon;

/**
 *
 * @author Chuy
 */
public class ControlDragon {

    public BodyPart[] initializeDragon(String name, String color, int age, double size){
        Dragon dragon = new Dragon();
        
        dragon.setName(name);
        dragon.setColor(color);
        dragon.setAge(age);
        dragon.setSize(size);
        
        BodyPart[] bodyParts = new BodyPart[10];
        
        bodyParts[0]= this.createBodyPart("Leg","Right front leg","Excellent",10);
        bodyParts[1]= this.createBodyPart("Leg","Left front leg","Excellent",10);
        bodyParts[2]= this.createBodyPart("Leg","Right back leg","Excellent",10);
        bodyParts[3]= this.createBodyPart("Leg","Left back Leg","Excellent",10);
        bodyParts[4]= this.createBodyPart("Brain","Brain","Excellent",10);
        bodyParts[5]= this.createBodyPart("Heart","Heart","Excellent",10);
        bodyParts[6]= this.createBodyPart("Wing","Right wing","Excellent",10);
        bodyParts[7]= this.createBodyPart("Wing","Left wing","Excellent",10);
        bodyParts[8]= this.createBodyPart("Tail","Tail","Excellent",10);
        bodyParts[9]= this.createBodyPart("Body","Body","Excellent",10);
        
        return bodyParts;
    }
    
    public BodyPart createBodyPart(String name, String description, String status, int points){
        BodyPart bodyPart = new BodyPart();
        
        bodyPart.setName(name);
        bodyPart.setDescription(description);
        bodyPart.setStatus(status);
        bodyPart.setPoints(points);
        
        return bodyPart;
    }
    
    
    public void getStatus(BodyPart[] bodyParts){
        String status= null;
        int i=0;
        
      
        for (i=0;i<=bodyParts.length;i++){
            
            bodyParts[i].setValid(true);
            
            ControlBodyPartStatus partStatus= new ControlBodyPartStatus();
            status = partStatus.calcBodyPartStatus(bodyParts[i]);
            bodyParts[i].setStatus(status);
        }   
    }
}
