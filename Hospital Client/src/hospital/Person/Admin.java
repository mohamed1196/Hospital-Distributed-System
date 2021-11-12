/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;
import hospital.Tranactions.Operation;
import java.io.Serializable;
/**
 *
 * @author Ezzat
 */
public class Admin extends Person implements Serializable{
    private int adminLicence;
    private String Credintials;
    private static Admin AdminInsurance = null;
    

    private Admin() {
      
    }

    public int getAdminLicence() {
        return adminLicence;
    }

    public void setAdminLicence(int adminLicence) {
        this.adminLicence = adminLicence;
    }

    public String getCredintials() {
        return Credintials;
    }

    public void setCredintials(String Credintials) {
        this.Credintials = Credintials;
    }

    public static Admin getAdminInsurance() {
        return AdminInsurance;
    }

    public static void setAdminInsurance(Admin AdminInsurance) {
        Admin.AdminInsurance = AdminInsurance;
    }


   public static Admin GetInstance(){
        if (AdminInsurance == null) 
            AdminInsurance = new Admin(); 
       return AdminInsurance;
   }
    
   
    
}
