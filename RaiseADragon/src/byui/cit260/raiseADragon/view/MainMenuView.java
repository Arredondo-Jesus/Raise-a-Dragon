/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import byui.cit260.raiseADragon.control.*;
import byui.cit260.raiseADragon.model.Player;
import java.util.Scanner;
import raiseadragon.RaiseADragon;

/**
 *
 * @author John
 */
public class MainMenuView {
    
        private final String MENU = "\n"
                + "\n-------------------------------------------------------------"
                + "\n| Main Menu                                               |"
                + "\n-------------------------------------------------------------"
                + "\nN - Start New Game"
                + "\nG - Start Existing Game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save Game"
                + "\nE - Exit"
                + "\n-------------------------------------------------------------";
        
        public void displayMenu() {
                char selection = ' ';
                do {
                    System.out.println(MENU); // display the main menu
                    
                    String input = this.getInput(); // get the user's selection
                    selection = input.charAt(0); // get first character of String
                    
                    this.doAction(selection); // do action based on selection
                    
                } while (selection != 'E');
        }
    
    public void startProgram(){
    
        // Display the banner screen
        this.displayBanner();
        
        // prompt the player to enter their name Retrieve the name of the player
        String playersName = this.getPlayersName();
        
        // Create and save the palyer object
        Player player = ProgramControl.createPlayer(playersName);
        
        // Display a personalized welcome message
        this.displayWelcomeMessage(player);
        
        // Display the Main menu.
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
        
}

    public void displayBanner() {
        System.out.println("\n\n**************************************************");
        
        System.out.println("*                                                *"
                    +      "\n* This is the game of Raising a Dragon           *"
                    +      "\n* In this game you will help a poor, baby dragon *"
                    +      "\n* grow by nurturing it into a strong, and brave  *"
                    +      "\n* dragon who can fly on its own and return to    *"
                    +      "\n* its family.                                    *");
        
        System.out.println("\n* You will be required to take care of a dragon  *"
                    +      "\n* on a daily basis and make sure he grows to be  *"
                    +      "\n* big and strong.  *");
        
        System.out.println("\n* Take care of your baby dragon and make sure    *"
                    +      "\n* they are healthy and are well cared for.       *"
                    +      "\n* Good luck! have fun taking care of your dragon!*");

    }

    public String getPlayersName() {
        boolean valid = false; // indicates if the name has to be retrieved.
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
                
                //prompt for the player's name
                System.out.println("Enter the player's name below:");
                
                // get the name from the keyboard and trim off the blanks
                playersName = keyboard.nextLine();
                playersName = playersName.trim();
                
                // if the name is invalid (less than two characters in length)
                if (playersName.length() < 2) {
                    System.out.println("Invalid name - The name cannot be blank");
                    continue; // and repeat again
                }
                break; //out of the (exit) the repetition
        }
        return playersName;
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n=================================================");
        System.out.println("\tWelcome to Raise a Dragon, " + player.getName());
        System.out.println("\tRaise your dragon well!");
        System.out.println("\n\n=================================================");
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
            case 'N': // create and start a new game
                this.startNewGame();
                break;
            case 'G': // get and start an existing game
                this.startExistingGame();
                break;
            case 'H': // display the help menu
                this.displayHelpMenu();
                break;
            case 'S': // save the current game
                this.saveGame();
                break;
            case 'E': // Exit the program
                return;
            default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;
        }
    }

    private void startNewGame() {
        //ControlGame.createNewGame(RaiseADragon.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame was a thing. ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame will be a thing. ***");
    }

    private void displayHelpMenu() {
        
        //display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }
    
}