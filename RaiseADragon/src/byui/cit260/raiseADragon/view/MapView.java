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
                            this.getMapView();
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

    private void getMapView() {
        MapFullView mapView = new MapFullView();
        mapView.viewFullMap();
        
        //display the Map
        
    }

    private void getLocationInfo() {
        LocationDetailView locationInfo = new LocationDetailView();
        locationInfo.locationDetails();
    }

    private void getMove() {
        System.out.println("YOU WILL BE MOVED TO NEW AREA");
    }
    
}
