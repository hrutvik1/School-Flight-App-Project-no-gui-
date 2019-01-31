/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hrutvik
 */
public class FlightTest {
    
    public FlightTest(){
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testValidConstructor() {
         boolean exceptionCaught=false;
         try{
             Flight a = new Flight(1, "origin", "destination", "time", 4, 4.20);
         }
         catch (Exception ex){
             exceptionCaught=true;
         }
         assertFalse(exceptionCaught);
     }
          
     public void testInvalidConstructor() {
         try{
             Flight a = new Flight(1, "origin", "destination", "time", 4, 4.20);
         }
         catch (Exception ex){         
         assertEquals(ex, new IllegalArgumentException());
     }
     }
}
