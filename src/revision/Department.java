/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

import java.util.ArrayList;

/**
 *
 * @author 123321
 */
public class Department {
    int dno;
    String Name;
    ArrayList <Employee> empList;

    public Department() {
    }

    public Department(int dno, String Name) {
        this.dno = dno;
        this.Name = Name;
        empList = new ArrayList <Employee>();
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public void Add_Employee(Employee E){
        empList.add(E);
    }
    
    public void Remove_Employee(Employee E){
       empList.remove(E);
    }
    
    public int Get_Employee_Count(){
       return empList.size();
    }
    
    public void Print_Basic_Data(){
        for (int I=0 ; I<empList.size();I++ ){
            System.out.println(empList.get(I).getSSN()+ " " + empList.get(I).getName()+" "+empList.get(I).getSex());
        }
    }
    
    public void Print_All_Details(){
        for (int I=0 ; I<empList.size();I++ ){
            if(empList.get(I) instanceof SalariedEmployee)
                ((SalariedEmployee)empList.get(I)).DisplayAllDetails();
            if(empList.get(I) instanceof HourlyEmployee)
                ((HourlyEmployee)empList.get(I)).DisplayAllDetails();
            if(empList.get(I) instanceof CommissionEmployee)
                ((CommissionEmployee)empList.get(I)).DisplayAllDetails();
        }
    }

}
