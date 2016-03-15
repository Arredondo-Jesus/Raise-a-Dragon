/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import byui.cit260.raiseADragon.control.ControlGame;
import byui.cit260.raiseADragon.control.ControlLocation;
import byui.cit260.raiseADragon.control.ControlMap;
import byui.cit260.raiseADragon.model.Location;
import byui.cit260.raiseADragon.model.Map;
import byui.cit260.raiseADragon.model.Scene;

/**
 *
 * @author John
 */
public class MapFullView {
    
    
    public void viewFullMap() {
        Map map = new Map();
        Location[][] location = map.getLocations();
        
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++) {
                System.out.println(location[j][i]);
            }
            
        }
    
    }
}