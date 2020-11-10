/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastmove;

import base.Parcel;
import base.StreamingStat;

/**
 *
 * @author praisan
 */
public class ParcelStack {

    private Parcel[] parcels;
    private final double maxWeight;
    private int count;
    private StreamingStat weightStat;
    
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
}
