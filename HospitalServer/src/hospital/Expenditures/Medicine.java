/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Expenditures;

import java.util.Date;

/**
 *
 * @author hmoo_
 */
public class Medicine {
    private String Medicine_Name;
    private String Code;
    private String Medicine_Type;
    private Date Medicine_ExpireDate;
    private String Manufacturer_company;

    public Medicine() {
    }

    public Medicine(String Medicine_Name, String Code, String Medicine_Type, Date Medicine_ExpireDate, String Manufacturer_company) {
        this.Medicine_Name = Medicine_Name;
        this.Code = Code;
        this.Medicine_Type = Medicine_Type;
        this.Medicine_ExpireDate = Medicine_ExpireDate;
        this.Manufacturer_company = Manufacturer_company;
    }

    public String getMedicine_Name() {
        return Medicine_Name;
    }

    public void setMedicine_Name(String Medicine_Name) {
        this.Medicine_Name = Medicine_Name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getMedicine_Type() {
        return Medicine_Type;
    }

    public void setMedicine_Type(String Medicine_Type) {
        this.Medicine_Type = Medicine_Type;
    }

    public Date getMedicine_ExpireDate() {
        return Medicine_ExpireDate;
    }

    public void setMedicine_ExpireDate(Date Medicine_ExpireDate) {
        this.Medicine_ExpireDate = Medicine_ExpireDate;
    }

    public String getManufacturer_company() {
        return Manufacturer_company;
    }

    public void setManufacturer_company(String Manufacturer_company) {
        this.Manufacturer_company = Manufacturer_company;
    }
    
}
