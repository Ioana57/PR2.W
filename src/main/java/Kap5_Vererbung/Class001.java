package Kap5_Vererbung;

public class Class001 extends Class000 {
    int i, j;

    Class001(int i, int j) { // 1st constructor
        System.out.println("Constructor 1 Class001");
        this.i = i;
        this.j = j*a; // access to superclass attribute
    }

    Class001(int i) { // 2nd constructor
        this(i,i*i); // call 1st constructor
        System.out.println("Constructor 2 Class001");
    }

    void print() {
        System.out.println("i= " + i + " j= " + j);
    }
}
