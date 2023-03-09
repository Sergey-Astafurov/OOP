package oop_homme.final_homm;

import java.util.Objects;

public class Innerapp {
    IInterface v;
    public Innerapp(IInterface v){
        this.v =  Objects.requireNonNullElseGet(v, Null::new);
    }

    void write() {
        v.print();
    }
}

