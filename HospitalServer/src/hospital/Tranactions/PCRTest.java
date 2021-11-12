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
public class PCRTest implements Test{
    private String TestType;
    
    private float testPrice;
    private String PateintName;
    private int TestSample;

    public PCRTest(String TestType, float testPrice, String PateintName, int TestSample) {
        this.TestType = TestType;
        
        this.testPrice = testPrice;
        this.PateintName = PateintName;
        this.TestSample = TestSample;
    }

    @Override
    public int getTestSample() {
        return TestSample;
    }

    public void setTestSample(int TestSample) {
        this.TestSample = TestSample;
    }

    

    public PCRTest() {
        
    }


    @Override
    public String getTestType() {
        return TestType;
    }

    public void setTestType(String TestType) {
        this.TestType = TestType;
    }

  

    @Override
    public float getTestPrice() {
        return testPrice;
    }

    public void setTestPrice(float testPrice) {
        this.testPrice = testPrice;
    }

    /**
     *
     * @return
     */
    @Override
    public String getPateintName() {
        return PateintName;
    }

    public void setPateintName(String PateintName) {
        this.PateintName = PateintName;
    }
    
    @Override
    public void MakeTest () {
        
        this.TestSample = TestSample;
    }
    
}
