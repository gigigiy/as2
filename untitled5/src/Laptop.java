public class Laptop extends Device{
    private int ram;
    private int storage;

    public Laptop(String type, double price, double weight, int ram, int storage) {
        super(type, price, weight);
        this.ram = ram;
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}

