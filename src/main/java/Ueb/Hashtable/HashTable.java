package Ueb.Hashtable;

import static pr.MakeItSimple.*;

public class HashTable {
    private int anzahl;

    // Arrays getrennt, weil key und value unterschiedliche Typen haben
    private Studierende [] valueTable;
    private int [] keyTable;

    public HashTable(int anzahl) {
        valueTable = new Studierende[anzahl];
        keyTable = new int[anzahl];
        this.anzahl = anzahl;
    }

    //TODO: Kollisionsbehandlung muss noch ergänzt werden, Einträge werden einfach überschrieben
    public boolean put(int key, Studierende value) {
        // Freie Stelle zum Eintragen suchen
        // Einstieg
        int pos = key%this.anzahl;

        while(keyTable[pos] != 0) { // Platz ist frei
          pos = (pos+1)%anzahl;
        }

        keyTable[key % this.anzahl] = key;
        valueTable[key % this.anzahl] = value;
        return true; // auch noch zu ändern
    }

    public int getKey(int index) {
        return (keyTable[index]);
    }

    public Studierende getValue(int key) {
        return (valueTable[key%this.anzahl]);
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.anzahl; i++) {
            s += i +": " + keyTable[i] + " | " + valueTable[i] + "\n" ;
        }
        return s;
    }
}
