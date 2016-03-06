/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import java.util.Scanner;

/**
 *
 * @author Chuy
 */
public class CreateDragonView extends View{
    
    private String getNameInput() {
        String name = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
         
        //prompt for the player's name
                System.out.println("\n\nEnter Dragon Name:");
                
                // get the name from the keyboard and trim off the blanks
                name = keyboard.nextLine();
                name = name.trim();
        
        return name;
    }
    
    private String getColorInput() {
        String color = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
         
        //prompt for the player's name
                System.out.println("\n\nEnter Dragon's Color:");
                
                // get the name from the keyboard and trim off the blanks
                color = keyboard.nextLine();
                color = color.trim();
        
        return color;
    }

    @Override
    public boolean doAction(String inputType) {
        
        String value = null;
        
        if (inputType.equals("Color")){
            value = this.getColorInput();
        }
        
        if (inputType.equals("Name")){
            value = this.getNameInput();
        }
        return true;
    }
    
    
    
}
