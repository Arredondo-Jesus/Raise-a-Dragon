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
public class HelpMenuView {
    
    private final String HELP_MENU = "\n"
                + "\n-------------------------------------------------------------"
                + "\n| Help Menu                                               |"
                + "\n-------------------------------------------------------------"
                + "\nG - What is the goal of the game?"
                + "\nD - What to do?"
                + "\nS - Dragon Status"
                + "\nI - Items Help"
                + "\nL - Location"
                + "\nE - Exit"
                + "\n-------------------------------------------------------------";
        public void displayMenu() {
                char selection = ' ';
                do {
                    System.out.println(HELP_MENU); // display the main menu
                    
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
            case 'G': // Tell the goal of the game
                this.getGoal();
                break;
            case 'D': // Show what you do.
                this.getHelp();
                break;
            case 'S': // Explain how Dragon Status Works
                this.showStatus();
                break;
            case 'I': // Explain what items do.
                this.showItems();
                break;
            case 'L': // Explain Different Locations
                this.getLocations();
                break;
            case 'E': // Exit the menu
                return;
            default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;
        }
    }

    private void getGoal() {
        System.out.println("The goal of the game is to raise a dragon through means of playing, feeding, healing, and teaching the dragon so it can become big and strong and finally be able to fly!");
    }

    private void getHelp() {
        System.out.println("Do your best to interact with the dragon, find out what works, and find out what you shouldn't do. It is mainly trial and error, but if you see the dragon is hurt, in pain, or not doing well, then you can check the status of the dragon and use items and interactions accordingly.");
    }

    private void showStatus() {
        System.out.println("The dragon has multiple different areas of \"help\" that it requires, whether it is a physical, mental, or dietary status. The numbers will range from 0 to 10, 0 being the worst health and 10 being the best health.");
    }

    private void showItems() {
        System.out.println("INSERT LIST OF ITEMS FOR FUTURE USE");
    }

    private void getLocations() {
        System.out.println("INSERT LIST OF LOCATIONS FOR FUTURE USE");
    }
}
    
