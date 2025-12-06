
package communication;

public class MobilePhone {
    private String brand;
    private String model;
    private float ScreenSize;
    private String Os;
    private int CamReso;
    private Processor processor;
    private Ram ram;
    private SimCard simCard;
    
    public MobilePhone(int c,int f, double fr, String m, String brand, String model, float ScreenSize, String Os, int CamReso,SimCard simCard) {
        this.brand = brand;
        this.model = model;
        this.ScreenSize = ScreenSize;
        this.Os = Os;
        this.CamReso = CamReso;
        this.processor = new Processor(m , fr);
        this.ram = new Ram(c, f);
        this.simCard = simCard;
    }

    public MobilePhone(String string, String string2, float f, String string3, int i, Processor processor2, Ram ram2,
            SimCard simCard2) {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(float screenSize) {
        this.ScreenSize = screenSize;
    }

    public String getOs() {
        return Os;
    }

    public void setOs(String os) {
        this.Os = os;
    }

    public int getCamReso() {
        return CamReso;
    }

    public void setCamReso(int camReso) {
        this.CamReso = camReso;
    }

    
    public String Display() {
        return "MobilePhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ScreenSize=" + ScreenSize +
                ", Os='" + Os + '\'' +
                ", CamReso=" + CamReso +
                '}';
    }
    
    public double getPerformance() {
        return processor.getFrequency() * ram.getCapacity();
    }
    
    public Processor getProcessor() {
        return processor;
    }
    
    public Ram getRam() {
        return ram;
    }
    
    public SimCard getSimCard() {
        return simCard;
    }
    public MobilePhone compareTo(MobilePhone other) {
        if (this.getCamReso() >= other.getCamReso()) {
            return this;
        } else {
            return other;
        }
    }
}
