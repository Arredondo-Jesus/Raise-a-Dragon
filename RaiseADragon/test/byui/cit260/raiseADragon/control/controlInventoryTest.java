/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.raiseADragon.control;

import byui.cit260.raiseADragon.model.Item;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chuy
 */
public class controlInventoryTest {
    
    public controlInventoryTest() {
    }

    /**
     * Test of calcCostOfItem method, of class controlInventory.
     */
    @Test
    public void testCalcCostOfItem() {
        
        System.out.println("calcCostOfItem test 1");
        
        /*********************************
         * Test case #1
        **********************************/
        
        //Input values for test case 1
        int number = 12;
        double unitCost = 2.0;
        String nameOfItem="ball";
        Item item = new Item();
        item.setName("ball");
        
        //create the instance of the controlInventory class
        ControlInventory instance = new ControlInventory();
        
        double expResult = 24.0;// expected output return value
        
        //Call funtion to run test
        double result = instance.calcCostOfItem(number, unitCost, item, nameOfItem);
        
        //compare the expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
        System.out.println("calcCostOfItem test 2");
        
        /*********************************
         * Test case #2
        **********************************/
        
        //Input values for test case 1
        number = -4;
        unitCost = 1.0;
        nameOfItem = "ball";
        item.setName("ball");
        
        expResult = -1;// expected output return value
        
        //Call funtion to run test
        result = instance.calcCostOfItem(number, unitCost, item, nameOfItem);
        
        //compare the expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("calcCostOfItem test 3");
        
        /*********************************
         * Test case #3
        **********************************/
        
        //Input values for test case 1
        number = -3;
        unitCost = 5.0;
        nameOfItem = "ball";
        item.setName("sjlfjlskfdj");
        
        expResult = -1;// expected output return value
        
        //Call funtion to run test
        result =  instance.calcCostOfItem(number, unitCost, item, nameOfItem);
        
        //compare the expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
        System.out.println("calcCostOfItem test 4");
        
        /*********************************
         * Test case #4
        **********************************/
        
        //Input values for test case 1
        number = -125;
        unitCost = 3.0;
        nameOfItem = "ball";
        item.setName("ball");
        
        expResult = -1;// expected output return value
        
        //Call funtion to run test
        result = instance.calcCostOfItem(number, unitCost, item, nameOfItem);
        
        //compare the expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
        System.out.println("calcCostOfItem test 5");
        
        /*********************************
         * Test case #5
        **********************************/
        
        //Input values for test case 1
        number = 3;
        unitCost = 1000.0;
        nameOfItem = "ball";
        item.setName("ball");
        
        expResult = 3000;// expected output return value
        
        //Call funtion to run test
        result = instance.calcCostOfItem(number, unitCost, item, nameOfItem);
        
        //compare the expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
        System.out.println("calcCostOfItem test 6");
        
        /*********************************
         * Test case #6
        **********************************/
        
        //Input values for test case 1
        number = 9;
        unitCost = 0.0;
        nameOfItem = "ball";
        item.setName("ball");
        
        expResult = 0;// expected output return value
        
        //Call funtion to run test
        result = instance.calcCostOfItem(number, unitCost, item, nameOfItem);
        
        //compare the expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
        System.out.println("calcCostOfItem test 7");
        
        /*********************************
         * Test case #7
        **********************************/
        
        //Input values for test case 1
        number = 9;
        unitCost = 1000;
        nameOfItem = "ball";
        item.setName("ball");
        
        expResult = 9000;// expected output return value
        
        //Call funtion to run test
        result = instance.calcCostOfItem(number, unitCost, item, nameOfItem);
        
        //compare the expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("calcCostOfItem test 8");
        
        /*********************************
         * Test case #8
        **********************************/
        
        //Input values for test case 1
        number = 9;
        unitCost = 1000;
        nameOfItem = "ball";
        item = null;
        
        expResult = -1;// expected output return value
        
        //Call funtion to run test
        result = instance.calcCostOfItem(number, unitCost, item, nameOfItem);
        
        //compare the expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
