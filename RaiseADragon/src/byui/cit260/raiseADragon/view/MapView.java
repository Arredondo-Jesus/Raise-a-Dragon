/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import java.util.Scanner;
/**
 *
 * @author John
 */
public class MapView {
            private final String MAP_MENU = "\n"
                    + "\n-------------------------------------------------------------"
                    + "\n| Map Menu                                                |"
                    + "\n-------------------------------------------------------------"
                    + "\nV - View Map"
                    + "\nG - Get Information on Current Location"
                    + "\nM - Move to New Location"
                    + "\nE - Exit"
                    + "\n-------------------------------------------------------------";
        public void displayMapMenu() {
                char selection = ' ';
                do {
                    System.out.println(MAP_MENU); // display the map menu
                    
                    String input = this.getInput(); // get the user's selection
                    selection = input.charAt(0); // get first character of string
                    
                    this.doAction (selection); // do action based on selection
                    
                } while (selection !='E');       
        }
        
    private String getInput () {
        boolean valid = false;
        String playersSelection = null;
        Scanner keyboard = new Scanner (System.in); //keyboard input stream
        
        while (!valid) { //while a valid name has not been retrieved
            
                //prompt for the player's input
                System.out.println("\n\nEnter the option below:");
                
                //get the name from the keyboard and trim off the blanks
                playersSelection = keyboard.nextLine();
                playersSelection = playersSelection.trim();
                
                //if the input is invalid  (less than two characters in Length)
                if (playersSelection.length() < 1) {
                    System.out.println("Option is not available.");
                    continue; // and repeat again
                }
                break; // out of the (exit) the repetition
        }
        return playersSelection;
    }
            
            
            public void doAction(char choice) {
                switch (choice) {
                    case 'V': // View the world map
                            this.getMapView();
                            break;
                    case 'G': // View information on current location
                            this.getLocationInfo();
                            break;
                    case 'M': // Move to New Location
                            this.getMove();
                            break;
                    case 'E': //Exit the menu
                            return;
                    default:
                            System.out.println("\n*** Invalid Selection *** Try again");
                            break;
                }
                
            }

    private void getMapView() {
        MapFullView mapView = new MapFullView();
        mapView.viewFullMap();
        
        //display the Map
        
    }

    private void getLocationInfo() {
        LocationDetailView locationInfo = new LocationDetailView();
        locationInfo.locationDetails();
    }

    private void getMove() {
        System.out.println("YOU WILL BE MOVED TO NEW AREA");
    }
    
}
