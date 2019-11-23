package by.htp.task1.main;

import by.htp.task1.entity.Test1;
import by.htp.task1.logic.Logic;
import by.htp.task1.view.View;

public class Main {

	public static void main(String[] args) {
		
		Test1 number = new Test1(5, 8);
		int a = number.getA();
		int b = number.getB();
		
		Logic logic = new Logic();
		int sum = logic.sumTest1(a, b);
		int biggerNumber = logic.biggerNumberTest1(a, b);
		
		View view = new View();
		view.viewTest1(sum);
		view.viewTest1(biggerNumber);
		
	}

}
