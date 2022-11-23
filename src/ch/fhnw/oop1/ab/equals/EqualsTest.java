package ch.fhnw.oop1.ab.equals;

import java.awt.Color;

public class EqualsTest {

	public static void main(String[] args) {
		Point p = new Point(2, 1);
		Point cp = new ColoredPoint(2, 1, Color.RED);
		System.out.println(p.equals(cp));
		System.out.println(cp.equals(p));
	}

}
