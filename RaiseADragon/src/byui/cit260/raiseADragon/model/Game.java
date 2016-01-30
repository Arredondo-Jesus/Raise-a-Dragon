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
public class Game implements Serializable{
    
    // class instance variables
    private String name;
    private String status;
    private String statistics;
    private String action;

    public Game() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatistics() {
        return statistics;
    }

    public void setStatistics(String statistics) {
        this.statistics = statistics;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.name);
        hash = 19 * hash + Objects.hashCode(this.status);
        hash = 19 * hash + Objects.hashCode(this.statistics);
        hash = 19 * hash + Objects.hashCode(this.action);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "name=" + name + ", status=" + status + ", statistics=" + statistics + ", action=" + action + '}';
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.statistics, other.statistics)) {
            return false;
        }
        if (!Objects.equals(this.action, other.action)) {
            return false;
        }
        return true;
    }

}
