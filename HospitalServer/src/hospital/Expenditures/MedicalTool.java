/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Expenditures;

/**
 *
 * @author hmoo_
 */
public class MedicalTool {
    private String Type;
    private String Manufacturer;
    private String Code;

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public MedicalTool(String Type, String Manufacturer, String Code) {
        this.Type = Type;
        this.Manufacturer = Manufacturer;
        this.Code = Code;
    }

    public MedicalTool() {
    }

}
