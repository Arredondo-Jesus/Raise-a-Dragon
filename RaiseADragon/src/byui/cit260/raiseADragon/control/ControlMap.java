/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.control;

import byui.cit260.raiseADragon.model.Game;
import byui.cit260.raiseADragon.model.Location;
import byui.cit260.raiseADragon.model.Map;
import byui.cit260.raiseADragon.model.Scene;
import byui.cit260.raiseADragon.model.SceneType;
import raiseadragon.RaiseADragon;

/**
 *
 * @author John
 */
public class ControlMap {

    public static Map createMap() {
        //create the map
        Map map = new Map(20, 20);
        
        // create a list of the different scenes in the game
        Scene[] scenes = createScenes();
        
        //assign the different scenes to locations in the map
        ControlGame.assignScenesToLocations(map, scenes);   
        
        return map;
    }
    
    
    private static Scene[] createScenes(){
        Game game = RaiseADragon.getCurrentGame();
        
        Scene [] scenes = new Scene[SceneType.values().length];
        Scene startingScene = new Scene();
        
        startingScene.setDescription("As you were traveling in the forest"
                + "you found heard some strange noice on the bushes, as you"
                + "started to come closer to those bushes you found out a "
                + "little baby dragon who seemed to be lost. Behind the tries "
                + "you tried to hid yourselve thinking that the baby dragon's mother was "
                + "around, but after waiting couple of minutes you found out that this "
                + "little dragon was left alone. Now you want to help this little dragon "
                + "return with his mother because of the compassion you have felt for this "
                + "little baby dragon ");
        startingScene.setMapSymbol("ST");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()]=startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription("Congratulation well done you have raise this Dragon"
                + "to become a big and strong dragon and you have helped him to come"
                + "back home with his family");
        finishScene.setMapSymbol("FN");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.finish.ordinal()]= finishScene;
        
        return scenes;
    }
  
   /** static void moveEntityToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    **/
}
