package base;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praisan
 */
public class Bike {
    private String licensePlate;
    private int engineCapacity;

    public Bike(String licensePlate, int engineCapacity) {
        this.licensePlate = licensePlate;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Bike licensePlate:" + licensePlate + ", engine: " + engineCapacity + " CC";
    }
    
}
