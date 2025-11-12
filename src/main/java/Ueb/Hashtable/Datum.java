package Ueb.Hashtable;

public class Datum {
    private int tag;
    private int monat;
    private int jahr;

    public Datum(int tag, int monat, int jahr) {
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }

    @Override
    public String toString() {
        return this.tag + "." + this.monat + "." + this.jahr + " ";
    }
}
