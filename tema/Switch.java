package tema;

import java.util.ArrayList;

public class Switch extends EquipmentConnection {
    private ArrayList<Station> statii;
    private Router linkRouter;

    public void addStation(Station C){
        statii.add(C);
    }

    public Station getStation(){
        return this.getStation();
    }

    public Switch(int delay, String name, ArrayList<Station> statii, Router linkRouter) {
        super(delay, name);
        this.statii = statii;
        this.linkRouter = linkRouter;
    }

    public Switch(String name, ArrayList<Station> statii, Router linkRouter) {
        super(name);
        this.statii = statii;
        this.linkRouter = linkRouter;
    }

    public void linkToRouter(Router R){
        this.linkRouter = R;
    }

    public Switch(int delay, String name, ArrayList<Station> statii) {
        super(delay, name);
        this.statii = statii;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Switch-ul are conectate statiile:\n");

        for(Station s:statii){
            builder.append(s.toString());
            builder.append('\n');
        }
        return builder.toString();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        this.toString();
    }
}
