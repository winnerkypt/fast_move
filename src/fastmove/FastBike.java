package fastmove;

import base.Bike;
import base.Parcel;
import base.Person;

public class FastBike {
    private Bike bike;
    private int maxParcels;
    private double maxLoad;
    private Person driver;
    private ParcelStack parcelStack; 

    public FastBike(Bike bike, int maxParcels, double maxLoad, Person driver) {
        this.bike=bike;
        this.maxLoad = maxLoad;
        this.driver = driver;
        parcelStack =new ParcelStack(maxParcels,maxLoad);
    }
    public boolean addParcel(Parcel parcel){
        return parcelStack.addParcel(parcel);
    }
    public Parcel getParcel(){
        return parcelStack.getParcel();
    }

    public Person getDriver() {
        return driver;
    }
    public ParcelStack getParcelStack() {
        return parcelStack;
    }

    @Override
    public String toString() {
        return "FastBike: " + "bike=" + bike.toString() + 
                "\n"+"max parcels=" + maxParcels + ", maxLoad=" + maxLoad + 
                "\n"+"driver=" + driver + 
                "\n"+"parcels=" + parcelStack ;
    }
    
}
