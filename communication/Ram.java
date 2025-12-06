package communication;

public class Ram {
    private int capacity; // in GB
    private double frequency; // in GHz

    public Ram(int capacity, double frequency) {
        this.capacity = capacity;
        this.frequency = frequency;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getFrequency() {
        return frequency;
    }

}