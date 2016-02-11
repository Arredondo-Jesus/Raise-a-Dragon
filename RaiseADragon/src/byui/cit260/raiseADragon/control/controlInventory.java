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
public class controlInventory {
    
    /*
     * @param number
     * @param unitCost
     * @param item
     * @param nameOfItem
     * @return 
    */
    
    public double calcCostOfItem(int number, double unitCost, Item item, String nameOfItem) {
        
        
        if(item==null){
            return -1;
        }
        
        if(!item.getName().equals(nameOfItem)){
            return -1;
        }
        
        if (number < 0){
            return -1;
        }
        
        if(unitCost < 0 || unitCost > 9999){
            return -1;
        }
        
        double totalCost;
        totalCost = totalCost =+ (unitCost * number);
        
        return totalCost;
    }
    
}


