/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB8.Interface;

/**
 *
 * @author USER
 */
public class Payment extends purchase implements cash,kredit,emoney{
    double total, creditbalance, emoneybalance, cashbalance;
    public Payment(double setTotal){
        this.creditbalance = 1000000;
        this.emoneybalance = 500000;
        this.cashbalance = 150000;
        this.total = setTotal;
    }
    @Override
    void titlePurchase(int numberPurchase){
        
        System.out.println("Pembelian ke- " + numberPurchase);
    }
    
    @Override
    public double cashProses(){
        total = cashbalance-this.total;
        return total;
    }
}
