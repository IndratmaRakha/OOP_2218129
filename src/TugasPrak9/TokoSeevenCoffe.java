    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrak9;

import TugasPraktikunBab8.*;

/**
 *
 * @author USER
 */
public abstract class TokoSeevenCoffe {
    //atribut
    String jenis, rasa, nama, kode;
    double diskon;
    int jumlahbarang, hargabarang, modal, sisa;
    
    public TokoSeevenCoffe(){
    modal = 3500000;
    diskon = 0.1;
}
    //static
    //method
    abstract double keuntungan();
    int total(){
        return sisa = modal - (hargabarang * jumlahbarang);
            }
    
   int total(double diskon){
        sisa = (int) ((hargabarang * jumlahbarang) * diskon);
        return sisa; 
    }
    
}

    

