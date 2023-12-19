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
public class Mobil extends kendaraan implements Berjalan{
    
    public Mobil(String merek){
        super(merek);
    }
    @Override
    void carabergerak(){
        System.out.println("Bergerak maju melalui roda yang langsung bersentuhan dengan permukaan tanah.");
    }
    @Override
    void kecepatanMAX(){
        System.out.println("500 km/h");
    }
    
    @Override
    public void berjalan(){
        System.out.println("Mobil "+ getmerek() + "Sedang berjalan dijalan raya");
    }
}
