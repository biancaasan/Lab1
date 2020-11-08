package tema;

public class Router extends EquipmentConnection{
    public int totalBytes;

    public Router(int delay, String name, int totalBytes) {
        super(delay, name);
        this.totalBytes = totalBytes;
    }

    public Router(String name, int totalBytes) {
        super(name);
        this.totalBytes = totalBytes;
    }

    public int getTotalBytes() {
        return totalBytes;
    }

    public void setTotalBytes(int totalBytes) {
        this.totalBytes = totalBytes;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Numarul total de bytes este " + this.totalBytes);
    }
}
