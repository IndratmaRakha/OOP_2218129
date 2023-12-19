/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikumBab1;

/**
 *
 * @author USER
 */
public class MainTugas1 {
    public static void main(String[] args) {
        // Membuat objek
        Tugas1 jenis1 = new Tugas1();
        Tugas1 jenis2= new Tugas1();

        // Mengisi data
        jenis1.setJenis("Kopi Sirup");
        jenis1.setRasa("Strawberry Latte");
        jenis1.setWarna("Merah");
        jenis1.setHarga(15000);
        jenis1.setJumlah(5);

        jenis2.setJenis("Kopi Bubuk");
        jenis2.setRasa("Vanilla");
        jenis2.setWarna("Hitam Putih");
        jenis2.setHarga(4000);
        jenis2.setJumlah(10);

        // Menampilkan informasi 
        System.out.println("Produk 1");
        System.out.println("Jenis: " + jenis1.getJenis());
        System.out.println("Rasa: " + jenis1.getRasa());
        System.out.println("Warna: " + jenis1.getWarna());
        System.out.println("Harga : " + jenis1.getHarga());
        System.out.println("Jumlah: " + jenis1.getJumlah());

        System.out.println("\nProduk 2");
        System.out.println("Jenis: " + jenis2.getJenis());
        System.out.println("Rasa: " + jenis2.getRasa());
        System.out.println("Warna: " + jenis2.getWarna());
        System.out.println("Harga: " + jenis2.getHarga());
        System.out.println("Stok: " + jenis2.getJumlah());
    }
}


