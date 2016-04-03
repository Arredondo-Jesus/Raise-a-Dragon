/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import byui.cit260.raiseADragon.control.ControlLocation;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class LocationDetailView {
    
    public double locationDetails(int[] controlCurrentLocation) {
        
        int newlocation = controlCurrentLocation[0];
        
            if (newlocation == 0){
                System.out.println("This is your house. If you don't know what this is, I would be afraid.");
            }
            else if(newlocation == 1){
                System.out.println("What a quaint generalist store for buying items for day-to-day existence..");
            }
            else if(newlocation == 2){
                System.out.println("This is a forest! It's green, it's filled with life, and it's fun to play in!");
            }
            else if(newlocation == 3){
                System.out.println("The only mountain in the entire vicinity. It's big, and very high up, so be careful when climbing!");
            }
            else if(newlocation == 4){
                System.out.println("Have you ever wanted to live in a barren place with little-to-no life? Cool! That's the desert.");
            }
            else if(newlocation == 5){
                System.out.println("Dark, and filled with mystery, this cave looks like a good resting spot to wait out a storm.");
            }
            else{
                return -1;
            }
            return newlocation;
        
    }
    
}
