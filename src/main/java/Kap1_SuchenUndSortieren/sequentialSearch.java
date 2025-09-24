package Kap1_SuchenUndSortieren;

import org.w3c.dom.ls.LSOutput;

import static pr.MakeItSimple.*;

public class sequentialSearch {
    public final static int NO_KEY = -1;
    private int counter = 0;

    int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            counter++;
            if (array[i] == key) {
                return i;
            }else {
                //counter++;
                if (array[i] > key) {
                    return NO_KEY;
                }
            }
        }
        return NO_KEY;
    }

    public static int searchStatic(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }else {
                if (array[i] > key) {
                    return NO_KEY;
                }
            }
        }
        return NO_KEY;
    }

    public static void main(String[] args) {
        int[] F = {2, 4, 5, 6, 7, 8, 9, 11};
        int key = 1;
        int counterAll = 0;

        //for (int i = 0; i < 12; i++) { //12 Suchdurchläufe, um die Anzahl der mittlere Vergleiche festzustellen
        System.out.print("search key =");
        key = readInt();

        sequentialSearch so = new sequentialSearch();
        so.search(F, key);
        counterAll +=so.counter;
        //System.out.println("search result: " + so.search(F, key) + "\n" + "counter = " + so.counter);
    //}
        //System.out.println("search result: "+ so.searchStatic(F, key) + "\n");
        //System.out.println("search result: "+ new sequentialSearch().search(F, key) + "\n");
        System.out.println("Gesamtanzahl der Vergleiche= " + counterAll);
        System.out.println("Durchschnitt der Vergleiche= " + counterAll/12);


    }

}
