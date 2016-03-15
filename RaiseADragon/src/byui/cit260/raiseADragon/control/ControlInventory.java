/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.control;
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
    
    public ArrayList addItem(ArrayList<Inventory> inventory, Inventory item){
        inventory.add(item);
        return inventory;
    }
    
    public double calcCostOfItem(ArrayList<Inventory> inventory, int i) {
        Inventory item=inventory.get(i);
      //Checks if the received item object is not an empty object  
        
        
        //Validates if the unit cost is not negative and if it not greater than 9999
        if( item.getAmountOfMoney() < 0 || item.getAmountOfMoney() > 9999){
            return -1;
        }
        
        // Calculates total cost
        double totalCost;
        totalCost = totalCost =+ (item.getAmountOfMoney() * item.getQuantity());
        
        //Returns the totalCost of the items
        return totalCost;
    }
}


