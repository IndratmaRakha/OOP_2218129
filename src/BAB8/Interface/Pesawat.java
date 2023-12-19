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
public class Pesawat extends kendaraan implements Berjalan,Terbang{
    public Pesawat(String merek){
        super(merek);
    }
    @Override
    void carabergerak(){
        System.out.println("Pesawat bergerak dalam udara dengan menggunakan mesin - mesin yang memungkinkan untuk terbang.");
    }
    @Override
    void kecepatanMAX(){
        System.out.println("900 km/h");
    }
    @Override
    public void berjalan(){
        System.out.println("Pesawat "+ getmerek() + "Berjalan maju melalui roda yang bersentuhan langsung dengan permukaan tanah");
    }
    @Override
    public void terbang(){
        System.out.println("Pesawat "+ getmerek() + "mesin yang berkecepatan tinggi, baling2 dan sayap aerodinamic memungkinkannya pesawat untuk lepas landas, terbang ");
    }
}
