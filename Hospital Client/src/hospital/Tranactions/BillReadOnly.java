/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Tranactions;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public interface BillReadOnly extends Remote {

    public ArrayList<Bill> AllBills() throws RemoteException;

    public int getBillID(String name) throws RemoteException;

    public String getBPName(String name) throws RemoteException;

    public String getBDetails(String name) throws RemoteException;

    public double getBPrice(String name) throws RemoteException;

    public double getTIncome() throws RemoteException;
}
