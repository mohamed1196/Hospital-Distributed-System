/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;
import hospital.Person.*;
import java.io.Serializable;

/**
 *
 * @author islam
 */
public class Patient implements Serializable{
    
    private String BT;
    private String name;
    private String phone;
    private int age;
    private String gender;
    private String MedicalCondition;
    private String Medicine = "";


    public Patient() {
    }
    

    public Patient(String BT, String name, String phone, int age, String gender, String MedicalCondition) {
        this.BT = BT;
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
        this.MedicalCondition = MedicalCondition;
    }

    public String getBT() {
        return BT;
    }

    public void setBT(String BT) {
        this.BT = BT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getMedicalCondition() {
        return MedicalCondition;
    }

    public void setMedicalCondition(String MedicalCondition) {
        this.MedicalCondition = MedicalCondition;
    }

    public String getMedicine() {
        return Medicine;
    }

    public void setMedicine(String Medicine) {
        this.Medicine = Medicine;
    }

    @Override
    public String toString() {
        return "Patient{" + "BT=" + BT + ", name=" + name + ", phone=" + phone + ", age=" + age + ", gender=" + gender + ", MedicalCondition=" + MedicalCondition + ", Medicine=" + Medicine + '}';
    }

           
}
