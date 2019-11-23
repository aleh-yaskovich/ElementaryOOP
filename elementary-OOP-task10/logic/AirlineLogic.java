package by.htp.task10.logic;

import java.util.ArrayList;
import java.util.Scanner;
import by.htp.task10.entity.Airline;

public class AirlineLogic {
	
	public ArrayList<Airline> searchDestination(ArrayList<Airline> flight, String destination) {
		ArrayList<Airline> searchDestination = new ArrayList<Airline>();
		for (int i = 0; i < flight.size(); i++) {
			if (flight.get(i).getDestination().equals(destination)) {
				searchDestination.add(flight.get(i));
			}
		}
		return searchDestination;
	}
	
	public ArrayList<Airline> searchWeekday(ArrayList<Airline> flight, String weekday) {
		ArrayList<Airline> searchWeekday = new ArrayList<Airline>();
		for (int i = 0; i < flight.size(); i++) {
			boolean res = false;
			char[] ch = flight.get(i).getWeekday().toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] == ',') {
					res = true;
				}
			}
			if (res) {
				String[] strArr = flight.get(i).getWeekday().split(",");
				for (int k = 0; k < strArr.length; k++) {
					if (strArr[k].equals(weekday)) {
						searchWeekday.add(flight.get(i));
					}
				}
			}
			if (flight.get(i).getWeekday().equals(weekday)) {
				searchWeekday.add(flight.get(i));
			}
		}
		return searchWeekday;
	}
	
	public ArrayList<Airline> searchWeekdayWithTime(ArrayList<Airline> arr, int hour, int minute) {
		ArrayList<Airline> searchWeekdayT = new ArrayList<Airline>();
		
		for (int i = 0; i < arr.size(); i++) {
			if (hour < arr.get(i).getHour()) {
				searchWeekdayT.add(arr.get(i));
			} else if (hour == arr.get(i).getHour()) {
				if (minute < arr.get(i).getMinute()) {
					searchWeekdayT.add(arr.get(i));
				}
			}
		}
		return searchWeekdayT;
	}

}
