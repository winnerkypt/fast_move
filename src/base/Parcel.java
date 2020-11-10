package base;

public class Parcel {
    private final double weight;
    private ParcelStatus status;
    private Location location;

    public Parcel(double weight, ParcelStatus status, Location location) {
        this.weight = weight;
        this.status = status;
        this.location = location;
    }

    public Parcel(double weight, ParcelStatus status) {
        this(weight,status, new Location(0,0));
    }

    public void setStatus(ParcelStatus status) {
        this.status = status;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getWeight() {
        return weight;
    }

    public ParcelStatus getStatus() {
        return status;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "weight=" + weight + "Kg, status=" + status + ", location=" + location;
    }


    
}
