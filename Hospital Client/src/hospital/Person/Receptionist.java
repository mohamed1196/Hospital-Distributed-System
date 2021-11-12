/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;

import hospital.Tranactions.Medical_Insurance;
import java.io.Serializable;
import java.rmi.RemoteException;

/**
 *
 * @author Ezzat
 */
public class Receptionist extends Person implements Serializable{
     private String shift;
     private String quification;
     
     
    public Receptionist(String shift, String quification, String name, String email, String phone, int age, String gender, String address, String role, float salary) {
        super(name, email, phone, age, gender, address, role, salary);
        this.shift = shift;
        this.quification = quification;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getQuification() {
        return quification;
    }

    public void setQuification(String quification) {
        this.quification = quification;
    }

    @Override
    public String toString() {
        return "Receptionist{" + "shift=" + shift + ", quification=" + quification + '}';
    }

    
}
