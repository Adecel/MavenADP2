/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignmentmaven;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Ntobeko MAgam
 * @Student Number 216108055
 */
public class miniCulculatorTest {
    
    private  miniCulculator MiniCulculator;
    
    public miniCulculatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
       
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
         this.MiniCulculator = new miniCulculator();
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void testPrintCulName()
    {
        String result = MiniCulculator.printCulName("Best culculator");
                assertEquals("Best culculator", result);              
                
    }
    
    //Timeout
      @Test    
      @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void testAdd() {
        int result = MiniCulculator.add(3, 7);
        assertEquals(10, result);
    }
    
    
    //Disabled Test
        @Disabled("testSubtraction is diabled!")
    @Test
        @Timeout(value = 2, unit = TimeUnit.SECONDS)
         public void testSubtraction() {
        int result = MiniCulculator.subtraction(10, 5);
        assertEquals(5, result);
         

    }
         
         
         //Failing Test
         @Test
         @Timeout(value = 2, unit = TimeUnit.SECONDS)
         public void testmutltyPly(){
            int result = MiniCulculator.mutltyPly(2, 5);
           fail();
         }
         
         
         
         
         
   
}
