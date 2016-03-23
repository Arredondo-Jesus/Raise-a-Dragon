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
public class ControlGameException extends Exception{

    public ControlGameException() {
    }

    public ControlGameException(String string) {
        super(string);
    }

    public ControlGameException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public ControlGameException(Throwable thrwbl) {
        super(thrwbl);
    }

    public ControlGameException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
