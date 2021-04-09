package za.ac.cput.assignmentmaven;


import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ChanteLewis
 * My student nr. : 216118395
 */
public class Lists {
         private List list = new ArrayList();

	public boolean testList(){
            return list.isEmpty();
        }
   
   
        public void testAddElements(String name) {
		list.add(0, name);
	}

        public void testSetElementNull(){
            list.set(0, null);
        }
        
        public void testSetElement(){
            list.set(0, "name");
        }
	
        public void testRemoveElement(String name){
            list.remove(name);
        }
}
