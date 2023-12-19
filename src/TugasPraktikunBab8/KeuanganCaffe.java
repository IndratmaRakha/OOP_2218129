/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikunBab8;

/**
 *
 * @author USER
 */
public class KeuanganCaffe extends TokoSeevenCoffe implements Worker{
    
     double  hargapokok, hargajual, tod;
     int modal;
     
     public KeuanganCaffe(){
         modal = 3000000;
         
     //dynamicpolimor
     }
     @Override
     public double keuntungan(){
         
         return tod = hargajual - hargapokok;
     }

    @Override
    public int tambahan(int tambah) {
        int tot;
        tot=gajisamping*tambah;
        return tot;
    }

    @Override
    public int tod(int gaji, int bonus) {
        int  tot;
        tot=gaji+bonus;
        return tot;
    }
}
