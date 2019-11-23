package by.htp.task10.view;

import java.util.ArrayList;
import java.util.Scanner;

import by.htp.task10.entity.Airline;

public class ViewAirline {
	
	public String enterDestination() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите пункт назначения: ");
        String destination = sc.next();
        return destination;
	}
	
	public String enterWeekday() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите день недели: ");
        String weekday = sc.next();
        return weekday;
	}
	
	public int enterHour() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 0 до 23: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите число от 0 до 23: ");
        }
        int hour = sc.nextInt();
        while (hour < 0 || hour > 23) {
        	System.out.print("Введите число от 0 до 23: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("Введите число от 0 до 23: ");
            }
            hour = sc.nextInt();
        }
        return hour;
	}
	
	public int enterMinute() {
		Scanner sc = new Scanner(System.in);
        System.out.print("\nВведите число от 0 до 59: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите число от 0 до 59: ");
        }
        int minute = sc.nextInt();
        while (minute < 0 || minute > 59) {
        	System.out.print("Введите число от 0 до 59: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("Введите число от 0 до 59: ");
            }
            minute = sc.nextInt();
        }
        return minute;
	}
	
	public void viewAirline(ArrayList<Airline> flight) {
		for (int i = 0; i < flight.size(); i++) {
			System.out.println("\nНомер рейса: " + flight.get(i).getFlightNumber());
			System.out.println("Пункт назначения: " + flight.get(i).getDestination());
			System.out.println("Тип самолета: " + flight.get(i).getAirplaneType());
			System.out.println("Время вылета: "+ flight.get(i).getHour() +"ч. "+ flight.get(i).getMinute() +"мин.");
			System.out.println("День вылета: " + flight.get(i).getWeekday());
		}
	}
	
	public void viewAirlineSearch (ArrayList<Airline> arr) {
		if (arr.size() > 0) {
			for (int i = 0; i < arr.size(); i++) {
				System.out.println("\nНомер рейса: " + arr.get(i).getFlightNumber());
				System.out.println("Пункт назначения: " + arr.get(i).getDestination());
				System.out.println("Тип самолета: " + arr.get(i).getAirplaneType());
				System.out.println("Время вылета: "+ arr.get(i).getHour() +"ч. "+ arr.get(i).getMinute() +"мин.");
				System.out.println("День вылета: " + arr.get(i).getWeekday());
			}
		} else {
			System.out.println("Рейсoв нет!");
		}
	}
	
	
	
}
