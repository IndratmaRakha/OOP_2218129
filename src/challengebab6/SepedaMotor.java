/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challengebab6;

/**
 *
 * @author USER
 */
public class SepedaMotor extends Kendaraan {
     private String kapasitasMesin;

    public SepedaMotor(String merk, String model, String kapasitasMesin) {
        super(merk, model);
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    public void startEngine() {
        System.out.println(getMerk() + " " + getModel() + " - Mesin sepeda motor dinyalakan.");
    }

    @Override
    public void stopEngine() {
        System.out.println(getMerk() + " " + getModel() + " - Mesin sepeda motor dimatikan.");
    }

    @Override
    public void drive() {
        System.out.println(getMerk() + " " + getModel() + " - Sepeda motor sedang melaju.");
    }
}
