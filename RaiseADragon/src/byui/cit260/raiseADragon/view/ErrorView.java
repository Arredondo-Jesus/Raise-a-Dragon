/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import java.io.PrintWriter;
import raiseadragon.RaiseADragon;

/**
 *
 * @author John
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = RaiseADragon.getOutFile();
    private static final PrintWriter logFile = RaiseADragon.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "---------------------------------------------------------"
                +   "\n- ERROR - " + errorMessage
                +   "\n---------------------------------------------------------");
        
        logFile.println(className + " - " + errorMessage);
    }
    
}
