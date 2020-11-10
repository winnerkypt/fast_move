package base;

public class StreamingStat {
    String name;
    private double sum, max, min, lastValue;
    private int n;

    public StreamingStat(String name) {
        this.name=name;
        this.sum=0;
        this.max = 0;
        this.min = Double.POSITIVE_INFINITY;
        this.lastValue = 0;
        this.n = 0;
    }

    public void setValue(double num) {
        this.lastValue = num;
        this.n++;
        updateSum();
        updateMax();
        updateMin();
    }
    private void updateSum() {
        this.sum+=lastValue;
    }

    private void updateMax() {
        if (this.max < this.lastValue) {
            this.max = this.lastValue;
        }
    }

    private void updateMin() {
        if (this.min > this.lastValue) {
            this.min = this.lastValue;
        }
    }

    public double getSum() {
        return sum;
    }

    public double getMean() {
        return this.sum/this.n;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public double getCurrentValue() {
        return lastValue;
    }

    public int getN() {
        return n;
    }

    @Override
    public String toString() {
        return "statistic{" + "name=" + name + ", mean=" + this.getMean() + ", max=" + max + ", min=" + min + ", lastValue=" + lastValue + ", n=" + n + '}';
    }
}
