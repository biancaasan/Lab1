package Lab1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Biblioteca {
    private ArrayList<Carte> carti;

    public Biblioteca() {
        carti = new ArrayList<Carte>();
    }

    public void addCarte(Carte carte){
        carti.add(carte);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Biblioteca contine:\n");

        for(Carte c:carti){
            builder.append(c.toString());
            builder.append('\n');
        }
        return builder.toString();
    }

    public void sort(){
        Collections.sort(carti);
    }
}
