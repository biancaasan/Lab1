package tema;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Equipment e = new Equipment(5);
        e.printInfo();
        Station s = new Station(10,1882714858);
        s.printInfo();
        Station s1 = new Station(15, 123849234);
        s1.printInfo();
        ArrayList<Station> statii = new ArrayList<Station>();
        statii.add(s);
        statii.add(s1);
        Switch sw = new Switch(5,"Switch1",statii);
        System.out.println(sw);
    }
}
