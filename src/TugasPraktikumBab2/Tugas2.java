/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikumBab2;

import TugasPraktikumBab1.Tugas1;

/**
 *
 * @author USER
 */
public class Tugas2 extends Tugas1{
    private int jumlah;
    public String jenis;
    public String warna;
    public String rasa;
    public int harga;
    
    
    //konstruktor  berparameter
    public Tugas2(String jenis, String warna, String rasa, int harga, int jumlah){
        this.jenis = jenis;
        this.warna = warna;
        this.rasa = rasa;
        this.harga = harga;
        this.jumlah = jumlah;
      
    }
}
