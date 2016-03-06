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
public class Dragon implements Serializable {
   
    
    private String name;
    private double size;
    private String color;
    private double age;
    private BodyPart[] bodyParts = new BodyPart[10];

    public Dragon() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.size) ^ (Double.doubleToLongBits(this.size) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.color);
        hash = (int) (89 * hash + this.age);
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
        final Dragon other = (Dragon) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.size) != Double.doubleToLongBits(other.size)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dragon{" + "name=" + name + ", size=" + size + ", color=" + color + ", age=" + age + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public BodyPart[] getBodyParts() {
        return bodyParts;
    }

    public void setBodyParts(BodyPart[] bodyParts) {
        this.bodyParts = bodyParts;
    }

    
}
