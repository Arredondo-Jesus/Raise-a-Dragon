/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.control;

import byui.cit260.raiseADragon.model.Map;

/**
 *
 * @author John
 */
class ControlMap {

    public static Map createMap() {
        //create the map
        Map map = new Map(20, 20);
        
        // create a list of the different scenes in the game
        //Scene[] scenes = createScenes();
        
        //assign the different scenes to locations in the map
        //assignScenesToLocations(map, scenes);
        
        return map;
    }

   /** static void moveEntityToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    **/
}
