/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.exceptions;

/**
 *
 * @author Chuy
 */
public class ControlMapException extends Exception {

    public ControlMapException() {
    }

    public ControlMapException(String string) {
        super(string);
    }

    public ControlMapException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public ControlMapException(Throwable thrwbl) {
        super(thrwbl);
    }

    public ControlMapException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
