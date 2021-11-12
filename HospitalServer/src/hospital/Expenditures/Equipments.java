/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Expenditures;

/**
 *
 * @author isl27
 */
public class Equipments {
    private int Id;
    private String type;
    private float price;

    public Equipments() {
    }

    public Equipments(int Id, String type, float price) {
        this.Id = Id;
        this.type = type;
        this.price = price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    
}
