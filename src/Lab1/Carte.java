package Lab1;

public class Carte implements Comparable<Carte>{
    private String titlu;
    private String autor;
    private int anPublicatie;
    private int nrPagini;

    @Override
    public int compareTo(Carte o) {
       /* if(this.nrPagini < o.nrPagini)
            return -1;
        if(this.nrPagini > o.nrPagini)
            return 1;
        return 0;

    */
    return Integer.compare(this.nrPagini,o.nrPagini);
    }

    public Carte(String titlu, String autor, int anPublicatie, int nrPagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.anPublicatie = anPublicatie;
        this.nrPagini = nrPagini;
    }

    @Override
    public String toString() {
        return this.autor + " " + this.titlu + " " + "aparuta in anul " + this.anPublicatie;
    }
}
