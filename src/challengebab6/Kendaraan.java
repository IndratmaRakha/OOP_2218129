/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challengebab6;

/**
 *
 * @author USER
 */
public abstract class Kendaraan {
    private String merk;
    private String model;

    public Kendaraan(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    // Abstract methods
    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void drive();
}