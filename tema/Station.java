package tema;

public class Station extends Equipment {
    private int ipAddress;

    public int getIpAddress() {
        return ipAddress;
    }

    public Station(int delay, int ipAddress) {
        super(delay);
        this.ipAddress = ipAddress;
    }

    public Station() {
    }

    @Override
    public String toString() {
        return "Station" +
                " ipAddress = " + ipAddress;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(" Adresa ip a statiei este " + this.ipAddress);
    }
}
