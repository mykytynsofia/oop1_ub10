package ch.fhnw.oop1.ab.equals;

public class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Point && ((Point)obj).x == x && ((Point)obj).y == y;
	}
}
