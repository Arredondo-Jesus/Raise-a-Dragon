/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import byui.cit260.raiseADragon.control.ControlInventory;
import byui.cit260.raiseADragon.model.Food;
import byui.cit260.raiseADragon.model.Inventory;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chuy
 */
public class FoodView extends View{

    public FoodView() {
        super("Do you want to buy food"
             + "\nY Yes"
             + "\nE Exit");
    }
    
    
    public String getValue(){
        String value = super.getInput();
        return value;
    }
    
    @Override
    public boolean doAction(String value) {
        switch(value.charAt(0)){
            case 'Y':
                this.buyItem();
                break;
            case 'E':
                return true;
            default: console.print("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
    
    public String getInputQuantity(){
        String value = null;
        
        boolean valid = false; // indicates if the name has to be retrieved.
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
                
                //prompt for the player's name
                console.println("\n\nHow many items do you want:");
                
                // get the name from the keyboard and trim off the blanks
                value = keyboard.nextLine();
                value = value.trim();
                
                // if the name is invalid (less than two characters in length)
                if (value.length() < 1) {
                    console.println("Invalid name - The name cannot be blank");
                }
        
        return value;
    }
    
    
    public void buyItem() {
        try{
            String value = this.getInputQuantity();
            int quantity = Integer.parseInt(value);
            Food food = new Food();
            food.setQuantity(quantity);
            ArrayList<Inventory> inventory = ControlInventory.addItem(food);
        }catch(NumberFormatException fe){
            ErrorView.display(this.getClass().getName(), fe.getMessage());
        }
     }
   
}
