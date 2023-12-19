/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challengebab6;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", "Avanza", "MPV");
        mobil.startEngine();
        mobil.drive();
        mobil.stopEngine();

        SepedaMotor motor = new SepedaMotor("Honda", "CBR150R", "150cc");
        motor.startEngine();
        motor.drive();
        motor.stopEngine();
    }
    
    
}
