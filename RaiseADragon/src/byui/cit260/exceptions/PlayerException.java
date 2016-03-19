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
public class PlayerException extends Exception {

    public PlayerException() {
    }

    public PlayerException(String string) {
        super(string);
    }

    public PlayerException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public PlayerException(Throwable thrwbl) {
        super(thrwbl);
    }

    public PlayerException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
