/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.control;

/**
 *
 * @author Chuy
 */
class FileNotFoundExceptionBodyPart extends Exception {

    public FileNotFoundExceptionBodyPart() {
    }

    public FileNotFoundExceptionBodyPart(String string) {
        super(string);
    }

    public FileNotFoundExceptionBodyPart(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public FileNotFoundExceptionBodyPart(Throwable thrwbl) {
        super(thrwbl);
    }

    public FileNotFoundExceptionBodyPart(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
