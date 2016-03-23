/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raiseadragon;

import byui.cit260.raiseADragon.model.*;
import byui.cit260.raiseADragon.view.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author JESUS
 */
public class RaiseADragon {

    /**
     * @param args the command line arguments
     */
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        RaiseADragon.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        RaiseADragon.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        RaiseADragon.inFile = inFile;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        RaiseADragon.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        RaiseADragon.player = player;
    }
    
    public static void main(String[] args) {
        
        // create MainMenuView and start the program
        MainMenuView mainMenuView = new MainMenuView();
        
        try{
            
            RaiseADragon.inFile =
                    new BufferedReader(new InputStreamReader(System.in));
            
            RaiseADragon.outFile = new PrintWriter(System.out, true);
            
            String filePath = "log.txt";
            RaiseADragon.logFile = new PrintWriter(filePath);
            
            mainMenuView.startProgram();
            mainMenuView.display();
            
        }catch(Throwable e){
            System.out.println("Exception: " + e.toString() +
                               "\nCause: " + e.getCause() +
                               "\nMessage: " + e.getMessage());
        }
        
        finally {
            try {
                if (RaiseADragon.inFile !=null)
                    RaiseADragon.inFile.close();
                
                if (RaiseADragon.outFile !=null)
                    RaiseADragon.outFile.close();
                
                if (RaiseADragon.logFile !=null)
                    RaiseADragon.logFile.close(); 
            } catch (IOException ex) {
                System.out.println("error closing files");
                return;
            }
            
        }
    }
    
}
