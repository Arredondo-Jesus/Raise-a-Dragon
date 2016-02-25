/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import byui.cit260.raiseADragon.control.ControlLocation;

/**
 *
 * @author John
 */
public class MapFullView {
    
    
    public String viewFullMap() {
        ControlLocation mapFullView = new ControlLocation();
        mapFullView.setLocation("House");
        
        if(("House".equals(mapFullView))){
            return "Placeholder Text for the map";
        }
        
        if(("Store".equals(mapFullView))){
            return "Placeholder Text for the map";
        }
        
        if(("Forest".equals(mapFullView))){
            return "Placeholder Text for the map";
        }
        
        if(("Mountain".equals(mapFullView))){
            return "Placeholder Text for the map";
        }
        
        if(("Desert".equals(mapFullView))){
            return "Placeholder Text for the map";
        }
        
        if(("Cave".equals(mapFullView))){
            return "Placeholder Text for the map";
        }
            return "Placeholder text for the map";
    }
    
}
