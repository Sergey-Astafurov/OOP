package oop_lectia.lectia_1;

public class program {


    public static void main(String[] args) {
        point2D a = new point2D(0, 2);
        point2D b = new point2D();
        var dis =  point2D.distance(a, b);
        System.out.println(dis);



    }
}
