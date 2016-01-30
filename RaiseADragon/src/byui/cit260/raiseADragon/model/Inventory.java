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
 * @author JESUS
 */
public class Inventory implements Serializable{
    
    private Item item;
    private double amountOfMoney;

    public Inventory() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.item);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.amountOfMoney) ^ (Double.doubleToLongBits(this.amountOfMoney) >>> 32));
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
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountOfMoney) != Double.doubleToLongBits(other.amountOfMoney)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "item=" + item + ", amountOfMoney=" + amountOfMoney + '}';
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
    
    
    
}
