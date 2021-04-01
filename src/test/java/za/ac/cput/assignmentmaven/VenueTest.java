/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignmentmaven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Kegomoditswe Leshope 219189048
 */
public class VenueTest {
    
    public VenueTest() {
        
    }

    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getBuildingName method, of class Venue.
     */
    @Test
  public void testGetBuildingName() {
        System.out.println("getBuildingName");
        Venue instance = new Venue();
        String expResult = "";
        String result = instance.getBuildingName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomNumber method, of class Venue.
     */
    @Test
    public void testGetRoomNumber() {
        System.out.println("getRoomNumber");
        Venue instance = new Venue();
        String expResult = "";
        String result = instance.getRoomNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberSeats method, of class Venue.
     */
    @Test
    public void testGetNumberSeats() {
        System.out.println("getNumberSeats");
        Venue instance = new Venue();
        int expResult = 0;
        int result = instance.getNumberSeats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBuildingName method, of class Venue.
     */
    @Test
    public void testSetBuildingName() {
        System.out.println("setBuildingName");
        String buildingName = "";
        Venue instance = new Venue();
        instance.setBuildingName(buildingName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoomNumber method, of class Venue.
     */
    @Test
    public void testSetRoomNumber() {
        System.out.println("setRoomNumber");
        String roomNumber = "";
        Venue instance = new Venue();
        instance.setRoomNumber(roomNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberSeats method, of class Venue.
     */
    @Test
    public void testSetNumberSeats() {
        System.out.println("setNumberSeats");
        int numberSeats = 0;
        Venue instance = new Venue();
        instance.setNumberSeats(numberSeats);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Venue.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Venue instance = new Venue();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
      
    }
    
}
