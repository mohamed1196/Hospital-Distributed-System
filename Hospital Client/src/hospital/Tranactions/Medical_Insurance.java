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
public class Medical_Insurance implements Serializable{
    private String Patient_ID;
    private String CompanyName;
    private boolean Status;
    private String Type;
   
    

    public Medical_Insurance() {
    }
    
    
    public Medical_Insurance(String Patient_ID, String CompanyName, boolean Status, String Type) {
        this.Patient_ID = Patient_ID;
        this.CompanyName = CompanyName;
        this.Status = Status;
        this.Type = Type;
    }


    public String getPatient_ID() {
        return Patient_ID;
    }

    public void setPatient_ID(String Patient_ID) {
        this.Patient_ID = Patient_ID;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
}
