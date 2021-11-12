/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;

import hospital.DBConnection;
import hospital.Tranactions.Medical_Insurance;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author mazen
 */
public class Reception extends UnicastRemoteObject implements ReceptionistManager {
    DBConnection db = new DBConnection();
    
    public Reception() throws RemoteException {
    }
    
    @Override
    public void registerPateint(Patient P, String Admission) throws RemoteException {
        if(Admission.equals("outdoors")){
            db.insertOutDoorPatient(P);
        }else if(Admission.equals("indoors")){
            db.insertInDoorPatient(P);
        }
    }

    @Override
    public void File_Insurance_Claim(Medical_Insurance MI) throws RemoteException {
       if(ApproveInsuranceClaim(MI)){
         db.FilePatientInsurance(MI);
        }
    }
     public boolean ApproveInsuranceClaim(Medical_Insurance MI){
        boolean approvment;
        if(MI.isStatus()==true){
            approvment = true;
        }else{
        approvment = false;
        }
        return approvment;
    }
     
    @Override
    public void UpdatePatient(Patient p){
        db.UpdatePatient(p);
    } 
    
    @Override
    public Patient getPatientByPhone(String phone){
        return db.getPatientByPhone(phone);
    }
   
    @Override
     public ArrayList<Patient> getAllOutDoorPatients(){
         return db.getAllOutDoorPatients();
     }
     
    @Override
     public void UpdatePatientMedicine(String p, String m){
         db.UpdatePatientMedicine(p, m);
     }
     
    @Override
     public ArrayList<Patient> getAllInDoorPatients(){
         return db.getAllPatient();
     }
}
