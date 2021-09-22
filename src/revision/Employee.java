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
enum Gender {Male , Female}
public abstract class Employee {
    protected String Name;
    protected int SSN;
    protected String Address;
    protected Gender Sex;

    public Employee() {
    }

    public Employee(String Name, int SSN, String Address, Gender Sex) {
        this.Name = Name;
        this.SSN = SSN;
        this.Address = Address;
        this.Sex = Sex;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getName() {
        return Name;
    }

    public int getSSN() {
        return SSN;
    }

    public String getAddress() {
        return Address;
    }

    public Gender getSex() {
        return Sex;
    }

    public void setSex(Gender Sex) {
        this.Sex = Sex;
    }
    
    public abstract double Earning();

    @Override
    public String toString() {
        return "Employee{" + "Name=" + Name + ", SSN=" + SSN + ", Address=" + Address + ", Sex=" + Sex + '}';
    }
    
    
}

