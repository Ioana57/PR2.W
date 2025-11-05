package Kap6_ObjectClass;

import static pr.MakeItSimple.*;

class Base {
    int val;

    public Base(int i) {
        this.val = i;
    }

    @Override
    public String toString(){
        return "val="+val;
    }

    @Override
    public Base clone(){
        return new Base(this.val); // Clone, weil man ein neues Object erstellt
    }

    @Override
    public boolean equals(Object o){
        if (o == null) return false;
        if (!(o instanceof Base)) return false;

        Base that = (Base)o;
        return this.val == that.val;
    }

    public void setval(int val){
        this.val = val;
    }
}

public class HashcodeExample{
    public static void main(String[] args){
        Base o1 = new Base(7);
        Base o2 = new Base(8);

        //println("HashCode von o1 = " + (Integer.toHexString(o1.hashCode())));
        //println("HashCode von o2 = " + o2.hashCode());

        //println("o1 = " + o1.toString());

        println("o1: " + o1);
        println("o2: " + o2);
        println("1: o1.equals(o2) = " + o1.equals(o2));
        println("1b: o1.equals(o2) = " + (o1 == o2) );

        o2 = o1;
        println("o2 = o1");
        println("o1: " + o1);
        println("o2: " + o2);
        println("2: o1.equals(o2) = " + o1.equals(o2));
        println("2b: o1.equals(o2) = " + (o1 == o2) );

        o2 = o1.clone();
        println("Clone:");
        println("o1: " + o1);
        println("o2: " + o2);
        println("3: o1.equals(o2) = " + o1.equals(o2));
        println("3b: o1.equals(o2) = " + (o1 == o2) );

        o1.setval(9);
        println("o1 val wird zu 9 gesetzt");
        println("o1: " + o1);
        println("o2: " + o2);
        println("4: o1.equals(o2) = " + o1.equals(o2));
        println("4b: o1.equals(o2) = " + (o1 == o2) );

    }
}
