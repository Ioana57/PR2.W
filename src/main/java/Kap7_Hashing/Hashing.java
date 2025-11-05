package Kap7_Hashing;

class HashTable {
    int m; //Anzahl Elemente in der HashTable

    private String[] hashTable; // HashTable für die Monatsnamen

    HashTable() {  // HashTable hat default Größe
        hashTable = new String[10];
    }

    HashTable(int anz) {  // anz = Größe der HashTable
        hashTable = new String[anz];
    }

    public int hash (String month) {
        //Berechnet aus den ersten 3 Buchstaben den HashCode

        return 0;
    }

    public void put(String month){  // wird noch angepasst!!
        //TODO

    }

}

public class Hashing {
    public static void main(String[] args) {

    }
}
