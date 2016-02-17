/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.control;

import byui.cit260.raiseADragon.model.BodyPart;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chuy
 */
public class controlBodyPartStatusTest {
    
    public controlBodyPartStatusTest() {
    }

    /**
     * Test of calcBodyPartStatus method, of class controlBodyPartStatus.
     */
    @Test
    
    public void testCalcBodyPartStatus() {
        
        
        /*********************************
            * Test case #1.
        **********************************/
        
        //Input values for test case 1
        
        System.out.println("calcBodyPartStatus test 1");
        
        int points = 0;
        BodyPart bodyPart = new BodyPart();
        bodyPart.setName("Brain");
        boolean valid = true;
        
        //create the instance of the controlInventory class
        ControlBodyPartStatus instance = new ControlBodyPartStatus();
        
        String expResult = "Dead";// expected output return value
            
        //Call funtion to run test
        String result = instance.calcBodyPartStatus(points, bodyPart, valid);
        
        //compare the expected return value with actual value returned
        assertEquals(expResult, result);
        
        
        /*********************************
         * Test case #2.
        **********************************/
        
        //Input values for test case 2
        
        System.out.println("calcBodyPartStatus test 2");
        
        points = 0;
        bodyPart.setName("Heart");
        valid = true;
        
        expResult = "Dead";// expected output return value
        
        //Call funtion to run test
        result = instance.calcBodyPartStatus(points, bodyPart, valid);
        
        //compare the expected return value with actual value returned
        assertEquals(expResult, result);
        
        
        /*********************************
            * Test case #3.
        **********************************/
        
        //Input values for test case 1
        
        System.out.println("calcBodyPartStatus test 3");
        
        points = 0;
        bodyPart.setName("Leg");
        valid = true;
        
        expResult = "Lost";// expected output return value
        
        //Call funtion to run test
       result = instance.calcBodyPartStatus(points, bodyPart, valid);
        
       //compare the expected return value with actual value returned
       assertEquals(expResult, result);
        
        
        /*********************************
         * Test case #4.
        **********************************/
        
        //Input values for test case 2
        
        System.out.println("calcBodyPartStatus test 4");
        
        points = 1;
        bodyPart.setName("Brain");
        valid = true;
        
        expResult = "Really Bad";// expected output return value
        
        //Call funtion to run test
        result = instance.calcBodyPartStatus(points, bodyPart, valid);
        
        //compare the expected return value with actual value returned
        assertEquals(expResult, result);
        
        
        
        /*********************************
         * Test case #5.
        **********************************/
        
        //Input values for test case 2
        
        System.out.println("calcBodyPartStatus test 5");
        
        points = 3;
        bodyPart.setName("Brain");
        valid = true;
        
        expResult = "Bad";// expected output return value
        
        //Call funtion to run test
        result = instance.calcBodyPartStatus(points, bodyPart, valid);
        
        //compare the expected return value with actual value returned
        assertEquals(expResult, result);
        
        
        /*********************************
            * Test case #6.
        **********************************/
        
        //Input values for test case 1
        
        System.out.println("calcBodyPartStatus test 6");
        
        points = 5;
        bodyPart.setName("Brain");
        valid = true;
        
        expResult = "Normal";// expected output return value
        
        //Call funtion to run test
       result = instance.calcBodyPartStatus(points, bodyPart, valid);
        
       //compare the expected return value with actual value returned
       assertEquals(expResult, result);
        
        
        /*********************************
         * Test case #7.
        **********************************/
        
        //Input values for test case 2
        
        System.out.println("calcBodyPartStatus test 7");
        
        points = 7;
        bodyPart = new BodyPart();
        valid = true;
        
        expResult = "Good";// expected output return value
        
        //Call funtion to run test
        result = instance.calcBodyPartStatus(points, bodyPart, valid);
        
        //compare the expected return value with actual value returned
        assertEquals(expResult, result);
        
        
        
        /*********************************
         * Test case #8.
        **********************************/
        
        //Input values for test case 2
        
        System.out.println("calcBodyPartStatus test 8");
        
        points = 9;
        bodyPart.setName("Brain");
        valid = true;
        
        expResult = "Excellent";// expected output return value
        
        //Call funtion to run test
        result = instance.calcBodyPartStatus(points, bodyPart, valid);
        
        //compare the expected return value with actual value returned
        assertEquals(expResult, result);
        
        
        /*********************************
            * Test case #9.
        **********************************/
        
        //Input values for test case 1
        
        System.out.println("calcBodyPartStatus test 9");
        
        points = -1;
        bodyPart.setName("Brain");
        valid = true;
        
        expResult = "Error: Points cannot be less than 0";// expected output return value
        
        //Call funtion to run test
       result = instance.calcBodyPartStatus(points, bodyPart, valid);
        
       //compare the expected return value with actual value returned
       assertEquals(expResult, result);
        
        
        /*********************************
         * Test case #10.
        **********************************/
        
        //Input values for test case 2
        
        System.out.println("calcBodyPartStatus test 10");
        
        points = 11;
        bodyPart.setName("Brain");
        valid = true;
        
        expResult = "Error: Points cannot be greater than 10";// expected output return value
        
        //Call funtion to run test
        result = instance.calcBodyPartStatus(points, bodyPart, valid);
        
        //compare the expected return value with actual value returned
        assertEquals(expResult, result);
       
     
        /*********************************
            * Test case #11.
        **********************************/
        
        //Input values for test case 1
        
        System.out.println("calcBodyPartStatus test 11");
        
        points = 0;
        bodyPart.setName("slkjlfkjls");
        valid = false;
        
        expResult = "Error: Invalid Body Part";// expected output return value
        
        //Call funtion to run test
       result = instance.calcBodyPartStatus(points, bodyPart, valid);
        
       //compare the expected return value with actual value returned
       assertEquals(expResult, result);
        
        
        /*********************************
         * Test case #12.
        **********************************/
        
        //Input values for test case 2
        
        System.out.println("calcBodyPartStatus test 12");
        
        points = 0;
        bodyPart=null;
        valid = true;
        
        expResult = "Body Part is missing";// expected output return value
        
        //Call funtion to run test
        result = instance.calcBodyPartStatus(points, bodyPart, valid);
        
        //compare the expected return value with actual value returned
        assertEquals(expResult, result);
  
    }
    
}
