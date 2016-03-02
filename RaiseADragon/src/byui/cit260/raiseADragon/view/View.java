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
public abstract class View implements ViewInterface {
    protected String displayMessage;
    
    public View(){
    }
    
    public View(String message){
        this.displayMessage=message;
    }
    
    @Override
    public void display(){
        boolean done =false;
        
        do{
            String value = this.getInput();
            if (value.toUpperCase().equals("E")){
                return;
            }
            
            done=this.doAction(value);
            
        }while(!done);
    }

    @Override
        public String getInput() {
        boolean valid = false; // indicates if the name has to be retrieved.
        String value = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
                
                //prompt for the player's name
                System.out.println("\n" + this.displayMessage);
                
                // get the name from the keyboard and trim off the blanks
                value = keyboard.nextLine().toUpperCase();
                value = value.trim();
                
                // if the name is invalid (less than two characters in length)
                if (value.length() < 1) {
                    System.out.println("In*** You must enter a value ***");
                    continue; // and repeat again
                }
                break; //out of the (exit) the repetition
        }
        return value;
    }

}
