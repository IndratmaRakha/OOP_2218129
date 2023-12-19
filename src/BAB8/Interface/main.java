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
public class main {
    public static void main(String[]args ){
        Mobil mobil = new Mobil("Toyota");
        mobil.berjalan();
        mobil.carabergerak();
        mobil.kecepatanMAX();
        System.out.println("========================");
        Pesawat pesawat = new Pesawat("Boeing 737");
        pesawat.carabergerak();
        pesawat.kecepatanMAX();
        pesawat.berjalan();
        pesawat.terbang();
    }
}
