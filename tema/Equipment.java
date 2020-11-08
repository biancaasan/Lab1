package tema;

public class Equipment implements IEquipment {
    protected int delay;

    public Equipment(int delay) {
        this.delay = delay;
    }

    public Equipment() {
    }

    public void processPacket(IPacket P){
        P.updateTime(delay);
    }


    @Override
    public void printInfo() {
        System.out.println(" Delay-ul este " + this.delay);
    }
}
