/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import byui.cit260.raiseADragon.control.ControlGame;
import byui.cit260.raiseADragon.model.Inventory;
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
                + "\nI - View List of Items in Inventory"
                + "\nD - Dragon Menu"
                + "\nB - Go Shopping"
                + "\nH - Help Menu"
                + "\nM - Map Menu"
                + "\nE - Exit"
                + "\n-------------------------------------------------------------");

    }
            public boolean doAction(String value) {
        switch (value.charAt(0)) {
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
                return true;
            default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;
        }
        return false;
    }

    private void viewInventory() {
        // get the sorted list of inventory items for the current game
        Inventory[] inventory = ControlGame.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t" + "Required" + "\t" + "In Stock");
        
        //fore each inventory item
        for (Inventory inventoryItem : inventory) {
            //Display the description, the required amount and amount in stock
            System.out.println(inventoryItem.getName() + "\t   " +  inventoryItem.getDescription() + "\t   " + inventoryItem.getAmountOfMoney());
        }
    }

    private void goShopping() {
        System.out.println("\n*** View Details did a thing.");
    }

    private void helpMenu() {
        System.out.println("\n*** View Details did a thing.");
    }

    private void viewDragonMenu() {
        DragonMenuView dragonView =new DragonMenuView();
        dragonView.display();
    }

    private void mapMenu() {
        MapView mapView =new MapView();
        mapView.display();
    }
    
}
