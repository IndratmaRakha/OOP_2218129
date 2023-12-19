/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB8.Interface;

/**
 *
 * @author Computer 8
 */
public class kredit {
    void cekKartuKredit(String norek,String input){
 if(norek.equals(input)){ 
    System.out.println("Pembayaran Kredit succes");
 }else{
     System.out.println("Pembayaran Gagal, kata sandi salah");
 }
 }
}
