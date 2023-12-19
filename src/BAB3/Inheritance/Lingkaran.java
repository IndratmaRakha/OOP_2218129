/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3.Inheritance;

/**
 *
 * @author USER
 */
public class Lingkaran {
    //atribut
    int r;
    double phi, luas;
    
    //constructor
    public Lingkaran(){
        r = 7;
        phi = 3.14;
    }
    //method
    void Deskripsi (){
        System.out.println("Ini adalah hasil menghitung");
    }
   // method untuk menghitung luas
     double HitluasLingkaran(){
         luas = (phi * r * r);
         return luas;
     }       
}
