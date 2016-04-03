/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.control;

import byui.cit260.exceptions.BodyPartControlException;
import byui.cit260.raiseADragon.model.BodyPart;
import byui.cit260.raiseADragon.model.Inventory;
import byui.cit260.raiseADragon.model.Situation;
import java.util.ArrayList;
import raiseadragon.RaiseADragon;

/**
 *
 * @author Chuy
 */
public class ControlInteraction {
    
    public void heal(){
        ArrayList<Inventory> inventory = new ArrayList<Inventory>();
        inventory = RaiseADragon.getCurrentGame().getInventory();
        
        
        BodyPart [] bodyParts = RaiseADragon.getCurrentGame().getDragon().getBodyParts();
        BodyPart bodyPart=null;
        int counter = 0;
        boolean flag = false;
        
        for (int i = 0; i<bodyParts.length;i++){
            if (!bodyParts[i].getName().equals("Stomache")){
                
                if (i>=inventory.size()){
                    System.out.println("There is no medicines on your inventory");
                    return;
                }
                
                if (inventory.get(i).getName().equals("Medicine")){
                  
                    int min = this.getMin(bodyParts);
                    if (min==10){
                        System.out.println("None of the body parts need to be healed");
                        return;
                    }
                    int points = bodyParts[min].getPoints()+1;
                    bodyParts[min].setPoints(points);
                    flag = true;
                    System.out.println("The body Part "+ bodyParts[min].getDescription()+" has bee"
                            + "healed");
                   
                    ControlInventory.removeFromInventory(inventory.get(i));
                    RaiseADragon.getCurrentGame().setInventory(inventory);
                    return;
                }
            }
        }
       
        if (flag=false){
            System.out.println("You don't have any medicine for your dragon");
        }
    }
    
    
    public void Play(){
        ArrayList<Inventory> inventory = new ArrayList<Inventory>();
        inventory = RaiseADragon.getCurrentGame().getInventory();
        
        
        BodyPart [] bodyParts = RaiseADragon.getCurrentGame().getDragon().getBodyParts();
        BodyPart bodyPart=null;
        int counter = 0;
        boolean flag = false;
        
        for (int i = 0; i<bodyParts.length;i++){
            if (!bodyParts[i].getName().equals("Stomache")){
                
                if (i>=inventory.size()){
                    System.out.println("There is no medicines on your inventory");
                    return;
                }
                
                if (inventory.get(i).getName().equals("Toy")){
                  
                    int min = this.getMin(bodyParts);
                    if (min==10){
                        System.out.println("None of the body parts need to be healed");
                        return;
                    }
                    int points = bodyParts[min].getPoints()+1;
                    bodyParts[min].setPoints(points);
                    flag = true;
                    System.out.println("You have Played with the Dragon now he feels"
                            + " a little bit better");
                   
                    ControlInventory.removeFromInventory(inventory.get(i));
                    RaiseADragon.getCurrentGame().setInventory(inventory);
                    return;
                }
            }
        }
       
        if (flag=false){
            System.out.println("You don't have any medicine for your dragon");
        }
    }
    
    
    
    public void Feed(){
        ArrayList<Inventory> inventory = new ArrayList<Inventory>();
        inventory = RaiseADragon.getCurrentGame().getInventory();
        
        
        BodyPart [] bodyParts = RaiseADragon.getCurrentGame().getDragon().getBodyParts();
        BodyPart bodyPart=null;
        int counter = 0;
        boolean flag = false;
        
        for (int i = 0; i<bodyParts.length;i++){
            if (bodyParts[i].getName().equals("Stomache")){
                
                if (i>=inventory.size()){
                    System.out.println("There is no medicines on your inventory");
                    return;
                }
                
                if (inventory.get(i).getName().equals("Food")){
                  
                    int min = this.getMin(bodyParts);
                    if (min==10){
                        System.out.println("None of the body parts need to be healed");
                        return;
                    }
                    int points = bodyParts[min].getPoints()+1;
                    bodyParts[min].setPoints(points);
                    flag = true;
                    System.out.println("You have fed your Dragon he is getting more "
                            + " energy now");
                   
                    ControlInventory.removeFromInventory(inventory.get(i));
                    RaiseADragon.getCurrentGame().setInventory(inventory);
                    return;
                }
            }
        }
       
        if (flag=false){
            System.out.println("You don't have any medicine for your dragon");
        }
    }
    
    
    
