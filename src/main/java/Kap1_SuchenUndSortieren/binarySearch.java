package Kap1_SuchenUndSortieren;

public class binarySearch {
    public final static int NO_KEY = -1;
    private int counter = 0;

    //rekursiv
    int search(int[] array, int key, int u, int o) {
        //Rekursionsabbruchkriterium
        if (o >u){
            return NO_KEY;

        } else if (array[(u+o)/2] == key){
            return (u+o)/2;

        //Rekursionsschritt
        } else if (array[(u+o)/2] > key){
            return search (array, key, u, ((u+o)/2)-1);
        } else {
            return search (array, key, ((u+o)/2)-1, o);
        }
    }

}
