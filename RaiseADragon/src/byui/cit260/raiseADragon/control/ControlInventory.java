/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.control;
import byui.cit260.raiseADragon.model.Money;
import byui.cit260.exceptions.InventoryControlException;
import byui.cit260.raiseADragon.model.Food;
import byui.cit260.raiseADragon.model.Inventory;
import byui.cit260.raiseADragon.model.Item;
import byui.cit260.raiseADragon.model.Medicine;
import byui.cit260.raiseADragon.model.Situation;
import byui.cit260.raiseADragon.model.Toy;
import java.util.ArrayList;
import raiseadragon.RaiseADragon;

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
    
    public static ArrayList addItem(Inventory item){
        ArrayList<Inventory> inventory = ControlGame.getSortedInventoryList();
        Food food = ControlFood.setFood("Chicken","Chicken",item.getQuantity(),0.0);
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
        i=0;
        
        for (Inventory inItem : inventory) {
            item=inventory.get(i);
            totalCost = totalCost + (item.getAmountOfMoney() * item.getQuantity());
            i=i++;
        }
        //Returns the totalCost of the items
        return totalCost;
    }
   
    public static void addToInventory(Situation situation){
        
        ArrayList<Inventory> inventory = new ArrayList<Inventory>();
        inventory = RaiseADragon.getCurrentGame().getInventory();
        //Inventory item = new Inventory();
        
        if (situation.getName().equals("Collect Food")){
            Food item = new Food();
            item.setName("Food");
            item.setDescription("Food");
            item.setAmountOfMoney(5.0);
            item.setQuantity(1);
            inventory.add(item);
            RaiseADragon.getCurrentGame().setInventory(inventory);
            
        }
        
        if (situation.getName().equals("Collect Toy")){
            Toy item = new Toy();
            item.setName("Toy");
            item.setDescription("Toy");
            item.setAmountOfMoney(5.0);
            item.setQuantity(1);
            inventory.add(item);
            RaiseADragon.getCurrentGame().setInventory(inventory);
        }
        
        if (situation.getName().equals("Collect Money")){
            Money item = new Money();
            item.setName("Money");
            item.setDescription("Money");
            item.setAmountOfMoney(1.0);
            item.setQuantity(1);
            inventory.add(item);
            RaiseADragon.getCurrentGame().setInventory(inventory);
        }
        
        if (situation.getName().equals("Collect Medicine")){
            Medicine item = new Medicine();
            item.setName("Medicine");
            item.setDescription("Medicine");
            item.setAmountOfMoney(10.0);
            item.setQuantity(1);
            inventory.add(item);
            RaiseADragon.getCurrentGame().setInventory(inventory);
        }
    }
    
    public static void removeFromInventory(Inventory item){
        
        ArrayList<Inventory> inventory = new ArrayList<Inventory>();
        inventory = RaiseADragon.getCurrentGame().getInventory();
        
        if (inventory.contains(item)){
            int index = inventory.indexOf(item);
            inventory.remove(index);
        }else{
            System.out.println("\nThe are no items of this type on the list");
        }
    }
 }


