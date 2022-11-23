package ch.fhnw.oop1.le.equals;

public class Point {
    private int x, y;
    public Point(int x, int y) { 
        this.x = x; 
        this.y = y; 
    }

    public boolean equals(Object that) {
        if(that instanceof Point) {
            Point p = (Point)that;
            return p.x == this.x && p.y == this.y;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Point p1 = new Point(2, 1);
        Point p2 = new Point(2, 1);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }
 }
 