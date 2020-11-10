/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

/**
 *
 * @author praisan
 */
public class Location {
    private final double latitude,longitude;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double[] getLatitudeLongitude() {
        return new double[]{latitude,longitude};
    }
    
    @Override
    public String toString() {
        return "latitude=" + latitude + ", longitude=" + longitude;
    }
    
}
