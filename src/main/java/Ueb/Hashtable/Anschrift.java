package Ueb.Hashtable;

public class Anschrift {
    private String strasse;
    private int hausnummer;
    private int plz;
    private String ort;

    public Anschrift(String strasse, int hausnummer, int plz, String ort) {
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.ort = ort;
    }

    @Override
    public String toString() {
        return this.strasse + " " + this.hausnummer + ", " + this.plz + " " + this.ort;
    }
}
