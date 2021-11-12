/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Spaces;

import hospital.Person.Patient;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Room {
     private int RoomNum;
    private boolean RoomAvaliable;
    private String RoomType;
    private ArrayList <Patient> patients;
    private String WardName;

    public Room(int RoomNum, boolean RoomAvaliable, String RoomType, ArrayList<Patient> patients, String WardName) {
        this.RoomNum = RoomNum;
        this.RoomAvaliable = RoomAvaliable;
        this.RoomType = RoomType;
        this.patients = patients;
        this.WardName = WardName;
    }

    public int getRoomNum() {
        return RoomNum;
    }

    public void setRoomNum(int RoomNum) {
        this.RoomNum = RoomNum;
    }

    public boolean isRoomAvaliable() {
        return RoomAvaliable;
    }

    public void setRoomAvaliable(boolean RoomAvaliable) {
        this.RoomAvaliable = RoomAvaliable;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String RoomType) {
        this.RoomType = RoomType;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public String getWardName() {
        return WardName;
    }

    public void setWardName(String WardName) {
        this.WardName = WardName;
    }

   
   
    public boolean CheckAvaliableRoom(int RoomNum){
        return true;
    }
    public void EnrollPateint(Patient p){
    }
}
