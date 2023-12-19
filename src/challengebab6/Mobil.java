/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challengebab6;

/**
 *
 * @author USER
 */
public class Mobil extends Kendaraan {
     private String jenis;

    public Mobil(String merk, String model, String jenis) {
        super(merk, model);
        this.jenis = jenis;
    }

    @Override
    public void startEngine() {
        System.out.println(getMerk() + " " + getModel() + " - Mesin mobil dinyalakan.");
    }

    @Override
    public void stopEngine() {
        System.out.println(getMerk() + " " + getModel() + " - Mesin mobil dimatikan.");
    }

    @Override
    public void drive() {
        System.out.println(getMerk() + " " + getModel() + " - Mobil sedang melaju.");
    }
}
