/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.control;
import byui.cit260.exceptions.InventoryControlException;
import byui.cit260.raiseADragon.model.Inventory;
import byui.cit260.raiseADragon.model.Item;
import java.util.ArrayList;

/**
 *
 * @author Chuy
 */


public class ControlInventory {
    
    /*
     * @param number
     * @param unitCost
     * @param item
     * @param nameOfItem
     * @return 
    */
    
    public static ArrayList addItem(ArrayList<Inventory> inventory, Inventory item){
        inventory.add(item);
        return inventory;
    }
    
    public static double calcCostOfItem(ArrayList<Inventory> inventory, int i) throws InventoryControlException {
        Inventory item=inventory.get(i);
      //Checks if the received item object is not an empty object  
        
        if (i < 0){
            throw new InventoryControlException("The number cannot be 0 for the "
                    + "inventory items");
        }
        
        if (inventory==null){
           throw new InventoryControlException("The inventory cannot have a value of null");
        }
        //Validates if the unit cost is not negative and if it not greater than 9999
        if( item.getAmountOfMoney() < 0 || item.getAmountOfMoney() > 9999){
            throw new InventoryControlException("The cost of items cannot be greater than "
                    + "9999");
        }
        // Calculates total cost
        double totalCost = 0;
        
        for (Inventory inItem : inventory) {
            item=inventory.get(i);
            totalCost = totalCost + (item.getAmountOfMoney() * item.getQuantity());
            i=i++;
        }
        //Returns the totalCost of the items
        return totalCost;
    }
}


