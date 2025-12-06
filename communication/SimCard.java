package communication;

public class SimCard {
    private int SimId;
    private String Number;

    public SimCard(int simId, String number) {
        SimId = simId;
        Number = number;
    }

    public int getSimId() {
        return SimId;
    }

    public String getNumber() {
        return Number;
    }
}
