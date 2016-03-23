/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import byui.cit260.raiseADragon.control.ControlLocation;

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
        ControlLocation house = new ControlLocation();
        house.movetoStore();
    }

    private void getForest() {
        ControlLocation house = new ControlLocation();
        house.movetoForest();
    }

    private void getMountain() {
        ControlLocation house = new ControlLocation();
        house.movetoMountain();
    }

    private void getDesert() {
        ControlLocation house = new ControlLocation();
        house.movetoDesert();
    }

    private void getCave() {
        ControlLocation house = new ControlLocation();
        house.movetoCave();
    }
}
