/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;


import hospital.Person.DeleteUser;
import hospital.Person.Doctor;
import hospital.Person.Person;
import hospital.Person.PersonInterface;
import hospital.Person.Reception;
import hospital.Person.ReceptionistManager;
import hospital.Person.UpdateUser;
import hospital.Tranactions.Bill;

import hospital.Tranactions.OperationInterface;
import java.rmi.RemoteException;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import hospital.Tranactions.BillReadOnly;

/**
 *
 * @author mazen
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Home ps = new Home();
        ps.setVisible(true);
       
    }
    
}
