/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.model;

import java.io.Serializable;

/**
 *
 * @author JESUS
 */
public class Inventory implements Serializable{
    
    private double amountOfMoney;

    public Inventory() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.amountOfMoney) ^ (Double.doubleToLongBits(this.amountOfMoney) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inventory other = (Inventory) obj;
        if (Double.doubleToLongBits(this.amountOfMoney) != Double.doubleToLongBits(other.amountOfMoney)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "amountOfMoney=" + amountOfMoney + '}';
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}
