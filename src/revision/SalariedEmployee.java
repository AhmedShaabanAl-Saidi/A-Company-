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
public class SalariedEmployee extends Employee implements Displayable{
  double Salary , Bouns , Deductions;

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public double getBouns() {
        return Bouns;
    }

    public void setBouns(double Bouns) {
        this.Bouns = Bouns;
    }

    public double getDeductions() {
        return Deductions;
    }

    public void setDeductions(double Deductions) {
        this.Deductions = Deductions;
    }

    public SalariedEmployee() {
    }

    public SalariedEmployee(double Salary, double Bouns, double Deductions, String Name, int SSN, String Address, Gender Sex) {
        super(Name, SSN, Address, Sex);
        this.Salary = Salary;
        this.Bouns = Bouns;
        this.Deductions = Deductions;
    }
    
    @Override
    public double Earning(){
    return Salary + Bouns - Deductions;
    }
    
    @Override
    public void DisplayAllDetails(){
        System.out.println(super.toString());
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "Salary=" + Salary + ", Bouns=" + Bouns + ", Deductions=" + Deductions + '}';
    }
    
    @Override
    public void DisplayEarning(){
        System.out.println(Earning());
    }
}
