/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import byui.cit260.exceptions.BodyPartControlException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus.arredondo.ruiz
 */
public class DragonMenuView extends View {
    
    public DragonMenuView(){
        super("\n"
                + "\n-------------------------------------------------------------"
                + "\n| Dragon Menu                                               |"
                + "\n-------------------------------------------------------------"
                + "\nC - Change Dragon's Name and Color"
                + "\nS - View Detaild Statistics"
                + "\nP - Play"
                + "\nT - Teach"
                + "\nG - Heal"
                + "\nW - Wash"
                + "\nF - Feed"
                + "\nL - Sleep"
                + "\nJ - Teach Dragon to Fly"
                + "\nH - Help Menu"
                + "\nR - Print Report"
                + "\nE - Exit"
                + "\n-------------------------------------------------------------");
    }
            
    public boolean doAction(String value) {
        try {
            switch (value.charAt(0)) {
                case 'C': // view the details and statistics of game
                    this.changeDragonName();
                    break;
                case 'S': // view the details and statistics of game
                    this.viewDragonDetails();
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
                case 'J': // Teach dragon to fly
                    this.teachToFly();
                    break;
                case 'H': // Show help menu
                    this.helpMenu();
                    break;
                case 'R':
            {
                try {
                    this.bodyPartReport();
                } catch (IOException ex) {
                    Logger.getLogger(DragonMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                case 'E': // Exit the menu
                    return true;
                default:
                    console.println("\n*** Invalid selection *** Try again");
                    break;
            }
            return false;
        } catch (BodyPartControlException ex) {
            ErrorView.display(this.getClass().getName(),ex.getMessage());
        }
        return false;
    }

    private void viewDragonDetails() throws BodyPartControlException{
        
        DragonStatusView dragonStatsView = new DragonStatusView();
        dragonStatsView.displayStatistics();
    }

    private void playDragon() {
        console.println("\n*** View Details did a thing.");
    }

    private void teachDragon() {
        console.println("\n*** View Details did a thing.");
    }

    private void healDragon() {
        console.println("\n*** View Details did a thing.");
    }

    private void washDragon() {
        console.println("\n*** View Details did a thing.");
    }

    private void feedDragon() {
        console.println("\n*** View Details did a thing.");
    }

    private void sleepDragon() {
        console.println("\n*** View Details did a thing.");
    }

    private void teachToFly() {
        console.println("\n*** View Details did a thing.");
    }

    private void helpMenu() {
        console.println("\n*** View Details did a thing.");
    } 

    public void changeDragonName() {
        
        CreateDragonView createDragonView = new CreateDragonView();
        createDragonView.doAction("Name");
        createDragonView.doAction("Color");
        
    } 

    private void bodyPartReport() throws IOException, BodyPartControlException {
        PrintBodyPartReport print = new PrintBodyPartReport();
        print.printReport();
        DragonStatusView dragonStatsView = new DragonStatusView();
        dragonStatsView.displayStatistics();
    }
}
