/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;

import hospital.Tranactions.Operation;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author hmoo_
 */
public interface PersonInterface extends Remote{
    
    public void RegisterP(Person P)throws RemoteException;
    
    public void DeleteP(Person P)throws RemoteException;
    
    public void UpdateP(Person P)throws RemoteException;
    
    public Person GetP(String email)throws RemoteException;
    
    public Doctor getDoctorByMail(String email) throws RemoteException;
    
    public Nurse getNurseByMail(String email)throws RemoteException;
    
     public ArrayList<Doctor> getAllDoctors()throws RemoteException;
    
    public ArrayList<Nurse> getAllNurses()throws RemoteException;
    
    public Admin getAdmin()throws RemoteException;
    
    public void updateDoctor(Doctor P)throws RemoteException;
    
    public void updatePatientMedicine(String email, String p, String m) throws RemoteException;
    
      public Operation getOperation()throws RemoteException;
      
       public void UpdateNurseAvailablity(String email, boolean av) throws RemoteException;
}
