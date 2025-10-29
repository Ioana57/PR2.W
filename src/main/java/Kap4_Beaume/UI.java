package Kap4_Beaume;
import static pr.MakeItSimple.*;

public class UI {
    public static void main(String[] args) {
        BinaryTreeImpl bt = new BinaryTreeImpl();
        //String goOn = "y";

        /*while(goOn.equals("y")) {
            println("Wert eingeben: ");
            bt.insert(readInt());
            println("weitere Werte eingeben? (y/n)");
            goOn = readString();

        }*/

        bt.insert(5);
        bt.insert(3);
        bt.insert(7);
        bt.insert(2);
        bt.insert(4);
        bt.insert(6);
        bt.insert(8);

        bt.printPreorder();
    }
}
