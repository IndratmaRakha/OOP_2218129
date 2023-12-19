/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikumBab3;

/**
 *
 * @author USER
 */

public class Strawberry extends TokoSeevenCoffe {
    private int harga;
    int min;
    public Strawberry (){
        rasa ="Stawberry";
        this.harga = 15000;
        min = 3;
    }
    void pesan(){
        if (min<3){
            pesananK();
        }else{
            pesananP();
        }
    }
    String pesananK(){
        return "Tambah Pesanan";
    }
    int pesananP(){
        int total;
            total=harga*jumlah;
            return total;
    }

 }

