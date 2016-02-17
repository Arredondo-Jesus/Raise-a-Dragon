/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.control;
import byui.cit260.raiseADragon.model.Item;

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
    
    public double calcCostOfItem(int number, double unitCost, Item item, String nameOfItem) {
        
      //Checks if the received item object is not an empty object  
        if(item==null){
            return -1;
        }
        
        //Compares the name attribute of the received object with a valid item name
        if(!item.getName().equals(nameOfItem)){
            return -1;
        }
        
        //Returns an error if the number of items are 0
        if (number < 0){
            return -1;
        }
        
        //Validates if the unit cost is not negative and if it not greater than 9999
        if(unitCost < 0 || unitCost > 9999){
            return -1;
        }
        
        // Calculates total cost
        double totalCost;
        totalCost = totalCost =+ (unitCost * number);
        
        //Returns the totalCost of the items
        return totalCost;
    }
    
}


