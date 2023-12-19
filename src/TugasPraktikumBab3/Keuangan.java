/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikumBab3;

/**
 *
 * @author USER
 */
public class Keuangan {
    protected String nama;
    protected double saldo;

    public Keuangan(String nama, double saldo) {
        this.nama = nama;
        this.saldo = saldo;
    }

    public void setor(double jumlah) {
        saldo += jumlah;
    }

    public void tarik(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo tidak mencukupi.");
        }
    }

    public double cekSaldo() {
        return saldo;
    }
}


