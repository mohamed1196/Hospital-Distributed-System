/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;

import hospital.Tranactions.Operation;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Ezzat
 */

public class Doctor extends Person implements Serializable,Observer{
   private String Specialziation;
    private String Department;
    private String shift;
    private ArrayList<Patient> patient = new ArrayList<Patient>();
    private String OperationTime;
    private String OperationType ;

 

    public Doctor(String Specialziation, String Department, String shift, String name, String email, String phone, int age, String gender, String address, String role, float salary) {
        super(name, email, phone, age, gender, address, role, salary);
        this.Specialziation = Specialziation;
        this.Department = Department;
        this.shift = shift;
        
    }



    public String getSpecialziation() {
        return Specialziation;
    }

    public void setSpecialziation(String Specialziation) {
        this.Specialziation = Specialziation;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public ArrayList<Patient> getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient.add(patient);
    }

    public String getOperationTime() {
        return OperationTime;
    }

    public void setOperationTime(String OperationTime) {
        this.OperationTime = OperationTime;
    }

    public String getOperationType() {
        return OperationType;
    }

    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

   
  @Override
  public void update(String time, String type){
        this.OperationTime = time;
        this.OperationType = type;
        
    }
}
