/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import byui.cit260.exceptions.ControlLocationException;
import byui.cit260.raiseADragon.control.ControlLocation;
import byui.cit260.raiseADragon.model.Location;

/**
 *
 * @author John
 */
public class NewLocationView extends View {
    
    public NewLocationView() {
        
        super("\n"
                + "\n-------------------------------------------------------------"
                + "\n| Choose Location                                           |"
                + "\n-------------------------------------------------------------"
                + "\nH - House"
                + "\nS - Store"
                + "\nF - Forest"
                + "\nM - Mountain"
                + "\nD - Desert"
                + "\nC - Cave"
                + "\nE - Exit"
                + "\n-------------------------------------------------------------"
        );
    }
    
    @Override
    public boolean doAction(String value){
        switch (value.charAt(0)) {
            case 'H':
                this.getHouse();
                break;
            case 'S':
                this.getStore();
                break;
            case 'F':
                this.getForest();
                break;
            case 'M':
                this.getMountain();
                break;
            case 'D':
                this.getDesert();
                break;
            case 'C':
                this.getCave();
                break;
            case 'E':
                return true;

            default:
                    console.println("\n*** Invalid selection *** Try again");
                    break;
        }
        return false;
    }

    private void getHouse() {
        ControlLocation house = new ControlLocation();
        house.movetoHouse();
    }

    private void getStore() {
        ControlLocation store = new ControlLocation();
        store.movetoStore();
    }

    private void getForest() {
        ControlLocation forest = new ControlLocation();
        forest.movetoForest();
    }

    private void getMountain() {
        ControlLocation mountain = new ControlLocation();
        mountain.movetoMountain();
    }

    private void getDesert() {
        ControlLocation desert = new ControlLocation();
        desert.movetoDesert();
    }

    private void getCave() {
        ControlLocation cave = new ControlLocation();
        cave.movetoCave();
    }
}
