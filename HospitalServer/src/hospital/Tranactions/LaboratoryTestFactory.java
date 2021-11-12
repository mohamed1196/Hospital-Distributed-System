/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Tranactions;

/**
 *
 * @author mazen
 */
public class LaboratoryTestFactory {
    
   
    public LaboratoryTestFactory() {
      
    }
   
    public Test CreateTest(String Type, float testPrice, String PateintName, int TestSample){
        if(Type == null){
         return null;
      }		
      if(Type.equalsIgnoreCase("BloodTest")){
          BloodTest bt = new BloodTest( Type,  testPrice,  PateintName,  TestSample);
         return  bt;
         
      } else if(Type.equalsIgnoreCase("DiabetesTest")){
          DiabetesTest bt = new DiabetesTest( Type, testPrice,  PateintName,  TestSample);
         return  bt;
         
         
      } else if(Type.equalsIgnoreCase("PCRTest")){
          PCRTest bt = new PCRTest( Type,  testPrice,  PateintName,  TestSample);
         return  bt;
      }
      
      return null;
    }
    
    
}
