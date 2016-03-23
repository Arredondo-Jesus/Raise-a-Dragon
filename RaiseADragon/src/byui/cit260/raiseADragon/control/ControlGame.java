/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.control;

import byui.cit260.exceptions.ControlGameException;
import byui.cit260.exceptions.InventoryControlException;
import byui.cit260.raiseADragon.model.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
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
        //Inventory[] inventoryList = ControlGame.createInventoryList();
        ArrayList<Inventory> inventoryList = ControlGame.createInventoryList();
        game.setInventory(inventoryList);
        
        Dragon dragon = new Dragon(); // create new dragon
        game.setDragon(dragon);
        
        Map map = ControlMap.createMap(); // create and initialize new map
        game.setMap(map);
        
        
        
        //Move actors to starting point in the map
        //ControlMap.moveActorsToLocaiton();
        
    }
    
    public static ArrayList createInventoryList(){
        
        // created array(list) of inventory items
        ArrayList<Inventory> inventory =
                new ArrayList<Inventory>();
        
        Inventory food = new Inventory();
        food.setDescription("Gives Food");
        food.setAmountOfMoney(110000.0);
        food.setQuantity(1);
        food.setName("food");
        inventory.add(food);
        
        Inventory ball = new Inventory();
        ball.setDescription("Dragon Loves Ball.");
        ball.setAmountOfMoney(3.0);
        ball.setQuantity(1);
        ball.setName("Ball");
        inventory.add(ball);
        
        Inventory medicine = new Inventory();
        medicine.setDescription("Cure Dragon of Pain or Ailment.");
        medicine.setAmountOfMoney(30.0);
        medicine.setQuantity(1);
        medicine.setName("Medicine");
        inventory.add(medicine);

        return inventory;
    }

    public static ArrayList getSortedInventoryList() {
        //System.out.println("THIS IS A WORK IN PROGRESS AND I WILL DESTROY ALL MANKIND.");
        ArrayList<Inventory> inventory = ControlGame.createInventoryList();
        //Inventory[] inventory = ControlGame.createInventoryList();
        return inventory;
    }

    public static void assignScenesToLocations(Map map, Scene[] scenes){
        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.start.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.ocean.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.cave.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.store.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.house.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.river.ordinal()]);
    }

    public static void saveGame(Game currentGame, String filePath) throws ControlGameException {
        try(FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
        }catch(IOException e){
            throw new ControlGameException(e.getMessage());
        }
    }
}