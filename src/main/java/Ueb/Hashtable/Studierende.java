package Ueb.Hashtable;

public class Studierende extends Person{
    private int maNr;
    private String studiengang;

    public Studierende(String vorname, String nachname, Anschrift anschrift, Datum geburtsdatum, int maNr, String studiengang) {
        super(vorname, nachname, anschrift, geburtsdatum);
        this.maNr = maNr;
        this.studiengang = studiengang;
    }

    public int getMaNr() {
        return maNr;
    }

    @Override
    public String toString(){
        // Person.super.toString() geht nicht, weil Klassenname soll nur vor statischen Methoden stehen und sonst nicht
        return super.toString() + "\n" + "Matrikelnummer: " + maNr + "\nStudiengang: " + studiengang;
    }

    @Override
    public int hashCode() {
        return maNr;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if(this.getClass() != o.getClass()) { // Objekte müssen von derselben Klasse sein
            return false;
        }

        Studierende that = (Studierende)o; // Type Cast notwendig, um auf Attribut maNr zugreifen zu können
        return this.maNr == that.maNr;
    }
}
