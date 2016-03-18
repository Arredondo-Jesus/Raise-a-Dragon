/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.control;

import byui.cit260.raiseADragon.model.Food;

/**
 *
 * @author Chuy
 */
public class ControlFood {
    
    public static Food setFood(String name, String desc, int quantity, double money){
        Food food = new Food();
        food.setName(name);
        food.setDescription(desc);
        food.setQuantity(0);
        food.setAmountOfMoney(money);
        return food;
    }
}
