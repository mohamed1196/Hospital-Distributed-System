/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Spaces;


import hospital.Person.Nurse;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author hmoo_
 */
public interface WardInterface extends Remote{
    
    public void AssignNurseToWard (Nurse N)throws RemoteException;
    
    public void RemoveNurseFromWard (Nurse N)throws RemoteException;
}
