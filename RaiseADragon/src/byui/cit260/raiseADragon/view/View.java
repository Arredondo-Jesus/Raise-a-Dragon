/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import raiseadragon.RaiseADragon;

/**
 *
 * @author Chuy
 */
public abstract class View implements ViewInterface {
    
    private String message;
    protected String displayMessage;
    
    protected final InputStreamReader in = new InputStreamReader(System.in);////Modified to match internet resource
    BufferedReader keyboard = new BufferedReader(in);//Modified to match internet resource
    protected final PrintWriter console = new PrintWriter(System.out,true);
    
    public View(){
    }
    
    public View(String message){
        this.displayMessage=message;
    }
    
    @Override
    public void display(){
        boolean done =false;
        
        do{
            String value = this.getInput();
            if (value.toUpperCase().equals("E")){
                return;
            }
            
            done=this.doAction(value);
            
        }while(!done);
    }

    @Override
        public String getInput() {
        boolean valid = false; // indicates if the name has to be retrieved.
        String value = null; // keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
                
                //prompt for the player's name
                console.println("\n" + this.displayMessage);
                
            try {
                value = this.keyboard.readLine().toUpperCase();//Modified to match internet resource
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
                value = value.trim();
                
                // if the name is invalid (less than two characters in length)
                if (value.length() < 1) {
                    console.println("In*** You must enter a value ***");
                    continue; // and repeat again
                }
                break; //out of the (exit) the repetition
        }
        return value;
    }

}
