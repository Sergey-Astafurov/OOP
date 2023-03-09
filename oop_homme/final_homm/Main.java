package oop_homme.final_homm;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        new Innerapp(null).write();
    }
}

class Innerapp {
    IInterface v;
    public Innerapp(IInterface v){
        this.v =  Objects.requireNonNullElseGet(v, Null::new);
    }

    void write() {
        v.print();
    }
}

interface IInterface {
    void print();
}

class Null implements IInterface{
    @Override
    public void print() {
        System.out.println("Null!");
    }
}