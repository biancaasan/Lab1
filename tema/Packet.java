package tema;

public class Packet implements IPacket {
    private int initialTime;
    private int time;
    private int ipDest;
    private int ipSource;

    public Packet(int initialTime, int time, int ipDest, int ipSource) {
        this.initialTime = initialTime;
        this.time = time;
        this.ipDest = ipDest;
        this.ipSource = ipSource;
    }

    public int getInitialTime() {
        return initialTime;
    }

    public int getIpDest() {
        return ipDest;
    }

    public int getIpSource() {
        return ipSource;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Pachet-ul are ip-ul sursa:\n");
        builder.append(ipSource);
        builder.append('\n');
        builder.append("Pachet-ul are ip-ul destinatie:\n");
        builder.append(ipDest);
        builder.append('\n');

        return builder.toString();
    }

    @Override
    public void updateTime(int delay) {
        this.time = delay;
    }
}
