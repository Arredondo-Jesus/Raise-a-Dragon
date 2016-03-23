/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

/**
 *
 * @author Chuy
 */
public class ShopingView extends View {

    public ShopingView() {
        super("\n"
                + "\n-------------------------------------------------------------"
                + "\n| Shoping Menu                                               |"
                + "\n-------------------------------------------------------------"
                + "\nF - Buy Food"
                + "\nM - Buy Medicine"
                + "\nC - Buy Dragon Care Products"
                + "\nT - Buy Toys"
                + "\nE - Exit"
                + "\n-------------------------------------------------------------");
    }
    

    @Override
    public String getInput() {
        String value = super.getInput();
        return value;
    }
            
    @Override
    public boolean doAction(String value) {
        switch (value.charAt(0)) {
            case 'F': // View current status of inventorty
                this.viewFood();
                break;
            case 'M': // View Dragon Menu
                this.viewMedicine();
                break;
            case 'C': // Go to the store
                this.viewCare();
                break;
            case 'T': // Show help menu
                this.viewToys();
                break;
            case 'E': // Exit the menu
                return true;
            default:
                    console.println("\n*** Invalid selection *** Try again");
                    break;
        }
        return false;
        
    }

    private void viewFood() {
       FoodView foodView = new FoodView();
       foodView.display();
    }

    private void viewMedicine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewCare() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewToys() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
