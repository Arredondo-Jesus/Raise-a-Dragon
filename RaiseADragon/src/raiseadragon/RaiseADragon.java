/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raiseadragon;

import byui.cit260.raiseADragon.model.*;
import byui.cit260.raiseADragon.view.*;


/**
 *
 * @author JESUS
 */
public class RaiseADragon {

    /**
     * @param args the command line arguments
     */
    
    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        RaiseADragon.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        RaiseADragon.player = player;
    }
    
    public static void main(String[] args) {
        
        // create MainMenuView and start the program
        MainMenuView mainMenuView = new MainMenuView();
        
        try{
            mainMenuView.startProgram();
            mainMenuView.display();
        }catch(Throwable te){
            System.out.println(te);
            te.printStackTrace();
            mainMenuView.display();
        }
        /*Food food = new Food();
        food.setDescription("Food");
        food.setName("Candy");
        System.out.println("Here is an overview of the "+ food.toString());
        
        Fruit fruit = new Fruit();
        fruit.setName("Apple");
        System.out.println("Here is an overview of the "+ fruit.toString());
        
        Game game = new Game();
        game.setAction("Action");
        game.setName("Dragon");
        game.setStatistics("56");
        game.setStatus("In Progress");
        System.out.println("Here is an overview of the "+ game.toString());
        
        Location location = new Location();
        location.setName("Fantasy Land");
        location.setPositionInMap("North");
        System.out.println("Here is an overview of the "+ location.toString());
        
        Map map = new Map();
        map.setName("Fantasy Land Map");
        map.setSize(13.2);
        System.out.println("Here is an overview of the "+ map.toString());
        
        Meat meat = new Meat();
        meat.setName("Fish");
        System.out.println("Here is an overview of the "+ meat.toString());
        
        Sweets sweets = new Sweets();
        sweets.setName("Sugar");
        System.out.println("Here is an overview of the "+ sweets.toString());
        
        Vegetables vegetable = new Vegetables();
        vegetable.setName("Carrot");
        System.out.println("Here is an overview of the "+ vegetable.toString());
        
        BodyPart bodyPart = new BodyPart();
        bodyPart.setName("Leg");
        System.out.println("Here is an overview of the "+ bodyPart.toString());
        
        Dragon dragon = new Dragon();
        dragon.setAge(12);
        dragon.setColor("Green");
        dragon.setSize(14);
        dragon.setName("Dragonzito");
        System.out.println("Here is an overview of the "+ dragon.toString());
        
        Healing healing = new Healing();
        healing.setName("Heart");
        healing.setDescription("Healing heart");
        healing.setStatus("Getting better");
        System.out.println("Here is an overview of the "+ healing.toString());
        
        Hygiene hygiene = new Hygiene();
        hygiene.setDescription("Washing teeth");
        hygiene.setName("Teeth");
        hygiene.setStatus("Good");
        System.out.println("Here is an overview of the "+ hygiene.toString());
        
        Interaction interaction = new Interaction();
        interaction.setName("Playing");
        interaction.setDescription("Playing with dragon");
        System.out.println("Here is an overview of the "+ interaction.toString());
        
        Item item = new Item();
        item.setName("Ball");
        item.setPrice(12);
        item.setDescription("Dragon Ball");
        System.out.println("Here is an overview of the "+ item.toString());
        
        Inventory inventory = new Inventory();
        inventory.setAmountOfMoney(35.5);
        System.out.println("Here is an overview of the "+ inventory.toString());
        
        Player player = new Player();
        System.out.println("Here is an overview of the "+ player.toString());
        
        Status status = new Status();
        status.setPoints(33);
        status.setStatus("Winning");
        System.out.println("Here is an overview of the "+ status.toString());
       
        Training training = new Training();
        training.setName("How to fly");
        System.out.println("Here is an overview of the "+ training.toString());
        
        Wellness wellness = new Wellness();
        wellness.setName("Ill");
        wellness.setDescription("Stomach problems");
        System.out.println("Here is an overview of the "+ wellness.toString());
        */
    }
    
}
