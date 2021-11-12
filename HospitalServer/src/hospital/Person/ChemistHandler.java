/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;

import hospital.DBConnection;
import hospital.Tranactions.LaboratoryTestFactory;
import hospital.Tranactions.Test;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class ChemistHandler extends UnicastRemoteObject implements ChemistInterface {
DBConnection db = new DBConnection();
    
    public ChemistHandler() throws RemoteException {
        
    }
    
    
@Override
     public void makeTest(String TestType,  float testPrice, String PateintName, int TestSample){
         LaboratoryTestFactory lt = new LaboratoryTestFactory();
         Test t = lt.CreateTest(TestType, testPrice, PateintName, TestSample);
         t.MakeTest();
         db.insertLaboratoryTest(t);
     }
     
@Override
     public ArrayList<Test> getAllLaboratoryTest(){
         return db.getAllLaboratoryTest();
     }
             
}
    