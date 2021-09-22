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
public class CommissionEmployee extends Employee implements Displayable{
    double Cross_Sales;
    double Commission_rate;

    public CommissionEmployee() {
    }

    public CommissionEmployee(double Cross_Sales, double Commission_rate, String Name, int SSN, String Address, Gender Sex) {
        super(Name, SSN, Address, Sex);
        this.Cross_Sales = Cross_Sales;
        this.Commission_rate = Commission_rate;
    }

    public double getCross_Sales() {
        return Cross_Sales;
    }

    public void setCross_Sales(double Cross_Sales) {
        this.Cross_Sales = Cross_Sales;
    }

    public double getCommission_rate() {
        return Commission_rate;
    }

    public void setCommission_rate(double Commission_rate) {
        this.Commission_rate = Commission_rate;
    }
    
    @Override
    public double Earning(){
    return Cross_Sales * Commission_rate;
    }
    
    @Override
    public void DisplayAllDetails(){
        System.out.println(super.toString());
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" + "Cross_Sales=" + Cross_Sales + ", Commission_rate=" + Commission_rate + '}';
    }
     
    @Override
    public void DisplayEarning(){
        System.out.println(Earning());
    }
}
