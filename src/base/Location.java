package base;

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
