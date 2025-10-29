package Kap5_Vererbung;

import static pr.MakeItSimple.*;

public class Confusing {
    private int val;

    public Confusing(int val) {
        this.val = val;
    }

    public void print(Object o) {
        println("print (Object) " + this.val);
    }

    public void print(Confusing o) { //overloading
        println("print (Confusing) " + this.val * 2);

    }

    public static void main(String[] args) {
        Confusing co = new Confusing(7);
        co.print(co);
        co.print(new Object());
        co.print(null); //Methode wird aufgerufen, null-Object hat kein Typ, er übernimmt Confusing weil es spezifischer ist
    }

}

