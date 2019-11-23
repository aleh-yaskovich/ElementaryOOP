package by.htp.task7.main;

import by.htp.task7.entity.Points;
import by.htp.task7.entity.Triangle;
import by.htp.task7.logic.TriangleLogic;
import by.htp.task7.view.ViewTriangle;

public class Main {

	public static void main(String[] args) {
		
		Points pointA = new Points(2, 3);  
		Points pointB = new Points(5, 6); 
		Points pointC = new Points(-3, -4); 
		
		Triangle sideAB = new Triangle();
		Triangle sideAC = new Triangle();
		Triangle sideBC = new Triangle();
		
		TriangleLogic logic = new TriangleLogic();
		sideAB.setSideAB(logic.getSide(pointA, pointB));
		sideAC.setSideAC(logic.getSide(pointA, pointC));
		sideBC.setSideBC(logic.getSide(pointB, pointC));
		
		double perimeter = logic.getPerimeter(sideAB, sideAC, sideBC);
		double area = logic.getArea(sideAB, sideAC, sideBC);
		Points median = logic.getMedian(pointA, pointB, pointC);
		
		ViewTriangle view = new ViewTriangle();
		view.viewPerimeter(perimeter);
		view.viewArea(area);
		view.viewMedian(median);
		
	}

}
