package tema;

public class EquipmentConnection extends Equipment{
    private String name;
    private int maxPorts;

    public EquipmentConnection(int delay, String name) {
        super(delay);
        this.name = name;
    }

    public EquipmentConnection(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMaxPorts() {
        return maxPorts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxPorts(int maxPorts) {
        this.maxPorts = maxPorts;
    }
}
