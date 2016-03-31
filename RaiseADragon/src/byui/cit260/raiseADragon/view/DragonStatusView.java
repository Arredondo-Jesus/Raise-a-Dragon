/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import byui.cit260.exceptions.BodyPartControlException;
import byui.cit260.raiseADragon.control.ControlDragon;
import byui.cit260.raiseADragon.model.BodyPart;
import byui.cit260.raiseADragon.model.Dragon;
import byui.cit260.raiseADragon.model.Game;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import raiseadragon.RaiseADragon;

/**
 *
 * @author jesus.arredondo.ruiz
 */
public class DragonStatusView{
    //ControlDragon myDragon = new ControlDragon();
    
    protected final PrintWriter console = new PrintWriter(System.out,true);
    
    public void displayStatistics () throws BodyPartControlException{
        ControlDragon controlDragon = new ControlDragon();
      
        String partName=null;
        String partDescription=null;
        String partStatus=null;
        int partPoints=0;
        
        int i;
        
        Game game =RaiseADragon.getCurrentGame();
        Dragon dragon = game.getDragon();
        
        BodyPart [] bodyParts=dragon.getBodyParts();
        
        
        console.print("\n\t----------------------------------------------------"
                       +"\n\t! Dragon Statisticst"
                       +"\n\t-----------------------------------------------------");
        
        
        console.println("\nDragon's Name: "+ RaiseADragon.getCurrentGame().getDragon().getName());
        console.println("Dragon's Color: "+ RaiseADragon.getCurrentGame().getDragon().getColor());
        
        System.out.println("\n\tPart Name" + "\tPart Description" + "\tPart Status"+"\tPart Points");
                       
        
                        for (i=0;i<bodyParts.length;i++){
                           
                            try{
                                
                                partName=bodyParts[i].getName();
                                partDescription=bodyParts[i].getDescription();
                                partStatus=bodyParts[i].getStatus();
                                partPoints=bodyParts[i].getPoints();
                           
                            }catch(ArrayIndexOutOfBoundsException e){
                               
                                console.println("The number of body Parts has exceeded "
                                       + "the size of the array" + e);
                           }
                           
                           console.println("\n\t"+partName+
                                   "\t\t"+partDescription+
                                   "\t\t"+partStatus+
                                   "\t\t"+partPoints);
                       }
        
        
           console.print("\n\t----------------------------------------------------"
                        +"\n\t"
                        +"\n\t----------------------------------------------------");
    }
    
     public static void printToFile(String filePath){
        
        String name =null;
        String description=null;
        String status=null;
        String points=null;
        
        int i=0;
        
        Dragon dragon = new Dragon();
        BodyPart[] bodyParts = dragon.getBodyParts();
        
        //String outputFileName="Dragon-Body-Parts-Satus.txt";
        
        try{
            FileWriter fw = new FileWriter(filePath);
            fw.write("\nName"+"\tDescriptions"+"\tPoints"+"\tStatus");
            
            for (BodyPart bodyPart : bodyParts) {
                i=i++;
                name=bodyParts[i].getName();
                description=bodyParts[i].getDescription();
                status=bodyParts[i].getStatus();
                points=Integer.toString(bodyParts[i].getPoints());
                
                fw.write("\n"+name+""
                        + "\tDescriptions"+description+""
                        + "\tPoints"+points+""
                        + "\tStatus"+status);
                
            }
            
            fw.close();
        }catch(IOException e){
            ErrorView.display("DragonStatusView",e.getMessage());
        }
    }
     
     
}
