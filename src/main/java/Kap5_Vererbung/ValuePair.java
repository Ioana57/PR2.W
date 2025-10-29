package Kap5_Vererbung;

public class ValuePair extends SingleValue{
    protected int value2;

    public ValuePair(int value1,int value2) {
        super(value1);
        print();
        this.value2 = value2;
        print();
    }

    public void print(){ //overriding
        System.out.println("value = (" + value1 + "," + value2 + ")");
    }
}
