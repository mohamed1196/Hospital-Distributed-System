/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;

import hospital.Tranactions.Test;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public interface ChemistInterface extends Remote{
  public ArrayList<Test> getAllLaboratoryTest()throws RemoteException;
    
    public void makeTest(String TestType, float testPrice, String PateintName, int TestSample) throws RemoteException;
}
