/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;

import hospital.Tranactions.Medical_Insurance;
import hospital.Tranactions.Operation;
import java.io.Serializable;
import java.rmi.RemoteException;


public class Accountant extends Person implements Serializable,Observer{
    private String jobDegree;
    private String OperationTime;
    private String OperationTimeType ;

    

    public Accountant(String jobDegree, String name, String email, String phone, int age, String gender, String address, String role, float salary) {
        super(name, email, phone, age, gender, address, role, salary);
        this.jobDegree = jobDegree;
    }

   

   

    public String getJobDegree() {
        return jobDegree;
    }

    public void setJobDegree(String jobDegree) {
        this.jobDegree = jobDegree;
    }

    @Override
  public void update(String time, String type){
        this.OperationTime = time;
        this.OperationTimeType = type;
        
    }
     
   

     
}
