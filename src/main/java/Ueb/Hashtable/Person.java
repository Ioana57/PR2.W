package Ueb.Hashtable;

import java.util.Date;

public class Person {
    private String vorname;
    private String nachname;
    private Anschrift anschrift;
    private Datum geburtsdatum;

    public Person(String vorname, String nachname, Anschrift anschrift, Datum geburtsdatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.anschrift = anschrift;
        this.geburtsdatum = geburtsdatum;
    }

    @Override
    public String toString() {
        return "Name: " + this.vorname + " " + this.nachname + "\n" + "Geburtsdatum: " +
                this.geburtsdatum.toString() + "\n" + "Adresse: " + this.anschrift.toString() ;
    }
}
