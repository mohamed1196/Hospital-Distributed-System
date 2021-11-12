/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;


import hospital.DB;
import java.rmi.RemoteException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hmoo_
 */
public class PersonHandlerTest {
    
    public PersonHandlerTest() {
    }

    /**
     * Test of RegisterP method, of class PersonHandler.
     * @throws java.rmi.RemoteException
     */
    @Test
    public void testRegisterP() throws RemoteException {
        Person p = new Doctor("Neurologist","Neuro-dept","day","test1","test1@test1.com","11111",30,"Male","helwan","Doctor",12500);
        PersonHandler instance = new PersonHandler();
        instance.RegisterP(p);
       assertNotNull(instance.GetP(p.getEmail()));
    }

    /**
     * Test of UpdateP method, of class PersonHandler.
     */
    @Test
    public void testUpdateP() throws RemoteException {
        Person p = new Doctor("Neurologist","Neuro-dept","day","Update12","test@test.com","11111",30,"Male","helwan","Doctor",12500);
        PersonHandler instance = new PersonHandler();
        instance.UpdateP(p);
        assertEquals(p.getName(),instance.GetP(p.getEmail()).getName());
    }
    
    /**
     * Test of GetP method, of class PersonHandler.
     */
    @Test
    public void testGetP() throws RemoteException {
        PersonHandler instance = new PersonHandler();
        
        assertNotNull(instance.GetP("test@test.com"));
    }

     /**
     * Test of DeleteP method, of class PersonHandler.
     */
  
      @Test
    public void testDeleteP() throws RemoteException {
        Person p = new Doctor("Neurologist","Neuro-dept","day","test1","test1@test1.com","11111",30,"Male","helwan","Doctor",12500);
        PersonHandler instance = new PersonHandler();
        instance.DeleteP(p);
        assertFalse(DB.db.PersonAlreadyExists(p));
    }
    
    
   
    
    
}
