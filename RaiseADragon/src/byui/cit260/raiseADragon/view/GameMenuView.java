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
public class GameMenuView {
    
            private final String GAME_MENU = "\n"
                + "\n-------------------------------------------------------------"
                + "\n| Game Menu                                               |"
                + "\n-------------------------------------------------------------"
                + "\nS - View Detaild Statistics"
                + "\nI - View List of Items in Inventory"
                + "\nD - Dragon Menu"
                + "\nB - Go Shopping"
                + "\nH - Help Menu"
                + "\nM - Map Menu"
                + "\nE - Exit"
                + "\n-------------------------------------------------------------";
        public void displayMenu() {
                char selection = ' ';
                do {
                    System.out.println(GAME_MENU); // display the main menu
                    
                    String input = this.getInput(); // get the user's selection
                    selection = input.charAt(0); // get first character of String
                    
                    this.doAction(selection); // do action based on selection
                    
                } while (selection != 'E');
        }
        
            private String getInput() {
        boolean valid = false;
        String playersSelection = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
                
                //prompt for the player's name
                System.out.println("\n\nEnter the option below:");
                
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
            
            public void doAction(char choice) {
        switch (choice) {
            case 'I': // View current status of inventorty
                this.viewInventory();
                break;
            case 'D': // View Dragon Menu
                this.viewDragonMenu();
                break;
            case 'B': // Go to the store
                this.goShopping();
                break;
            case 'H': // Show help menu
                this.helpMenu();
                break;
            case 'M': // Show map menu
                this.mapMenu();
                break;
            case 'E': // Exit the menu
                return;
            default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;
        }
    }

    private void viewInventory() {
        System.out.println("\n*** View Details did a thing.");
    }

    private void goShopping() {
        System.out.println("\n*** View Details did a thing.");
    }

    private void helpMenu() {
        System.out.println("\n*** View Details did a thing.");
    }

    private void viewDragonMenu() {
        DragonMenuView dragonView =new DragonMenuView();
        dragonView.displayMenu();
    }

    private void mapMenu() {
        MapView mapView =new MapView();
        mapView.displayMapMenu();
    }
    
}
