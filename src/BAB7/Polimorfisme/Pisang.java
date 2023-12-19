/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7.Polimorfisme;

/**
 *
 * @author USER
 */
public class Pisang extends Buah{
    public Pisang (){
        this.nama = "Pisang";
    }
    //implementasi makanBuah() khusus untuk Pisang
    void makanBuah(){
        System.out.println(nama + " dimakan dengan di Kupas kuliat pisang sebelum dimakan");
    }
}
