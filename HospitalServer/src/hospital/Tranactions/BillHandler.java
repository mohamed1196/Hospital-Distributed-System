/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Tranactions;

import hospital.DBConnection;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class BillHandler extends UnicastRemoteObject implements BillReadOnly {

    DBConnection db = new DBConnection();
    private ArrayList<Bill> result;

    public BillHandler() throws RemoteException {
        super();
    }

    @Override
    public ArrayList<Bill> AllBills() {
        return db.getAllBills();
    }

    @Override
    public int getBillID(String name) {

        return db.BillID(name);
    }
    
    @Override
    public String getBPName(String name) {

        return db.BillPname(name);
    }
    
    @Override
    public String getBDetails(String name) {

        return db.BillDetails(name);
    }
    
    @Override
    public double getBPrice(String name) {

        return db.BillPrice(name);
    }

    @Override
    public double getTIncome() {
        return db.getTotalIncome();
    }

}
