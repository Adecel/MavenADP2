package za.ac.cput.assignmentmaven;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author ChanteLewis
 * My student nr.: 216118395
 */
public class ListsTest {

	private List list;
	
	@BeforeEach
	public void setUp(){
		list = new ArrayList();
	}
	
	@Test
	public void testList(){
		assertTrue(list.isEmpty());
		assertTrue(list.size() == 0);
	}
	
	
	@Test
	public void testAddElements(){
		list.add(0, "Leanie");
		list.add(1, "Rema");
		list.add(2, "Denver");
		
		assertEquals("Leanie", list.get(0));
		assertEquals("Rema", list.get(1));
		assertEquals("Denver", list.get(2));
		
		list.add(3, "Chante");
                
                assertEquals("Leanie", list.get(0));
		assertEquals("Rema", list.get(1));
		assertEquals("Denver", list.get(2));
		assertEquals("Chante", list.get(3));	
		
		assertTrue(list.size()==4);
	}
	
	
        //Failing Test
	@Test 
	public void testSetElementNull(){
		list.add(0, "Khayla");
		list.set(0, null);
                fail();
	}
	
	@Test
	public void testSetElement(){
		list.add(0, "Leanie");
		list.add(1, "Rema");
		list.add(2, "Denver");
                
		list.set(1, "Jakes");
		
		assertEquals("Leanie", list.get(0));
		assertEquals("Jakes", list.get(1));
		assertEquals("Denver", list.get(2));
	}
	
	@Test
	public void testRemoveElement(){
                list.add(0, "Leanie");
		list.add(1, "Rema");
		list.add(2, "Denver");
		assertEquals("Denver", list.remove(2));
		assertTrue(list.size() == 2);
	}
        
        @Test 
	public void testCompare(){
                list.add(0, "Leanie");
		list.add(1, "Rema");
		list.add(2, "Denver");
                list.add(3,"Leanie");
		assertSame(list.get(0), list.get(3));
	}
        
        //Disabled Test
        @Disabled("testRemoveEmptyList is disabled")
	@Test 
	public void testRemoveEmptyList(){
		list.remove(0);
	}
        
        @Test
        @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
        public void testTimeout(){
	}
    
	}




