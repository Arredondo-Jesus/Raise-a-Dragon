/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import java.util.Scanner;

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
                + "\nC - Create Dragon"
                + "\nS - View Detaild Statistics"
                + "\nP - Play"
                + "\nT - Teach"
                + "\nG - Heal"
                + "\nW - Wash"
                + "\nF - Feed"
                + "\nL - Sleep"
                + "\nJ - Teach Dragon to Fly"
                + "\nH - Help Menu"
                + "\nE - Exit"
                + "\n-------------------------------------------------------------");
    }
            
    public boolean doAction(String value) {
        switch (value.charAt(0)) {
             case 'C': // view the details and statistics of game
                this.createDragon();
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
            case 'E': // Exit the menu
                return true;
            default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;
        }
        return false;
    }

    private void viewDragonDetails() {
        
        DragonStatusView dragonStatsView = new DragonStatusView();
        dragonStatsView.displayStatistics();
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

    private void teachToFly() {
        System.out.println("\n*** View Details did a thing.");
    }

    private void helpMenu() {
        System.out.println("\n*** View Details did a thing.");
    } 

    private void createDragon() {
        
        CreateDragonView createDragonView = new CreateDragonView();
        createDragonView.doAction("Name");
        createDragonView.doAction("Color");
        
    } 
}
