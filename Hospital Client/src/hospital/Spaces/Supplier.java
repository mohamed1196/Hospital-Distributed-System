/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Spaces;

/**
 *
 * @author Lenovo
 */
public class Supplier {
    private String Supply_Type;
    private String Supplier_Name;
    private String Location;

    public Supplier(String Supply_Type, String Supplier_Name, String Location) {
        this.Supply_Type = Supply_Type;
        this.Supplier_Name = Supplier_Name;
        this.Location = Location;
    }

    public String getSupply_Type() {
        return Supply_Type;
    }

    public void setSupply_Type(String Supply_Type) {
        this.Supply_Type = Supply_Type;
    }

    public String getSupplier_Name() {
        return Supplier_Name;
    }

    public void setSupplier_Name(String Supplier_Name) {
        this.Supplier_Name = Supplier_Name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }
    
    
}
