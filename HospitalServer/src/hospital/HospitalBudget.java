/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import hospital.Tranactions.Bill;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author isl27
 */
public class HospitalBudget implements Serializable {

    private String HospName;
    private double wagesExpenditures;
    private double EquipmentExpenditures;
    private double medicalToolsExpenditures;
    private double medicineExpenditures;
    private double intial_treasury;

    public HospitalBudget(String HospName, double wagesExpenditures, double EquipmentExpenditures, double medicalToolsExpenditures, double medicineExpenditures, double intial_treasury) {
        this.HospName = HospName;
        this.wagesExpenditures = wagesExpenditures;
        this.EquipmentExpenditures = EquipmentExpenditures;
        this.medicalToolsExpenditures = medicalToolsExpenditures;
        this.medicineExpenditures = medicineExpenditures;
        this.intial_treasury = intial_treasury;
    }

    public String getHospName() {
        return HospName;
    }

    public void setHospName(String HospName) {
        this.HospName = HospName;
    }

    public double getWagesExpenditures() {
        return wagesExpenditures;
    }

    public void setWagesExpenditures(double wagesExpenditures) {
        this.wagesExpenditures = wagesExpenditures;
    }

    public double getEquipmentExpenditures() {
        return EquipmentExpenditures;
    }

    public void setEquipmentExpenditures(double EquipmentExpenditures) {
        this.EquipmentExpenditures = EquipmentExpenditures;
    }

    public double getMedicalToolsExpenditures() {
        return medicalToolsExpenditures;
    }

    public void setMedicalToolsExpenditures(double medicalToolsExpenditures) {
        this.medicalToolsExpenditures = medicalToolsExpenditures;
    }

    public double getMedicineExpenditures() {
        return medicineExpenditures;
    }

    public void setMedicineExpenditures(double medicineExpenditures) {
        this.medicineExpenditures = medicineExpenditures;
    }

    public double getIntial_treasury() {
        return intial_treasury;
    }

    public void setIntial_treasury(double intial_treasury) {
        this.intial_treasury = intial_treasury;
    }

}
