/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4.Enkapsulasi;

/**
 *
 * @author USER
 */
public class pembayaranGaji {
    private String nomerRekening;
    private String input;
    private double saldo;
    public pembayaranGaji(){
        this.nomerRekening = "G12345";
        this.saldo = 1000000;
    }
    public String getNomorRekening(){
        return nomerRekening;
    }
    public void setNomorRekening(String nomorRekening){
        this.nomerRekening = nomorRekening;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double Saldo){
        this.saldo = saldo;
    }
    public String getInput(){
        return input;
    }
    public void setInput(String input){
        this.input = input;
    }
    public double cekSaldo(){
        if (getNomorRekening().equals(getInput())){
            return getSaldo();
        }else{
            return 0;
        }
   }
}
    