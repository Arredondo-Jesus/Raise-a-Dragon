/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import byui.cit260.raiseADragon.control.ControlDragon;
import byui.cit260.raiseADragon.model.BodyPart;
import java.util.Scanner;

/**
 *
 * @author jesus.arredondo.ruiz
 */
public class DragonStatusView{
    //ControlDragon myDragon = new ControlDragon();
    
    public void displayStatistics(){
        ControlDragon controlDragon = new ControlDragon();
        
        String name = this.getNameInput();
        String color = this.getColorInput();
        double size =this.getSizeInput();
        int age =this.getAgeInput();
        int i;
        
        BodyPart[] bodyParts = controlDragon.initializeDragon(name, color, age, size);
        controlDragon.getStatus(bodyParts);
        
        
        System.out.print("\t----------------------------------------------------"
                       +"\t! Dragon Statisticst"
                       +"\t-----------------------------------------------------");
        
                       for (i=0;i<bodyParts.length;i++){
                           System.out.println("\n\t"+bodyParts[i].getName()+" "+bodyParts[i].getDescription()+" "+bodyParts[i].getStatus()+" "+bodyParts[i].getPoints());
                       }
        
        
        System.out.print("\t----------------------------------------------------"
                       +""
                       +"\t-----------------------------------------------------");
    }
    
    private String getNameInput() {
        String name = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
         
        //prompt for the player's name
                System.out.println("\n\nEnter Dragon Name:");
                
                // get the name from the keyboard and trim off the blanks
                name = keyboard.nextLine();
                name = name.trim();
        
        return name;
    }
    
    private String getColorInput() {
        String color = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
         
        //prompt for the player's name
                System.out.println("\n\nEnter Dragon's Color:");
                
                // get the name from the keyboard and trim off the blanks
                color = keyboard.nextLine();
                color = color.trim();
        
        return color;
    }
    
    private double getSizeInput() {
        double size = 0;
        String input= null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
         
        //prompt for the player's name
                System.out.println("\n\nEnter Dragon's Size:");
                
                // get the name from the keyboard and trim off the blanks
                input = keyboard.nextLine();
                input = input.trim();
                
                size= Double.parseDouble(input);
        
        return size;
    }
    
    private int getAgeInput() {
        int age = 0;
        String input= null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
         
        //prompt for the player's name
                System.out.println("\n\nEnter Dragon's Age:");
                
                // get the name from the keyboard and trim off the blanks
                input = keyboard.nextLine();
                input = input.trim();
                
                age = Integer.parseInt(input);
        
        return age;
    }
}
