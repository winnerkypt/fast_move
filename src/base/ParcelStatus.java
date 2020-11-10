package base;

public enum ParcelStatus {
    READY_TO_SHIP,SHIPPING,DELIVERED;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
    
}
