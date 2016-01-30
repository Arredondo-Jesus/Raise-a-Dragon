/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author John
 */
public class Location implements Serializable{
    
    // class instance variables
    private String name;
    private String positionInMap;

    public Location() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPositionInMap() {
        return positionInMap;
    }

    public void setPositionInMap(String positionInMap) {
        this.positionInMap = positionInMap;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.positionInMap);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "name=" + name + ", positionInMap=" + positionInMap + '}';
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
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.positionInMap, other.positionInMap)) {
            return false;
        }
        return true;
    }
    
}
