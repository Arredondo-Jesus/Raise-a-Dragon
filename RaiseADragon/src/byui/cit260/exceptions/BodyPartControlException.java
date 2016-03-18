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
public class BodyPartControlException extends Exception {

    public BodyPartControlException() {
    }

    public BodyPartControlException(String string) {
        super(string);
    }

    public BodyPartControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public BodyPartControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public BodyPartControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
