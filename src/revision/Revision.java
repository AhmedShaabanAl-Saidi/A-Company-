/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

/**
 *
 * @author 123321
 */
public class Revision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Department D = new Department(1,"IS");
        
        SalariedEmployee SE =new SalariedEmployee(5000,500,100,"Ahmed",1200,"Monofey",Gender.Male);
        D.Add_Employee(SE);
        
        HourlyEmployee HE =new HourlyEmployee(100,8,"Mohmed",1500,"Tanta",Gender.Male);
        D.Add_Employee(HE);
        
        CommissionEmployee CE =new CommissionEmployee(500,5000,"Mona",1800,"Monofey",Gender.Female);
        D.Add_Employee(CE);
        
        System.out.println(D.Get_Employee_Count());
        
        D.Print_Basic_Data();
        
        D.Print_All_Details();
    }
    
}
