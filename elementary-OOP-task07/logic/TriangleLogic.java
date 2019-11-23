package by.htp.task7.logic;

import by.htp.task7.entity.Points;
import by.htp.task7.entity.Triangle;

public class TriangleLogic {
	
	public double getSide(Points point1, Points point2) {
		double side = 0;
		double pointX1 = point1.getX();
		double pointY1 = point1.getY();
		double pointX2 = point2.getX();
		double pointY2 = point2.getY();
		side = Math.sqrt( Math.pow(( pointX1 - pointX2 ), 2) + Math.pow(( pointY1 - pointY2 ), 2) );
		return side;
	}
	
	public double getPerimeter(Triangle side1, Triangle side2, Triangle side3) {
		double perimeter = 0;
		perimeter = side1.getSideAB() + side2.getSideAC() + side3.getSideBC();
		return perimeter;
	}
	
	public double getArea(Triangle side1, Triangle side2, Triangle side3) {
		double area = 0;
		double a = side1.getSideAB();
		double b = side2.getSideAC();
		double c = side3.getSideBC();
		double p = (a + b + c) / 2;
		area = Math.sqrt( p*(p - a)*(p - b)*(p - c) );
		return area;
	}
	
	public Points getMedian(Points point1, Points point2, Points point3) {
		Points median = new Points();
		double n = 1;
		double m = 2;
		double medianX1 = point1.getX();
		double medianX2 = (point2.getX() + point3.getX()) / 2;
		double medianY1 = point1.getY();
		double medianY2 = (point2.getY() + point3.getY()) / 2;
		double medianX = (n*medianX1 + m*medianX2) / (m + n);
		double medianY = (n*medianY1 + m*medianY2) / (m + n);
		median.setX(medianX);
		median.setY(medianY);
		return median;
	}
	
}
