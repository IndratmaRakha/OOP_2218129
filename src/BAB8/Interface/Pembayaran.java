/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB8.Interface;

/**
 *
 * @author Computer 8
 */
public abstract class Pembayaran {
    
    abstract double hitpembayaran(double bayar);
    abstract double cekKode(String input);
    abstract void tampilanmember();
    
    String member(G0001 member){
        return "Gold";
    }
    String member(P0001 member){
        return "Platinum";
    }
    String member(S0001 member){
        return "Silver";
    }
}

