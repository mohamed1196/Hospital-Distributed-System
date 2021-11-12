/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;


import hospital.Person.*;

import java.io.Serializable;

import hospital.Person.Patient;
import hospital.Person.Person;
import java.rmi.RemoteException;

import java.util.ArrayList;
/**
 *
 * @author islam
 */

public class Chemist extends Person implements Serializable{
    
    private String JobDegree;
    private String Shift;

    public Chemist(String JobDegree, String Shift,String name, String email, String phone, int age, String gender, String address, String role, float salary) {
       super(name, email, phone, age, gender, address, role, salary);
        this.JobDegree = JobDegree;
        this.Shift = Shift;
       
    }
    
    public Chemist() {
    }
    
    public String getDegreeLvl() {
        return JobDegree;
    }

    public void setDegreeLvl(String JobDegree) {
        this.JobDegree = JobDegree;
    }

    public String getShift() {
        return Shift;
    }

    public void setShift(String Shift) {
        this.Shift = Shift;
    }

    @Override
    public String toString() {
        return "Chemist{" + "JobDegree=" + JobDegree + ", Shift=" + Shift + '}';
    }


    
}
