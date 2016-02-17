/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.control;

import byui.cit260.raiseADragon.model.Location;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author John
 */
public class controlLocationTest {
    
    public controlLocationTest() {
    }

    /**
     * Test of moveToLocation method, of class controlLocation.
     */
    @Test
    public void testMoveToLocation() {
        
        System.out.println("\ttestMoveToLocation");
        
        /*********************************
         * Test case #1
        **********************************/
                
        System.out.println("\tTest 1");
        
        //Get Variables
        int locationNumber = 1;
        int positionInMap = 2;
        Location name = new Location();
        name.setName("Desert");
        String newLocation = "Desert";
        
        //Create a new instance of controlLocation
        ControlLocation instance = new ControlLocation();
        
        //Expected results versus actual results
        double expResult = 1;
        double result = instance.moveToLocation(locationNumber, positionInMap, name, newLocation);
        
        //check the validity of the test
        assertEquals(expResult, result, 0);
        
        
        /*********************************
         * Test case #2
        **********************************/
                
        System.out.println("\tTest 2");
        
        //Get Variables
        locationNumber = 1;
        positionInMap = 2;
        name = new Location();
        name.setName("Desert");
        newLocation = null;
        
        //Expected results versus actual results
        expResult = -1;
         result = instance.moveToLocation(locationNumber, positionInMap, name, newLocation);
        
        //check the validity of the test
        assertEquals(expResult, result, 0);
        
        
                /*********************************
         * Test case #3
        **********************************/
                
        System.out.println("\tTest 3");
        
        //Get Variables
        locationNumber = 1;
        positionInMap = 1;
        name = new Location();
        name.setName("Desert");
        newLocation = "Desert";
        
        //Expected results versus actual results
        expResult = -1;
         result = instance.moveToLocation(locationNumber, positionInMap, name, newLocation);
        
        //check the validity of the test
        assertEquals(expResult, result, 0);
        
        
                /*********************************
         * Test case #4
        **********************************/
                
        System.out.println("\tTest 4");
        
        //Get Variables
        locationNumber = -1;
        positionInMap = 2;
        name = new Location();
        name.setName("Desert");
        newLocation = "Desert";
        
        //Expected results versus actual results
        expResult = -1;
         result = instance.moveToLocation(locationNumber, positionInMap, name, newLocation);
        
        //check the validity of the test
        assertEquals(expResult, result, 0);
        
        
                /*********************************
         * Test case #5
        **********************************/
                
        System.out.println("\tTest 5");
        
        //Get Variables
        locationNumber = 0;
        positionInMap = 13;
        name = new Location();
        name.setName("Desert");
        newLocation = "Desert";
        
        //Expected results versus actual results
        expResult = 0;
         result = instance.moveToLocation(locationNumber, positionInMap, name, newLocation);
        
        //check the validity of the test
        assertEquals(expResult, result, 0);
        
        
                /*********************************
         * Test case #6
        **********************************/
                
        System.out.println("\tTest 6");
        
        //Get Variables
        locationNumber = 13;
        positionInMap = 0;
        name = new Location();
        name.setName("Desert");
        newLocation = "Desert";
        
        //Expected results versus actual results
        expResult = 13;
         result = instance.moveToLocation(locationNumber, positionInMap, name, newLocation);
        
        //check the validity of the test
        assertEquals(expResult, result, 0);
        
        
                /*********************************
         * Test case #7
        **********************************/
                
        System.out.println("\tTest 7");
        
        //Get Variables
        locationNumber = 13;
        positionInMap = 13;
        name = new Location();
        name.setName("Desert");
        newLocation = "Desert";
        
        //Expected results versus actual results
        expResult = -1;
         result = instance.moveToLocation(locationNumber, positionInMap, name, newLocation);
        
        //check the validity of the test
        assertEquals(expResult, result, 0);
    }
    
}
