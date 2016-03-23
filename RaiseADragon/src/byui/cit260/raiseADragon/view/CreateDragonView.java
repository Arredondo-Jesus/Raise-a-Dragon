/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import byui.cit260.raiseADragon.control.ControlDragon;
import byui.cit260.raiseADragon.model.Dragon;
import java.util.Scanner;

/**
 *
 * @author Chuy
 */


public class CreateDragonView extends View{
    
    @Override
    public boolean doAction(String inputType) {
        
       
        String value = null;
        
        if (inputType.equals("Name")){
            value = this.getInputName();
        }
        
        if (inputType.equals("Color")){
            value = this.getInputColor();
            
        }
        return true;
    }

    private String getInputColor() {
        String value = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        console.println("\nEnter Dragon's Color: " );

        // get the name from the keyboard and trim off the blanks
        value = keyboard.nextLine().toUpperCase();
        value = value.trim();
        return value;
    }

    private String getInputName() {
        String value = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        console.println("\nEnter Dragon's Name: " );

        // get the name from the keyboard and trim off the blanks
        value = keyboard.nextLine().toUpperCase();
        value = value.trim();

        return value;
    }
    
    
    
}
