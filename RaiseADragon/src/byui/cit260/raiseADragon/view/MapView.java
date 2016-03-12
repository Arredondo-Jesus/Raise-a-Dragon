/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import java.util.Scanner;
/**
 *
 * @author John
 */
public class MapView extends View {
            
    public MapView(){
                super("\n"
                    + "\n-------------------------------------------------------------"
                    + "\n| Map Menu                                                |"
                    + "\n-------------------------------------------------------------"
                    + "\nV - View Map"
                    + "\nG - Get Information on Current Location"
                    + "\nM - Move to New Location"
                    + "\nE - Exit"
                    + "\n-------------------------------------------------------------");
    }
            
            public boolean doAction(String value) {
                switch (value.charAt(0)) {
                    case 'V': // View the world map
                            this.displayMap();
                            break;
                    case 'G': // View information on current location
                            this.getLocationInfo();
                            break;
                    case 'M': // Move to New Location
                            this.getMove();
                            break;
                    case 'E': //Exit the menu
                            return true;
                    default:
                            System.out.println("\n*** Invalid Selection *** Try again");
                            break;
                }
                return false;
            }

    private void displayMap() {
        System.out.println("This is the display map view functionality");
    }

    private void getLocationInfo() {
        LocationDetailView locationInfo = new LocationDetailView();
        locationInfo.locationDetails();
    }

    private void getMove() {
        NewLocationView move = new NewLocationView();
        move.display();
    }
    
}
