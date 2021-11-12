/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Tranactions;

import java.io.Serializable;


/**
 *
 * @author mazen
 */
public class Bill implements Serializable{
    private int BillID;
    private String PateintName;
    private String BillDetails;
    private double TotalMoney;

    public Bill(int BillID, String PateintName, String BillDetails, double TotalMoney) {
        this.BillID = BillID;
        this.PateintName = PateintName;
        this.BillDetails = BillDetails;
        this.TotalMoney = TotalMoney;
    }

    public int getBillID() {
        return BillID;
    }

    public void setBillID(int BillID) {
        this.BillID = BillID;
    }

    public String getPateintName() {
        return PateintName;
    }

    public void setPateintName(String PateintName) {
        this.PateintName = PateintName;
    }

    public String getBillDetails() {
        return BillDetails;
    }

    public void setBillDetails(String BillDetails) {
        this.BillDetails = BillDetails;
    }

    public double getTotalMoney() {
        return TotalMoney;
    }

    public void setTotalMoney(double TotalMoney) {
        this.TotalMoney = TotalMoney;
    }

    @Override
    public String toString() {
        return "Bill{" + "BillID=" + BillID + ", PateintName=" + PateintName + ", BillDetails=" + BillDetails + ", TotalMoney=" + TotalMoney + '}';
    }
    
    
    

}
