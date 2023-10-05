public class Tablet extends Device{
    private String os;

    public Tablet(String type, double price, double weight, String os) {
        super(type, price, weight);
        this.os = os;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}

