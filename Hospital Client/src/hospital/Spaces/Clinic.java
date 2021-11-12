/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Spaces;

import java.util.ArrayList;
import hospital.Person.*;

/**
 *
 * @author Lenovo
 */
public class Clinic {
    private String WorkingDays;
    private String ClinicNumber;
    private int OpenHours;
    private ArrayList<Doctor> doctor;
    private float checkUp_price;

    public Clinic(String WorkingDays, int OpenHours, ArrayList<Doctor> doctor, float checkUp_price) {
        this.WorkingDays = WorkingDays;
        this.OpenHours = OpenHours;
        this.doctor = doctor;
        this.checkUp_price = checkUp_price;
    }

    public String getClinicNumber() {
        return ClinicNumber;
    }

    public void setClinicNumber(String ClinicNumber) {
        this.ClinicNumber = ClinicNumber;
    }

    public String getWorkingDays() {
        return WorkingDays;
    }

    public void setWorkingDays(String WorkingDays) {
        this.WorkingDays = WorkingDays;
    }

    public int getOpenHours() {
        return OpenHours;
    }

    public void setOpenHours(int OpenHours) {
        this.OpenHours = OpenHours;
    }

    public ArrayList<Doctor> getDoctor() {
        return doctor;
    }

    public void setDoctor(ArrayList<Doctor> doctor) {
        this.doctor = doctor;
    }

    public float getCheckUp_price() {
        return checkUp_price;
    }

    public void setCheckUp_price(float checkUp_price) {
        this.checkUp_price = checkUp_price;
    }

    
    
}
