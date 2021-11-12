/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Spaces;

import java.util.ArrayList;
import hospital.Expenditures.*;

/**
 *
 * @author Lenovo
 */
public class Warehouse {
    private int WarehouseNum;
    private ArrayList <Medicine> medicine;
    private ArrayList <MedicalTool> MedicalTool;
    private int Medicinequantity;
    private int medicalToolquantity;

    public Warehouse(ArrayList<Medicine> medicine, ArrayList<MedicalTool> MedicalTool, int Medicinequantity, int medicalToolquantity) {
        this.medicine = medicine;
        this.MedicalTool = MedicalTool;
        this.Medicinequantity = Medicinequantity;
        this.medicalToolquantity = medicalToolquantity;
    }

    public ArrayList<Medicine> getMedicine() {
        return medicine;
    }

    public void setMedicine(ArrayList<Medicine> medicine) {
        this.medicine = medicine;
    }

    public ArrayList<MedicalTool> getMedicalTool() {
        return MedicalTool;
    }

    public void setMedicalTool(ArrayList<MedicalTool> MedicalTool) {
        this.MedicalTool = MedicalTool;
    }

    

    public int getMedicinequantity() {
        return Medicinequantity;
    }

    public void setMedicinequantity(int Medicinequantity) {
        this.Medicinequantity = Medicinequantity;
    }

    public int getMedicalToolquantity() {
        return medicalToolquantity;
    }

    public void setMedicalToolquantity(int medicalToolquantity) {
        this.medicalToolquantity = medicalToolquantity;
    }

    public int getWarehouseNum() {
        return WarehouseNum;
    }

    public void setWarehouseNum(int WarehouseNum) {
        this.WarehouseNum = WarehouseNum;
    }

    
    public boolean CheckMedicinequantity(){
    return true;
}
    public boolean CheckMedicalToolquantity(){
        return true;
}
    
    
}
