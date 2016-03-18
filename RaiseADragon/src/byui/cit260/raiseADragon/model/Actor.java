/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Chuy
 */
public enum Actor implements Serializable {
    Dragon("This is the maiun character of our game");
    
    private final String description;
    private final Point coordinates;
    
    Actor(String description){
        this.description=description;
        coordinates=new Point(1,1);
    }
    
    public String getDescription(){
        return description;
    }
    
    public Point getCoordinates(){
        return coordinates;
    }
}
