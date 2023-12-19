/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikumBab3;

/**
 *
 * @author USER
 */
public class RekeningTabungan extends Keuangan {
   private double sukuBunga;

    public RekeningTabungan(String nama, double saldo, double sukuBunga) {
        super(nama, saldo);
        this.sukuBunga = sukuBunga;
    }

    public void tambahBunga() {
        double bunga = saldo * (sukuBunga / 100);
        saldo += bunga;
    }
}
