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
public class HourlyEmployee extends Employee implements Displayable{
    double Hourle_rate;
    int Number_Of_Hourles;

    public HourlyEmployee() {
    }

    public HourlyEmployee(double Hourle_rate, int Number_Of_Hourles, String Name, int SSN, String Address, Gender Sex) {
        super(Name, SSN, Address, Sex);
        this.Hourle_rate = Hourle_rate;
        this.Number_Of_Hourles = Number_Of_Hourles;
    }

    public double getHourle_rate() {
        return Hourle_rate;
    }

    public void setHourle_rate(double Hourle_rate) {
        this.Hourle_rate = Hourle_rate;
    }

    public int getNumber_Of_Hourles() {
        return Number_Of_Hourles;
    }

    public void setNumber_Of_Hourles(int Number_Of_Hourles) {
        this.Number_Of_Hourles = Number_Of_Hourles;
    }
    
    @Override
    public double Earning(){
    return Hourle_rate * Number_Of_Hourles;
    }
    
    public void DisplayAllDetails(){
        System.out.println(super.toString());
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "Hourle_rate=" + Hourle_rate + ", Number_Of_Hourles=" + Number_Of_Hourles + '}';
    }
    
    @Override
    public void DisplayEarning(){
        System.out.println(Earning());
    }
    
}
