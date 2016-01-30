/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raiseadragon;

import byui.cit260.raiseADragon.model.*;


/**
 *
 * @author JESUS
 */
public class RaiseADragon {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        Food food = new Food();
        System.out.println("Here is an overview of the "+ food.toString());
        
        Fruit fruit = new Fruit();
        System.out.println("Here is an overview of the "+ fruit.toString());
        
        Game game = new Game();
        System.out.println("Here is an overview of the "+ game.toString());
        
        Location location = new Location();
        System.out.println("Here is an overview of the "+ location.toString());
        
        Map map = new Map();
        System.out.println("Here is an overview of the "+ map.toString());
        
        Meat meat = new Meat();
        System.out.println("Here is an overview of the "+ meat.toString());
        
        Sweets sweets = new Sweets();
        System.out.println("Here is an overview of the "+ sweets.toString());
        
        Vegetables vegetable = new Vegetables();
        System.out.println("Here is an overview of the "+ vegetable.toString());
        
        BodyPart bodyPart = new BodyPart();
        System.out.println("Here is an overview of the "+ bodyPart.toString());
        
        Dragon dragon = new Dragon();
        System.out.println("Here is an overview of the "+ dragon.toString());
        
        Healing healing = new Healing();
        System.out.println("Here is an overview of the "+ healing.toString());
        
        Hygiene hygiene = new Hygiene();
        System.out.println("Here is an overview of the "+ hygiene.toString());
        
        Interaction interaction = new Interaction();
        System.out.println("Here is an overview of the "+ interaction.toString());
        
        Inventory inventory = new Inventory();
        System.out.println("Here is an overview of the "+ inventory.toString());
        
        Item item = new Item();
        System.out.println("Here is an overview of the "+ item.toString());
        
        Player player = new Player();
        System.out.println("Here is an overview of the "+ player.toString());
        
        Status status = new Status();
        System.out.println("Here is an overview of the "+ status.toString());
       
        Training training = new Training();
        System.out.println("Here is an overview of the "+ training.toString());
        
        Wellness wellness = new Wellness();
        System.out.println("Here is an overview of the "+ wellness.toString());
    }
    
}
