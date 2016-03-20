/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.exceptions;

/**
 *
 * @author John
 */
public class ControlLocationException extends Exception {
    
   public ControlLocationException() {
       
   }
   
   public ControlLocationException(String string) {
       super(string);
   }
   
   public ControlLocationException(String string, Throwable thrwbl) {
       super (string, thrwbl);
   }
   
   public ControlLocationException(Throwable thrwbl) {
       super(thrwbl);
   }
   
   public ControlLocationException(String string, Throwable thrwbl, boolean bln, boolean b1n1) {
       super(string, thrwbl, bln, b1n1);
   }
    
}
