/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author John
 */
public class Location implements Serializable{
    
    /**House("This is where you live. You sleep here."),
    Store("Come here to buy supplies for you and your dragon."),
    Forest("A calm place filled with life and the beauty of nature."),
    Mountain("Gren's Peak is the biggest mountain in the area."),
    Desert("Hot and baren in all aspects. Not much life lives here."),
    Cave("Dark and mysterious, this cave is filled with glowing moss"),
    Beach("A serene breeze can be felt on the beach overlooking the ocean"),
    River("A gentle current takes this water down toward the beach");
    **/
    
    // class instance variables
    private Point positionInMap;
    private String description;
    private String name;
    private int row;
    private int column;
    boolean visited;
    private Scene scene;
    
    public Location(){
        
    }

    /**Location(String description) {
        this.description = description;
        positionInMap = new Point(1,1);
    }**/

    public Point getPositionInMap() {
        return positionInMap;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
    
    

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.positionInMap);
        hash = 47 * hash + Objects.hashCode(this.description);
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + this.row;
        hash = 47 * hash + this.column;
        hash = 47 * hash + (this.visited ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.positionInMap, other.positionInMap)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "positionInMap=" + positionInMap + ", description=" + description + ", name=" + name + ", row=" + row + ", column=" + column + ", visited=" + visited + '}';
    }
}
