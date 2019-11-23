package by.htp.task10.main;

import java.util.ArrayList;

import by.htp.task10.entity.Airline;
import by.htp.task10.entity.Flight;
import by.htp.task10.logic.AirlineLogic;
import by.htp.task10.view.ViewAirline;

public class Main {
	
	public static void main(String[] args) {
		
		Airline airline1 = new Airline("Brest", 1, "passenger", 12, 30, "Monday");
		Airline airline2 = new Airline("Moscow", 2, "passenger", 10, 0, "Thursday,Saturday");
		Airline airline3 = new Airline("Vitebsk", 35, "cargo", 23, 45, "Friday");
		Airline airline4 = new Airline("Grodno", 7, "passenger", 9, 10, "Sunday");
		Airline airline5 = new Airline("Gomel", 36, "cargo", 13, 17, "Friday");
		
		Flight flight = new Flight();
		flight.getFlight().add(airline1);
		flight.getFlight().add(airline2);
		flight.getFlight().add(airline3);
		flight.getFlight().add(airline4);
		flight.getFlight().add(airline5);
		
		ViewAirline view = new ViewAirline();
		view.viewAirline(flight.getFlight());
		
		AirlineLogic logic = new AirlineLogic();
		
		// Поиск по пункту назначения
		String destination = view.enterDestination();
		ArrayList<Airline> searchDestination = logic.searchDestination(flight.getFlight(), destination);
		view.viewAirlineSearch(searchDestination);
		
		// Поиск по дню недели
		String weekday = view.enterWeekday();
		ArrayList<Airline> searchWeekday = logic.searchWeekday(flight.getFlight(), weekday);
		view.viewAirlineSearch(searchWeekday);
		
		// Поиск по дню недели и времени
		int hour = view.enterHour();
		int minute = view.enterMinute();
		ArrayList<Airline> searchWeekdayT = logic.searchWeekdayWithTime(searchWeekday, hour, minute);
		view.viewAirlineSearch(searchWeekdayT);
		
	}
	
}
