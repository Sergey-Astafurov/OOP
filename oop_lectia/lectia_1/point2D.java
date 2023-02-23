package oop_lectia.lectia_1;
/**
 * Это точка в 2Д пространстве
 */

public class point2D {
    int x,y;
    /**
     * конструктор
     * @param valueX координата Х
     * @param valueY координата У
     */
    public point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }
    public point2D() {
        x = 0;
        y = 0;
    }
    public point2D(int value) {
        x = value;
        y = value;
    }
    public String getInfo(){
        return String.format("x: %d, y: %d", x,y);
    }
    public static double distance(point2D a, point2D b){
        return Math.sqrt(Math.pow(a.x - b.x,2) + Math.pow(a.y - b.y,2));
    }
    @Override
    public String toString() {
        return getInfo();
    }
}