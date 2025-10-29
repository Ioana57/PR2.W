package Kap5_Vererbung;

public class Class000 {
    protected int a; // attribut visible in all subclasses

    Class000() { // mandatory parameterless constructor
        a=10;
        System.out.println("Constructor Class000");
    }
}
