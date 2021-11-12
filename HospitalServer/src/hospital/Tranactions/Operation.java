/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Tranactions;

import hospital.DB;
import hospital.Person.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author mazen
 */
public class Operation extends UnicastRemoteObject implements OperationInterface{

    private int id;
    private float cost;
    private String time;
    private String type;
    private String AssignedNurse;
    private String AssignedDoctor;

    private int RoomNumber;
    private String PatientName;
    private ArrayList<Doctor> Observers1 = new ArrayList<Doctor>();
    private ArrayList<Nurse> Observers3 = new ArrayList<Nurse>();


    public Operation(float cost, String time, String type,int RoomNumber) throws RemoteException{
        this.id = 1;
        this.cost = cost;
        this.time = time;
        this.type = type;
        this.RoomNumber = RoomNumber;
        
    }

    public Operation()throws RemoteException {
        this.id = 1;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

  
    

    @Override

    public float getCost() {
        return cost;
    }

    @Override
    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String getTime() {
        return time;
    }

    @Override
    public void setTime(String time) {
        this.time = time;
        for(int i = 0; i <this.Observers1.size(); i++){
            this.Observers1.get(i).update(this.time,this.type);
        }
        
        for(int i = 0; i <this.Observers3.size(); i++){
            this.Observers3.get(i).update(this.time,this.type);
        }
    }


    @Override
    public String getAssignedNurse() {
        return AssignedNurse;
    }

    @Override
    public void setAssignedNurse(String AssignedNurse) {
        this.AssignedNurse = AssignedNurse;
    }

    @Override
    public String getAssignedDoctor() {
        return AssignedDoctor;
    }

    @Override
    public void setAssignedDoctor(String AssignedDoctor) {
        this.AssignedDoctor = AssignedDoctor;
    }


    @Override
    public int getRoomNumber() {
        return RoomNumber;
    }

    @Override
    public void setRoomNumber(int RoomNumber) {
        this.RoomNumber = RoomNumber;
    }

    @Override
    public String getPatientName() {
        return PatientName;
    }

    @Override
    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
        for(int i = 0; i <this.Observers1.size(); i++){
            this.Observers1.get(i).update(this.time,this.type);
        }
        
        for(int i = 0; i <this.Observers3.size(); i++){
            this.Observers3.get(i).update(this.time,this.type);
        }
    }

    @Override
    public void addObserver1(Doctor d) {
        this.Observers1.add(d);
    }

    @Override
    public void removeObserver1(Doctor d) {
        this.Observers1.remove(d);
    }

    @Override
    public ArrayList<Doctor> getObservers1() {
        return Observers1;
    }

    @Override
    public ArrayList<Nurse> getObservers3() {
        return Observers3;
    }
    
 
    @Override
 public void addObserver3(Nurse n) {
        this.Observers3.add(n);
    }

    @Override
    public void removeObserver3(Nurse n) {
        this.Observers3.remove(n);
    }

    @Override
    public void addToDB(){
        DB.db.insertOperation(this);
    }
    
    @Override
    public void updateInDB(){
        DB.db.updateOperation(this);
    }
    
   
}
