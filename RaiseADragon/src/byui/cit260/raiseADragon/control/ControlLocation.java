/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.control;

import byui.cit260.exceptions.ControlLocationException;
import byui.cit260.raiseADragon.model.Location;
import byui.cit260.raiseADragon.view.View;
import raiseadragon.RaiseADragon;


/**
 *
 * @author Chuy
 */
public class ControlLocation extends View{
    
    /**
     *
     * @param locationNumber
     * @param positionInMap
     * @param name
     * @param newLocation
     * @return
     * @throws byui.cit260.exceptions.ControlLocationException
     */

    
    public double moveToLocation(int locationNumber, int positionInMap, String newLocation) throws ControlLocationException {
        
        
        try{
        //Find out if the selected location is null
        if(newLocation==null){
            throw new ControlLocationException("The selection cannot be blank.");
        }
        
        //Find out if the current location is the same as the destination input
        if(locationNumber==positionInMap){
            throw new ControlLocationException("You're already here.");
        }
        
        //Find out if the location is within the parameters of places to go
        if(locationNumber < 0 || locationNumber > 6){
            throw new ControlLocationException("Please pick a different option. The option you selected is not a destination possibility.");
            
        }
        
        } catch (ControlLocationException ex) {
            System.out.println(ex);
        }
        
        //Create a dependant variable to act as a return value.
        double newMapPosition;
        newMapPosition = locationNumber;
        
        return newMapPosition;
    }
    
    public Location setLocation (String name){
        
        Location location = new Location();
        location.setName(name);
        
        return location;
    }
    
    public void getLocation(){
        Location[][] gameLocations = RaiseADragon.getCurrentGame().getMap().getLocations();
    }

    public int[] controlCurrentLocation = new int[1];
    
    
    public void movetoHouse() {
        controlCurrentLocation[0]=0;
        System.out.println("\nYou have been moved to Your House");
    }

    public void movetoStore() {
        controlCurrentLocation[0]=1;
        console.println("\nYou have been moved to the Store");
    }

    public void movetoForest() {
        controlCurrentLocation[0]=2;
        console.println("\nYou have been moved to the Forest");
    }

    public void movetoMountain() {
        controlCurrentLocation[0]=3;
        console.println("\nYou have been moved to the Mountain");
    }

    public void movetoDesert() {
        controlCurrentLocation[0]=4;
        console.println("\nYou have been moved to the Desert");
    }

    public void movetoCave() {
        controlCurrentLocation[0]=5;
        console.println("\nYou have been moved to the Cave");
    }

    @Override
    public boolean doAction(String Value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
