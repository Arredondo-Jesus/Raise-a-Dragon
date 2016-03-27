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
import java.io.PrintWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import raiseadragon.RaiseADragon;

/**
 *
 * @author Chuy
 */
public class PrintBodyPartReport extends View{
    
   
    public void printReport() throws IOException{
        
        console.println("Enter the Path of the file to which you want to pint"
                + "your the body part report");
        
        String filePath = keyboard.readLine();
        
        try{
            
            this.doAction(filePath);
            
        }catch(Exception e){
            ErrorView.display(this.getClass().getName(), e.getMessage());
            e.printStackTrace();
        }       
    }

public void printBodyPartsStatus(String filePath, BodyPart [] bodyParts) {
        
        //create BufferedReader object for input file
        try(PrintWriter out = new PrintWriter(filePath)){
            // print title and column headings
            out.println("\n\n   Body Parts Status Report    ");
            out.printf("%n%-10s%10s%10s%10s","Name","Description","Points","Status");
            out.printf("%n%-10s%10s%10s%10s","----","-----------","------","------");
            
            //print the characteristics of the Dragon
            for (BodyPart bodyPart:bodyParts){
                out.printf("%n%-10s%-20s%-10d%-5s",bodyPart.getName()
                                                ,bodyPart.getDescription()
                                                ,bodyPart.getPoints()
                                                ,bodyPart.getStatus());
            }
            System.out.println("The file was successfully printed");
        }catch(IOException e){
            System.out.println("I/O Error "+e.getMessage());
        }
    }

    public boolean doAction(String filePath) {
        if (filePath!=null){
            try {
                Dragon dragon = ControlDragon.initializeDragon();
                BodyPart [] bodyParts = dragon.getBodyParts();
                this.printBodyPartsStatus(filePath, bodyParts);
                
            } catch (BodyPartControlException ex) {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
            }
        
        }else{
            return false;
        }
        return true;
    }
}
