/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import byui.cit260.raiseADragon.control.ControlDragon;
import byui.cit260.raiseADragon.model.BodyPart;
import byui.cit260.raiseADragon.model.Dragon;

/**
 *
 * @author jesus.arredondo.ruiz
 */
public class DragonStatusView{
    //ControlDragon myDragon = new ControlDragon();
    
    public void displayStatistics(){
        ControlDragon controlDragon = new ControlDragon();
        Dragon dragon = null;
        
        String partName=null;
        String partDescription=null;
        String partStatus=null;
        int partPoints=0;
        BodyPart [] bodyParts = new BodyPart[10];
        
        int i;
        
        bodyParts=controlDragon.initializeDragon();
        
        System.out.print("\n\t----------------------------------------------------"
                       +"\n\t! Dragon Statisticst"
                       +"\n\t-----------------------------------------------------");
        
        
        
        
        System.out.println("\n\tPart Name" + "\tPart Description" + "\tPart Status"+"\tPart Points");
                       
        
                        for (i=0;i<bodyParts.length;i++){

                           partName=bodyParts[i].getName();
                           partDescription=bodyParts[i].getDescription();
                           partStatus=bodyParts[i].getStatus();
                           partPoints=bodyParts[i].getPoints();
                           
                           System.out.println("\n\t"+partName+
                                   "\t\t"+partDescription+
                                   "\t\t"+partStatus+
                                   "\t\t"+partPoints);
                       }
        
        
        System.out.print("\n\t----------------------------------------------------"
                        +"\n\t"
                        +"\n\t----------------------------------------------------");
    }
    
}
