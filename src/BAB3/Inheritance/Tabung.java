/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3.Inheritance;

/**
 *
 * @author USER
 */
public class Tabung extends Lingkaran{
    
    int t;
    double volume, luasPermukaan;
    
    public Tabung(){
        t = 20;
    }
    void Keterangan(){
        Deskripsi();
        System.err.println("menghitung Volume Tabung");
    }
    double HitvolumeTabung(){
        volume = ((phi * r * r) * t);
        return volume;
    }
}
