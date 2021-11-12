/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Spaces;

import hospital.Person.Nurse;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author hmoo_
 */
public class Ward extends UnicastRemoteObject implements WardInterface{
    private String WardId;
    private String WardName;
    private int NumOfRooms;
    private ArrayList<Room> Rooms;
    private  ArrayList<Nurse> NurseAssigned;

     public Ward(String WardId, String WardName, int NumOfRooms, ArrayList<Room> Rooms, ArrayList<Nurse> NurseAssigned) throws RemoteException{
        this.WardId = WardId;
        this.WardName = WardName;
        this.NumOfRooms = NumOfRooms;
        this.Rooms = Rooms;
        this.NurseAssigned = NurseAssigned;
    }

    public Ward() throws RemoteException{
    }
    
    public String getWardId() {
        return WardId;
    }

    public void setWardId(String WardId) {
        this.WardId = WardId;
    }

    public String getWardName() {
        return WardName;
    }

    public void setWardName(String WardName) {
        this.WardName = WardName;
    }

    public int getNumOfRooms() {
        return NumOfRooms;
    }

    public void setNumOfRooms(int NumOfRooms) {
        this.NumOfRooms = NumOfRooms;
    }

    public ArrayList getNurseAssigned() {
        return NurseAssigned;
    }


    public ArrayList<Room> getRooms() {
        return Rooms;
    }

    public void setRooms(ArrayList<Room> Rooms) {
        this.Rooms = Rooms;
    }

   

   
    @Override
    public void AssignNurseToWard (Nurse N){
        this.NurseAssigned.add(N);
    }
    
    @Override
    public void RemoveNurseFromWard (Nurse N){
        for(int i =0; i < this.NurseAssigned.size(); i++){
            if(N == this.NurseAssigned.get(i)){
                this.NurseAssigned.remove(N);
            }
        }
    }
}
