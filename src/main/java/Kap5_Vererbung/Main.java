package Kap5_Vererbung;
import static pr.MakeItSimple.*;

public class Main {
    public static void main(String[] args) {
        Class001 c1 = new Class001(7); //call 2nd constructor
        c1.print();

        //println(c1.getClass());
        //println(c1.getClass().getName());

        Class000 c2 = c1;
        //println(c2.getClass().getName());

        Class001 c3 = new Class001(7);
        println("c1 == c3 " + (c1 == c3));
        println("c1 equals c3 " + (c1.equals(c3))); // kommt false, weil equals in Object definiert wird und macht nur
                                                    // das gleiche wie ==, equals sollte überschrieben werden
    }
}
