

package communication;

public class Processor {
    private String model;
    private double frequency; 

    public Processor(String model, double frequency) {
        this.model = model;
        this.frequency = frequency;
    }

    public String getModel() {
        return model;
    }

    public double getFrequency() {
        return frequency;
    }
}
