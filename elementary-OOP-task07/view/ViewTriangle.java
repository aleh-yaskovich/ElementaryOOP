package by.htp.task7.view;

import by.htp.task7.entity.Points;

public class ViewTriangle {
	
	public void viewPerimeter (double p) {
		System.out.println("Периметр треугольника равен: " + p);
	}
	
	public void viewArea (double a) {
		System.out.println("Площадь треугольника равна: " + a);
	}
	
	public void viewMedian (Points m) {
		System.out.println("Точка пересечения меридиан - M("+m.getX()+"; "+m.getY()+")");
	}
	
}
