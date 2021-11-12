/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;

import hospital.DBConnection;
import hospital.Tranactions.Operation;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author mazen
 */
public class PersonHandler extends UnicastRemoteObject implements PersonInterface {

    
    DBConnection db =new DBConnection();
    
    public PersonHandler() throws RemoteException {
    }
    
     @Override
    public void RegisterP(Person P){
      if(db.PersonAlreadyExists(P))
          System.out.print("The User Already Exists!!!!!");
      else{
          db.insertPerson(P);}
   }

    @Override
    public void DeleteP(Person P)
    {
        db.deletePerson(P.getEmail());
    }

   @Override
    public void UpdateP(Person P)
    {
        db.updatePerson(P);
    }

    @Override
     public Person GetP(String email ){
         
         return db.getPersonByMail(email);
     }
     
    
    @Override
      public ArrayList<Doctor> getAllDoctors(){
          return db.getAllDoctors();
      }
    
    @Override
    public ArrayList<Nurse> getAllNurses(){
        return db.getAllNurses();
    }
    
    @Override
     public Doctor getDoctorByMail(String email) {
         return db.getDoctorByMail(email);
     }
    
    @Override
    public Nurse getNurseByMail(String email){
        return db.getNurseByMail(email);
    }
    
    @Override
    public Admin getAdmin(){
        return db.getAdmin();
    }
    
    @Override
    public void updateDoctor(Doctor P){
        db.updateDoctor(P);
    }
    
    @Override
    public void updatePatientMedicine(String em, String p, String m){
           String email = em;
            String medicine = m;
            String phone = p;
            db.UpdatePatientMedicine(phone, medicine);
            Doctor dt = db.getDoctorByMail(email);
            
      for(int i =0; i<dt.getPatient().size(); i++){
          if(dt.getPatient().get(i).getPhone().equals(p))
              dt.getPatient().get(i).setMedicine(m);
      }
            
      db.updateDoctor(dt);
  }
    
     @Override
    public Operation getOperation(){
        return db.getOperation();
    }
    
    @Override
     public void UpdateNurseAvailablity(String email, boolean av){
         db.UpdateNurseAvailablity(email, av);
     }
}
