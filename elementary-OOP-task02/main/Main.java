package by.htp.task2.main;

import by.htp.task2.entity.Test2;

public class Main {

	public static void main(String[] args) {
		
		Test2 number = new Test2(3, 4);
		
		// Я знаю, что для вывода нужен отдельный класс, просто задачка микроскопическая
		System.out.println("Точка А = "+number.getA());
		System.out.println("Точка B = "+number.getB());

	}

}
