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
public class BasePlusCommissionEmployee extends CommissionEmployee{
    double Base;

    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }
    
    @Override
    public double Earning(){
        return super.Earning() + Base;
    }
    
    @Override
    public void DisplayAllDetails(){
        super.DisplayAllDetails();
        DisplayEarning();
    }
    
    @Override
    public void DisplayEarning(){
        System.out.println("Earning = " + Earning());
    }
}
