package Kap5_Vererbung;

public class Basis {
    private int i;

    @Override
    public boolean equals (Object o){
        return this.i == ((Basis)o).i;
    }
}
