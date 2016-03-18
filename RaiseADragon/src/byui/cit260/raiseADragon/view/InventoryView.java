/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import byui.cit260.exceptions.InventoryControlException;
import byui.cit260.raiseADragon.control.ControlGame;
import byui.cit260.raiseADragon.control.ControlInventory;
import byui.cit260.raiseADragon.model.Inventory;
import java.util.ArrayList;

/**
 *
 * @author Chuy
 */
public class InventoryView {
    
    public void viewInventory() throws InventoryControlException{
        String tab = null;
        int i=0;
        double totalCost = 0;
        
        ArrayList<Inventory> inventory = ControlGame.getSortedInventoryList();
           
        System.out.println("\nList of invetory items");
        System.out.println("Name"+"\t"
                + "Description"+"\t"
                + "Price"+"\t"
                    + "Quantity");
        
        for (Inventory item: inventory){ // for(Location location : locations)
            
            totalCost=ControlInventory.calcCostOfItem(inventory, i);
            
            i=i++;
            
            if (item.toString().length()<=4){
                tab="\t\t";
            }else{
                tab="\t";
            }
            
            System.out.print("\n"+item.getName()+tab
                    + item.getDescription()+tab
                    + item.getAmountOfMoney()+tab
                    + item.getQuantity());
        }
        
        System.out.println("\nThe total cost is: "+ totalCost);
    }
}
