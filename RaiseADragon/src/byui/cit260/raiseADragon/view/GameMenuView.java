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
                + "\nP - Play"
                + "\nT - Teach"
                + "\nG - Heal"
                + "\nW - Wash"
                + "\nF - Feed"
                + "\nL - Sleep"
                + "\nB - Go Shopping"
                + "\nJ - Teach Dragon to Fly"
                + "\nH - Help Menu"
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
            case 'S': // view the details and statistics of game
                this.viewDetails();
                break;
            case 'I': // View current status of inventorty
                this.viewInventory();
                break;
            case 'P': // Play with dragon
                this.playDragon();
                break;
            case 'T': // Teaches dragon
                this.teachDragon();
                break;
            case 'G': // Heals dragon
                this.healDragon();
                break;
            case 'W': // Wash dragon
                this.washDragon();
                break;
            case 'F': // Feed dragon
                this.feedDragon();
                break;
            case 'L': // Go to bed
                this.sleepDragon();
                break;
            case 'B': // Go to the store
                this.goShopping();
                break;
            case 'J': // Teach dragon to fly
                this.teachToFly();
                break;
            case 'H': // Show help menu
                this.helpMenu();
                break;
            case 'E': // Exit the menu
                return;
            default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;
        }
    }

    private void viewDetails() {
        System.out.println("\n*** View Details did a thing.");
    }

    private void viewInventory() {
        System.out.println("\n*** View Details did a thing.");
    }

    private void playDragon() {
        System.out.println("\n*** View Details did a thing.");
    }

    private void teachDragon() {
        System.out.println("\n*** View Details did a thing.");
    }

    private void healDragon() {
        System.out.println("\n*** View Details did a thing.");
    }

    private void washDragon() {
        System.out.println("\n*** View Details did a thing.");
    }

    private void feedDragon() {
        System.out.println("\n*** View Details did a thing.");
    }

    private void sleepDragon() {
        System.out.println("\n*** View Details did a thing.");
    }

    private void goShopping() {
        System.out.println("\n*** View Details did a thing.");
    }

    private void teachToFly() {
        System.out.println("\n*** View Details did a thing.");
    }

    private void helpMenu() {
        System.out.println("\n*** View Details did a thing.");
    }
    
}
