package by.htp.task4.view;

import java.util.Scanner;

public class EnterNumber {
	
	public int enterByNumber() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер поезда: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите номер поезда: ");
        }
        int numberTrain = sc.nextInt();
        return numberTrain;
	}
	
}
