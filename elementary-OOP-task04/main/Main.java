package by.htp.task4.main;

import by.htp.task4.entity.Depo;
import by.htp.task4.entity.Train;
import by.htp.task4.logic.SortByNumber;
import by.htp.task4.logic.SortByStation;
import by.htp.task4.view.EnterNumber;
import by.htp.task4.view.ViewByNumber;
import by.htp.task4.view.ViewDepo;

public class Main {

	public static void main(String[] args) {
		
		Train train1 = new Train("Minsk", 7, 10, 25);
		Train train2 = new Train("Brest", 1, 17, 40);
		Train train3 = new Train("Gomel", 3, 12, 35);
		Train train4 = new Train("Grodno", 4, 15, 10);
		Train train5 = new Train("Vitebsk", 2, 10, 5);
		Train train6 = new Train("Vitebsk", 22, 20, 15);
		
		Depo trains = new Depo();
		trains.getTrains().add(train1);
		trains.getTrains().add(train2);
		trains.getTrains().add(train3);
		trains.getTrains().add(train4);
		trains.getTrains().add(train5);
		trains.getTrains().add(train6);
		
		// Сортировка по номеру
		SortByNumber sort = new SortByNumber();
		trains.setTrains(sort.sortByNumber(trains.getTrains()));
		
		ViewDepo viewDepo = new ViewDepo();
		viewDepo.viewDepo(trains.getTrains());
		
		// Поиск по номеру поезда
		EnterNumber enterNumber = new EnterNumber();
		int number = enterNumber.enterByNumber();
		ViewByNumber viewByNumber = new ViewByNumber();
		viewByNumber.viewByNumber(trains.getTrains(), number);
		
		// Сортировка по станции
		SortByStation byStation = new SortByStation();
		trains.setTrains(byStation.sortByStation(trains.getTrains()));
		viewDepo.viewDepo(trains.getTrains());
		
	}

}
