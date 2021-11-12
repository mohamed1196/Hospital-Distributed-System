/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import hospital.Tranactions.Bill;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author isl27
 */
public class HBController extends UnicastRemoteObject implements Budget {

//    static final long serialVersionUID;
    public HBController() throws RemoteException {
    }

    DBConnection db = new DBConnection();

    @Override
    public double getWages() throws RemoteException {
        return db.getBudget().getWagesExpenditures();
    }

    @Override
    public double getEq() throws RemoteException {
        return db.getBudget().getEquipmentExpenditures();
    }

    @Override
    public double getMT() throws RemoteException {
        return db.getBudget().getMedicalToolsExpenditures();
    }

    @Override
    public double getMedicine() throws RemoteException {
        return db.getBudget().getMedicineExpenditures();
    }

    @Override
    public double getIT() throws RemoteException {
        return db.getBudget().getIntial_treasury();
    }


    @Override
    public double setWagesExpenditures(String name, double wagesExpenditures) throws RemoteException {
        db.updateWagesEx(name, wagesExpenditures);
        return wagesExpenditures;
    }

    @Override
    public double setEquipmentExpenditures(String name, double EquipmentExpenditures) throws RemoteException {
        db.updateEquipmentEx(name, EquipmentExpenditures);
        return EquipmentExpenditures;
    }

    @Override
    public double setMedicalToolsExpenditures(String name, double medicalToolsExpenditures) throws RemoteException {
        db.updateMedicalToolsEx(name, medicalToolsExpenditures);
        return medicalToolsExpenditures;
    }

    @Override
    public double setMedicineExpenditures(String name, double medicineExpenditures) throws RemoteException {
        db.updateMedicineEx(name, medicineExpenditures);
        return medicineExpenditures;
    }

}
