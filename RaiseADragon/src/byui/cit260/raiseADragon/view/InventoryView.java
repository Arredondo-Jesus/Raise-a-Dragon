/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import byui.cit260.raiseADragon.control.ControlGame;
import byui.cit260.raiseADragon.model.Inventory;
import java.util.ArrayList;

/**
 *
 * @author Chuy
 */
public class InventoryView {
    
    public void viewInventory(){
        String tab = null;
        ArrayList<Inventory> inventory = ControlGame.getSortedInventoryList();
           
        System.out.println("\nList of invetory items");
        System.out.println("Name"+"\t"
                + "Description"+"\t"
                + "Price"+"\t"
                    + "Quantity");
        
        for (Inventory item: inventory){ // for(Location location : locations)
            
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
    }
}