    public void Sleep(){
        ArrayList<Inventory> inventory = new ArrayList<Inventory>();
        inventory = RaiseADragon.getCurrentGame().getInventory();
        
        
        BodyPart [] bodyParts = RaiseADragon.getCurrentGame().getDragon().getBodyParts();
        BodyPart bodyPart=null;
        int counter = 0;
        boolean flag = false;
        
        for (int i = 0; i<bodyParts.length;i++){
            if (!bodyParts[i].getName().equals("Head")){
                
                if (i>=inventory.size()){
                    System.out.println("There is no medicines on your inventory");
                    return;
                }
                
                    int min = this.getMin(bodyParts);
                    if (min==10){
                        System.out.println("None of the body parts need to be healed");
                        return;
                    }
                    int points = bodyParts[min].getPoints()+1;
                    bodyParts[min].setPoints(points);
                    flag = true;
                    System.out.println("After a nap it seems that your Dragon feels better");
                   
                    ControlInventory.removeFromInventory(inventory.get(i));
                    RaiseADragon.getCurrentGame().setInventory(inventory);
                    return;
                
            }
        }
       
        if (flag=false){
            System.out.println("You don't have any medicine for your dragon");
        }
    }
    
    
    public void Wash(){
        ArrayList<Inventory> inventory = new ArrayList<Inventory>();
        inventory = RaiseADragon.getCurrentGame().getInventory();
        
        
        BodyPart [] bodyParts = RaiseADragon.getCurrentGame().getDragon().getBodyParts();
        BodyPart bodyPart=null;
        int counter = 0;
        boolean flag = false;
        
        for (int i = 0; i<bodyParts.length;i++){
                
                if (i>=inventory.size()){
                    System.out.println("There is no medicines on your inventory");
                    return;
                }
                
                
                  
                    int min = this.getMin(bodyParts);
                    if (min==10){
                        System.out.println("None of the body parts need to be healed");
                        return;
                    }
                    int points = bodyParts[min].getPoints()+1;
                    bodyParts[min].setPoints(points);
                    flag = true;
                    System.out.println("There is so long since your dragon too"
                            + " a bath please wash it a shower is good for anyone");
                   
                    ControlInventory.removeFromInventory(inventory.get(i));
                    RaiseADragon.getCurrentGame().setInventory(inventory);
                    return;
        }
       
        if (flag=false){
            System.out.println("You don't have any medicine for your dragon");
        }
    }
    
    
    
    
    public void Teach(){
        ArrayList<Inventory> inventory = new ArrayList<Inventory>();
        inventory = RaiseADragon.getCurrentGame().getInventory();
        
        
        BodyPart [] bodyParts = RaiseADragon.getCurrentGame().getDragon().getBodyParts();
        BodyPart bodyPart=null;
        int counter = 0;
        boolean flag = false;
        
        for (int i = 0; i<bodyParts.length;i++){
                
                if (i>=inventory.size()){
                    System.out.println("There is no medicines on your inventory");
                    return;
                }
                
                
                  
                    int min = this.getMin(bodyParts);
                    if (min==10){
                        System.out.println("None of the body parts need to be healed");
                        return;
                    }
                    int points = bodyParts[min].getPoints()+1;
                    bodyParts[min].setPoints(points);
                    flag = true;
                    System.out.println("Not only the body of your dragon has to be excercised"
                            + " but his brain needs this too");
                   
                    ControlInventory.removeFromInventory(inventory.get(i));
                    RaiseADragon.getCurrentGame().setInventory(inventory);
                    return;
        }
       
        if (flag=false){
            System.out.println("You don't have any medicine for your dragon");
        }
    }
    
    
    
    public int getMin(BodyPart [] bodyParts ){
        int aux=0;
        int min=0;
        aux=bodyParts[0].getPoints();
        
        for (int i=1;i<bodyParts.length;i++){
            if (aux>bodyParts[i].getPoints()){
                min=i;
                aux=bodyParts[i].getPoints();
            }
        }
        return min;
        
    }
}
