package Ueb.Hashtable;

import static pr.MakeItSimple.*;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Ana", "Muster", new Anschrift("Mannheimer Str.",
                80, 68535, "Edingen"), new Datum(5,7,2000));
        Studierende s1 = new Studierende("Ioana", "Purdila", new Anschrift("Mannheimer Str.",
                80, 68535, "Edingen"), new Datum(5,7,2000), 3015825, "IB");
        Studierende s2 = new Studierende("Ioana", "Purdila", new Anschrift("Mannheimer Str.",
                80, 68535, "Edingen"), new Datum(5,7,2000), 3015824, "IB");
        Studierende s3 = new Studierende("Yovu", "Pis", new Anschrift("Mannheimer Str.",
                50, 68535, "Edingen"), new Datum(5,7,2000), 1000005, "IB");

        //println("Personen:");
        //println(p);
        //println();
        //println(s1);
        /*println("HashCodes: ");
        println(s1.hashCode() + ", " + s2.hashCode());
        println("Equals: ");
        println(s1.equals(s2));
        println(s2.equals(s1));
        println(s1.equals(s1));*/

        HashTable studierende = new HashTable(10);
        studierende.put(s1.hashCode(), s1);
        studierende.put(s2.hashCode(), s2);
        studierende.put(s3.hashCode(), s3); // Kollision, landet auf die Stelle, wo ein anderer drin war
        println(studierende);

        println(studierende.getValue(s1.hashCode()));
        println();
        println(studierende.getKey(4));
    }
}
