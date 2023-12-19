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
public abstract class kendaraan {
    private String merek;
    
    public kendaraan(String merek){
        this.merek = merek;
    }
    public String getmerek(){
        return merek;
    }
    abstract void carabergerak();
    
    abstract void kecepatanMAX();
}
