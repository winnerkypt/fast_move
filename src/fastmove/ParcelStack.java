package fastmove;

import base.Parcel;
import base.StreamingStat;

public class ParcelStack {

    private Parcel[] parcels;
    private final double maxWeight;
    private StreamingStat weightStat;
    private int count;
    
    
    public ParcelStack(int size, double maxWeight) {
        this.parcels = new Parcel[size];
        this.maxWeight = maxWeight;
    }
    
    public boolean addParcel(Parcel parcel) {
        if (count < parcels.length && weightStat.getSum() + parcel.getWeight() <= this.maxWeight) {
            this.parcels[count++] = parcel;
            this.weightStat.setValue(parcel.getWeight());
            return true;
        } else {
            return false;
        }
    }
    
    public Parcel getParcel() {
        if (count >= 0) {
            return this.parcels[--count];
        } else {
            return null;
        }
    }
    
    public double getTotalWeight() {
        return weightStat.getSum();
    }
    
    public double getMean() {
        return weightStat.getMean();
    }
    
    public double getMax() {
        return weightStat.getMax();
    }
    
    public double getMin() {
        return weightStat.getMin();
    }

    @Override
    public String toString() {
        return "ParcelStack " + "maxWeight=" + maxWeight + ", count=" + count+
                "\n"+weightStat.toString();
    }
    
}
