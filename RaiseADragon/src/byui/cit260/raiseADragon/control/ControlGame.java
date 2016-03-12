/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.control;

import byui.cit260.raiseADragon.model.*;
import raiseadragon.RaiseADragon;

/**
 *
 * @author Chuy
 */
public class ControlGame {

    public static void createNewGame(Player player) {
            
        Game game = new Game(); // create new game
        RaiseADragon.setCurrentGame(game); // save in Raise a Dragon
        
        game.setPlayer(player); // save player in game
        
        //create the inventory list and save in the game
        Inventory[] inventoryList = ControlGame.createInventoryList();
        game.setInventory(inventoryList);
        
        Dragon dragon = new Dragon(); // create new dragon
        game.setDragon(dragon);
        
        Map map = ControlMap.createMap(); // create and initialize new map
        game.setMap(map);
    }
    
    public static Inventory[] createInventoryList() {
        
        // created array(list) of inventory items
        Inventory[] inventory =
                new Inventory[3];
        
        Inventory food = new Inventory();
        food.setDescription("Gives Food");
        food.setAmountOfMoney(3.0);
        food.setName("food");
        inventory[Item.food.ordinal()] = food;
        
        Inventory ball = new Inventory();
        ball.setDescription("Dragon Loves Ball.");
        ball.setAmountOfMoney(5.0);
        ball.setName("Ball");
        inventory[Item.ball.ordinal()] = ball;
        
        Inventory medicine = new Inventory();
        medicine.setDescription("Cure Dragon of Pain or Ailment.");
        medicine.setAmountOfMoney(30.0);
        medicine.setName("Medicine");
        inventory[Item.medicine.ordinal()] = medicine;
        
        return inventory;
    }

    public static Inventory[] getSortedInventoryList() {
        System.out.println("THIS IS A WORK IN PROGRESS AND I WILL DESTROY ALL MANKIND.");
        return null;
    }

    public static void assignScenesToLocations(Map map, Scene[] scenes){
        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.ocean.ordinal()]);
    }
}