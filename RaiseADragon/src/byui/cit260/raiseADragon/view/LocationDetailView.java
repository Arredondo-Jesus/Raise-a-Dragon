/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import byui.cit260.raiseADragon.control.ControlLocation;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class LocationDetailView {
    private String getInput() {
        boolean valid = false;
        String playersSelection = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
                
                //prompt for the player's name
                System.out.println("\n\nDo you wish to know about your location? (Y/N)");
                
                // get the name from the keyboard and trim off the blanks
                playersSelection = keyboard.nextLine();
                playersSelection = playersSelection.trim();
                
                // if the name is invalid (less than two characters in length)
                if (playersSelection.length() < 1) {
                    System.out.println("Option is not available.");
                    continue; // and repeat again
                }
                break; //out of the (exit) the repetition
        }
        return playersSelection;
    }
    
        public String doAction(char choice) {
            
            if("Y".equals(choice)){
                return locationDetails();
            } else if("N".equals(choice)){
                return "Fine. I didn't want to help you anyway.";
            } else {
                return "Invalid Option.";
            }
}
    
    public String locationDetails() {
        
        ControlLocation mapFullView = new ControlLocation();
        mapFullView.setLocation("House");
        
        if(("House".equals(mapFullView))){
            return "This is your home. You live here and have lived here for quite a while! It is very homey to you.";
            
        } else if(("Store".equals(mapFullView))){
            return "What a quaint generalist store filled with items for every day-to-day dragon care and existence!";
            
        } else if(("Forest".equals(mapFullView))){
            return "Deep in the woods, this place is a great habitat for a dragon, beuing filled with plants and animals for the young dragon to interact with.";
            
        } else if(("Mountain".equals(mapFullView))){
            return "Placeholder Text for the map";
            
        } else if(("Desert".equals(mapFullView))){
            return "Placeholder Text for the map";
            
        } else if(("Cave".equals(mapFullView))){
            return "Placeholder Text for the map";
            
        } else{
            return "You are currently not on the map";
    }
    }
    
}
