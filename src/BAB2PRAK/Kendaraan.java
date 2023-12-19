/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB2PRAK;

/**
 *
 * @author USER
 */
public class Kendaraan{
    //atribut
    String nama, warna, pabrikan;
    int speed;
    
    //construktor berparameter
    public Kendaraan()
    {
        this.nama = "Vios";
        this.warna = "Pink";
        this.pabrikan = "Toyoti";
        this.speed = 500;
    }
    //method
    void kendaraanMaju()
    {
        System.out.println("Berjalan Maju");
    }
    void kendaraanMundur()
    {
        System.out.println("Berjalan Mundur");
    }
    void kendaraanBerhenti()
    {
        System.out.println("Kendaraan Berhenti");
    }
}