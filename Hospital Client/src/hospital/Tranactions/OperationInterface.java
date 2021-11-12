/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Tranactions;


import hospital.Person.Accountant;
import hospital.Person.Doctor;
import hospital.Person.Nurse;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author hmoo_
 */
public interface OperationInterface extends Remote {
    
    public float getCost() throws RemoteException;

    public void setCost(float cost) throws RemoteException;

    public String getTime() throws RemoteException;
    
    public void setTime(String time) throws RemoteException;
     
    public void setType(String type) throws RemoteException;
    
    public String getAssignedNurse() throws RemoteException;

    public void setAssignedNurse(String AssignedNurse) throws RemoteException;

    public String getAssignedDoctor() throws RemoteException;

    public void setAssignedDoctor(String AssignedDoctor) throws RemoteException;


    public int getRoomNumber() throws RemoteException;

    public void setRoomNumber(int RoomNumber) throws RemoteException;

    public String getPatientName() throws RemoteException;

    public void setPatientName(String PatientName) throws RemoteException;

    public String getType() throws RemoteException;
     
    public void addObserver1(Doctor d) throws RemoteException;

    public void removeObserver1(Doctor d) throws RemoteException;
    
    public void addObserver3(Nurse n) throws RemoteException;

    public void removeObserver3(Nurse n) throws RemoteException;
    
    public void addToDB() throws RemoteException;
    
    public void updateInDB()throws RemoteException;
    
      public int getId() throws RemoteException;

    public void setId(int id) throws RemoteException;
    
    public ArrayList<Doctor> getObservers1() throws RemoteException;

    public ArrayList<Nurse> getObservers3() throws RemoteException;

}

