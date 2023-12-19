/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB2PRAK;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[]args){
        //membuat objek 
        Kendaraan mobil = new Kendaraan();
        System.out.println("Nama Kendaraan : "+ mobil.nama);
        System.out.println("Warna Kendaraan : "+ mobil.warna);
        System.out.println("Pabrikan Kendaraan : "+ mobil.pabrikan);
        System.out.println("Kecepatan Maximal : "+ mobil.speed + "Km/Jam\n");
        System.out.println("Cara Kendaraan Bergerak");
        System.out.println("Saat Maju: ");
        mobil.kendaraanMaju();
        System.out.println("Saat Mundur : ");
        mobil.kendaraanMundur();
        System.out.println("Saat Berhenti : ");
        mobil.kendaraanBerhenti();
}
    
}
