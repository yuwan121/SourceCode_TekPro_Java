/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasus_1;

/**
 *
 * @author BlackStyle
 */
public class Commission extends Hourly{
    private double sum_sales;
    private double komisi_rate;
    
public Commission(String eName, String eAddress, String ePhone,String socSecNumber, double rate, double komisi_rate){
    super(eName,eAddress,ePhone,socSecNumber,rate);
    this.komisi_rate = komisi_rate;
}
    
public void AddSales(double totalSales){
    sum_sales += totalSales;
}

    @Override
    public double pay(){
        double payment = super.pay() + (komisi_rate*sum_sales);
        sum_sales = 0;
        return payment;
    }

    @Override
    public String toString()
    {
    String result = super.toString();
    result += "\nTotal Sales: " + sum_sales;
    return result;
    }
}