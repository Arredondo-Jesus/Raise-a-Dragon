/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.control;

import byui.cit260.exceptions.BodyPartControlException;
import byui.cit260.exceptions.ControlGameException;
import byui.cit260.raiseADragon.model.BodyPart;
import byui.cit260.raiseADragon.model.Dragon;
import byui.cit260.raiseADragon.model.Situation;
import byui.cit260.raiseADragon.view.ErrorView;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import raiseadragon.RaiseADragon;

/**
 *
 * @author Chuy
 */
public class ControlBodyPartStatus {
    
    
    public String calcBodyPartStatus(BodyPart bodyPart) throws BodyPartControlException{
        String status = null;
        int points= bodyPart.getPoints();
        boolean valid = bodyPart.isValid();
        
        if (points < 0){
            throw new BodyPartControlException("The number of points to verify"
                    + "the wellness of a body part cannot be less than 0");
        }
        
        if (points > 10){
            throw new BodyPartControlException("The number of point to verify"
                    + "the wellness of the body part cannot be grater than 10");
        }
        
        if (bodyPart == null){
             throw new BodyPartControlException("There cannot be null values for"
                     + "your dragon's body parts");
        }
        
        if (valid == false){
             throw new BodyPartControlException("The body part passed through the "
                     + "calcBodyPart function must be a valid body part");
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
    
    public static void addPoints(Situation situation) throws BodyPartControlException{
        BodyPart[] bodyParts = RaiseADragon.getCurrentGame().getDragon().getBodyParts();
        int points = situation.getPoint();
        
        for (int i=0; i<bodyParts.length;i++){
            
            try{
            if (bodyParts[i].getName().equals(situation.getPartAfected())){
                if (situation.getType().equals("negative")){
                   
                    int currentPoints = bodyParts[i].getPoints();
                    int situationPoints = situation.getPoint();
                    currentPoints -= situationPoints;
                    
                    if (currentPoints < 0){
                        currentPoints=0;
                    }else if(currentPoints > 10){
                        currentPoints=10;
                    }
                    
                    bodyParts[i].setPoints(currentPoints);
                    ControlBodyPartStatus partStatus = new ControlBodyPartStatus();
                    String status=partStatus.calcBodyPartStatus(bodyParts[i]);
                    bodyParts[i].setStatus(status);                    
                }    
                    
                }/*else if (situation.getType().equals("positive")){
                    
                    int currentPoints = bodyParts[i].getPoints();
                    int situationPoints = situation.getPoint();
                    currentPoints += situationPoints;
                    bodyParts[i].setPoints(currentPoints);
                    ControlBodyPartStatus partStatus = new ControlBodyPartStatus();
                    String status=partStatus.calcBodyPartStatus(bodyParts[i]);
                    bodyParts[i].setStatus(status);
                    
                }*/
            }catch(BodyPartControlException e){
                ErrorView.display("ControlBodyPartStatus", e.getMessage());
            }
            }
        }
    }

