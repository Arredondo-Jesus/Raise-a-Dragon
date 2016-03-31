/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import byui.cit260.raiseADragon.control.ControlDragon;
import byui.cit260.raiseADragon.model.Dragon;
import byui.cit260.raiseADragon.model.Game;
import java.util.Scanner;
import raiseadragon.RaiseADragon;

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
            Game game = RaiseADragon.getCurrentGame();
            Dragon dragon = game.getDragon();
            dragon.setName(value);
        }
        
        if (inputType.equals("Color")){
            value = this.getInputColor();
             Game game = RaiseADragon.getCurrentGame();
            Dragon dragon = game.getDragon();
            dragon.setColor(value);
            
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
