/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;

import hospital.Tranactions.Medical_Insurance;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author mazen
 */
public interface ReceptionistManager extends Remote {
    public void registerPateint(Patient P,String Admission) throws RemoteException;
    public void File_Insurance_Claim(Medical_Insurance MI) throws RemoteException;
    public Patient getPatientByPhone(String phone)throws RemoteException;
    public void UpdatePatient(Patient p) throws RemoteException;
    public void UpdatePatientMedicine(String p, String m) throws RemoteException;
     public ArrayList<Patient> getAllOutDoorPatients() throws RemoteException;
     public ArrayList<Patient> getAllInDoorPatients() throws RemoteException;
    
}
