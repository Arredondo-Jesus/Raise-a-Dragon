/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import byui.cit260.exceptions.BodyPartControlException;
import byui.cit260.exceptions.ControlGameException;
import byui.cit260.exceptions.PlayerException;
import byui.cit260.raiseADragon.control.*;
import byui.cit260.raiseADragon.model.Dragon;
import byui.cit260.raiseADragon.model.Game;
import byui.cit260.raiseADragon.model.Player;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import raiseadragon.RaiseADragon;
import static sun.audio.AudioPlayer.player;

/**
 *
 * @author John
 */

public class MainMenuView extends View {
    
    
    public MainMenuView(){
        super("\n"
                + "\n-------------------------------------------------------------"
                + "\n| Main Menu                                               |"
                + "\n-------------------------------------------------------------"
                + "\nN - Start New Game"
                + "\nG - Start Existing Game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save Game"
                + "\nE - Exit"
                + "\n-------------------------------------------------------------");
    }
    
    
            
    
    public void startProgram() throws IOException{
    
        // Display the banner screen
        this.displayBanner();
        
        // prompt the player to enter their name Retrieve the name of the player
        String playersName = this.getPlayersName();
        
        // Create and save the palyer object
        Player player = null;
        try {
            player = ProgramControl.createPlayer(playersName);
        } catch (PlayerException ex) {
            ErrorView.display(this.getClass().getName(),ex.getMessage());
        }
        
        // Display a personalized welcome message
        this.displayWelcomeMessage(player);
        
        // Display the Main menu.
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
        
}

    public void displayBanner() {
        console.println("\n\n**************************************************");
        
        console.println("*                                                *"
                    +      "\n* This is the game of Raising a Dragon           *"
                    +      "\n* In this game you will help a poor, baby dragon *"
                    +      "\n* grow by nurturing it into a strong, and brave  *"
                    +      "\n* dragon who can fly on its own and return to    *"
                    +      "\n* its family.                                    *");
        
        console.println("\n* You will be required to take care of a dragon  *"
                    +      "\n* on a daily basis and make sure he grows to be  *"
                    +      "\n* big and strong.  *");
        
        console.println("\n* Take care of your baby dragon and make sure    *"
                    +      "\n* they are healthy and are well cared for.       *"
                    +      "\n* Good luck! have fun taking care of your dragon!*");

    }

    public String getPlayersName() throws IOException {
        boolean valid = false; // indicates if the name has to be retrieved.
        String playersName = null;
        //Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
                
                //prompt for the player's name
                console.println("\n\nEnter the player's name below:");
                
                // get the name from the keyboard and trim off the blanks
                playersName = keyboard.readLine();
                playersName = playersName.trim();
                Player player = RaiseADragon.getPlayer();
                
                // if the name is invalid (less than two characters in length)
                if (playersName.length() < 2) {
                    console.println("Invalid name - The name cannot be blank");
                    continue; // and repeat again
                }
                break; //out of the (exit) the repetition
        }
        return playersName;
    }

    private void displayWelcomeMessage(Player player) {
        console.println("\n\n=================================================");
        console.println("\tWelcome to Raise a Dragon, " + player.getName());
        console.println("\tRaise your dragon well!");
        console.println("\n\n=================================================");
    }

    @Override
    public boolean doAction(String value) {
        value=value.toUpperCase();
        
        switch (value.charAt(0)) {
            case 'N': // create and start a new game
                try{
                    this.startNewGame();
                }catch(Exception e){
                    System.out.println("There was an error "+e.getMessage());
                }
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
                return true;
            default:
                    console.println("\n*** Invalid selection *** Try again");
                    break;
        }
        return false;
    }

    private void startNewGame() throws BodyPartControlException {
       /*System.out.println("\n\nEnter the file path for file where the game"
                            + "is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            ControlGame.getSavedGame(filePath);
        } catch (Exception e) {
            ErrorView.display("MainMenuView", e.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        Game game =RaiseADragon.getCurrentGame();
        Dragon dragon = game.getDragon();
        
        try{
            gameMenu.display();
        }catch(Throwable te){
            ErrorView.display(this.getClass().getName(),te.getMessage());
            te.printStackTrace();
            gameMenu.display();
        }*/
       Player player = RaiseADragon.getPlayer();
       ControlGame controlGame = new ControlGame();
       controlGame.createNewGame(player);
       GameMenuView gameView = new GameMenuView();
       gameView.display();
    }
    private void startExistingGame(){
        System.out.println("\n\nSTART A SAVED GAME I THINK LET US HOPE IT IS TRUE");
        
        String filePath = this.getInput();
        
        try {
            ControlGame.getSavedGame(filePath);
        } catch (Exception e) {
            ErrorView.display("MainMenuView", e.getMessage());
            
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
        }
    }

    private void saveGame() {
        //Prompty for and get the name of the file to save the game in
        System.out.println("\n\nEnter the file path of the file where the "
                + "file is going to be saved");
        String filePath = this.getInput();
        
        try{
            ControlGame.saveGame(RaiseADragon.getCurrentGame(), filePath);
        }catch(Exception e){
            ErrorView.display("MainMenuView", e.getMessage());
        }
    }

    private void displayHelpMenu() {
        
        //display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
}