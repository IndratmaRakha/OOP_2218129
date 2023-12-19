/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikumBab1;

/**
 *
 * @author USER
 */
public  class Tugas1 {
    private int harga;
    //atribut
    int jumlah;
    String jenis, warna, rasa;
    
    //method
        void setJenis(String jenis) {
        this.jenis = jenis;
    }

    void setRasa(String rasa) {
        this.rasa = rasa;
    }

    void setWarna(String warna) {
        this.warna = warna;
    }

    void setHarga(int harga) {
        this.harga = harga;
    }

    void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    // Membuat method getter untuk mengambil nilai atribut
    String getJenis() {
        return jenis;
    }

    String getRasa() {
        return rasa;
    }

    String getWarna() {
        return warna;
    }

    int getHarga() {
        return harga;
    }

    int getJumlah() {
        return jumlah;
    }
    
}


