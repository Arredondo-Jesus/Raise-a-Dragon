/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import byui.cit260.exceptions.InventoryControlException;
import byui.cit260.raiseADragon.control.ControlGame;
import byui.cit260.raiseADragon.control.ControlSituation;
import byui.cit260.raiseADragon.model.Inventory;
import byui.cit260.raiseADragon.model.Situation;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class GameMenuView extends View {
        
    public GameMenuView(){
        
            super("\n"
                + "\n-------------------------------------------------------------"
                + "\n| Game Menu                                               |"
                + "\n-------------------------------------------------------------"
                + "\nS - View Detaild Statistics"
                + "\nC - Continue......."
                + "\nI - View List of Items in Inventory"
                + "\nD - Dragon Menu"
                + "\nB - Go Shopping"
                + "\nH - Help Menu"
                + "\nM - Map Menu"
                + "\nE - Exit"
                + "\n-------------------------------------------------------------");

    }
    @Override
    public boolean doAction(String value) {
        switch (value.charAt(0)) {
            case 'I': // View current status of inventorty
                this.viewInventory();
                break;
            case 'C': // View current status of inventorty
                this.continueGame();
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
                return true;
            default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;
        }
        return false;
    }

    private void viewInventory() {
        //System.out.println("****This is calling the viewInventory function");
       try{
        InventoryView inventoryView = new InventoryView();
       inventoryView.viewInventory();
       }catch(InventoryControlException e){
           ErrorView.display(this.getClass().getName(),e.getMessage());
       }
    }

    private void goShopping() {
        //System.out.println("\n*** View Details did a thing.");
        ShopingView shoping = new ShopingView();
        shoping.display();
    }

    private void helpMenu() {
        console.println("\n*** View Details did a thing.");
    }

    private void viewDragonMenu() {
        DragonMenuView dragonView =new DragonMenuView();
        dragonView.display();
    }

    private void mapMenu() {
        MapView mapView =new MapView();
        mapView.display();
    }

    private void continueGame() {
        ControlSituation controlSituation = new ControlSituation();
        Situation situation =controlSituation.getRandomSitution();
        console.println("\n"+situation.getDescription());
        console.print("\nWhat do you want to do?");
        
        //DragonMenuView dragonMenu = new DragonMenuView();
        //dragonMenu.display();
    }
    
}
