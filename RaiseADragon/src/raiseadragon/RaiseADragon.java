/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raiseadragon;

import byui.cit260.raiseADragon.model.Food;
import byui.cit260.raiseADragon.model.Fruit;
import byui.cit260.raiseADragon.model.Game;
import byui.cit260.raiseADragon.model.Location;
import byui.cit260.raiseADragon.model.Map;
import byui.cit260.raiseADragon.model.Meat;
import byui.cit260.raiseADragon.model.Player;
import byui.cit260.raiseADragon.model.Sweets;
import byui.cit260.raiseADragon.model.Vegetables;

/**
 *
 * @author JESUS
 */
public class RaiseADragon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player player01 = new Player();
        player01.setName("Gotzila");
        
        System.out.println("The name of the firs player is "+ player01.getName());
        
        Food food01 = new Food();
        food01.setName("Food");
        
        System.out.println("You have gone out and bought "+ food01.getName());
        
        Fruit fruit01 = new Fruit();
        fruit01.setName("an Apple");
        
        System.out.println("You have obtained "+ fruit01.getName());
        
        Meat meat01 = new Meat();
        meat01.setName("some Ham");
        
        System.out.println("You have obtained "+ meat01.getName());
        
        Sweets sweets01 = new Sweets();
        sweets01.setName("a Chocolate Bar");
        
        System.out.println("You have obtained "+ sweets01.getName());
        
        Vegetables vegetables01 = new Vegetables();
        vegetables01.setName("Celery");
        
        System.out.println("You have obtained "+ vegetables01.getName());
        
        Game game01 = new Game();
        game01.setName("Raise a Dragon");
        
        System.out.println("Welcome to "+ game01.getName());
        
        Location location01 = new Location();
        location01.setName("Forest");
        
        System.out.println("You are now in the "+location01.getName());
        
        Map map01 = new Map();
        map01.setName("Map");
        
        System.out.println("Here is an overview of the "+ map01.getName());
        
    }
    
}
