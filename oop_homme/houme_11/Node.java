package oop_homme.houme_11;

import java.io.Serializable;

public class Node implements Serializable {
    People p1;
    Relationship r;
    People p2;

    public Node(People p1, Relationship r, People p2) {
        this.p1 = p1;
        this.r = r;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s \n", p1.getFirstName(), p1.getLasttName(), r, p2.getFirstName(), p2.getLasttName());
    }
}
