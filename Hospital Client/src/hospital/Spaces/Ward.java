/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Spaces;

import hospital.Person.Nurse;
import java.util.ArrayList;

/**
 *
 * @author hmoo_
 */
public class Ward {
    private String WardId;
    private String WardName;
    private int NumOfRooms;
    private int NurseAssigned;
    private ArrayList<Room> Rooms;
    private  ArrayList<Nurse> Nurses;

     public Ward(String WardId, String WardName, int NumOfRooms, int NurseAssigned, ArrayList<Room> Rooms, ArrayList<Nurse> Nurses) {
        this.WardId = WardId;
        this.WardName = WardName;
        this.NumOfRooms = NumOfRooms;
        this.NurseAssigned = NurseAssigned;
        this.Rooms = Rooms;
        this.Nurses = Nurses;
    }

    public Ward() {
    }
    
    public void AssignNurseToWard (){ //Needs Modification in Code and UML#################################
        
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

    public int getNurseAssigned() {
        return NurseAssigned;
    }

    public void setNurseAssigned(int NurseAssigned) {
        this.NurseAssigned = NurseAssigned;
    }

    public ArrayList<Room> getRooms() {
        return Rooms;
    }

    public void setRooms(ArrayList<Room> Rooms) {
        this.Rooms = Rooms;
    }

    public ArrayList<Nurse> getNurses() {
        return Nurses;
    }

    public void setNurses(ArrayList<Nurse> Nurses) {
        this.Nurses = Nurses;
    }

   
    
    

}
