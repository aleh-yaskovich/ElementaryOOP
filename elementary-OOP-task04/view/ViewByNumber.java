package by.htp.task4.view;

import java.util.List;

import by.htp.task4.entity.Train;

public class ViewByNumber {
	
	public void viewByNumber(List<Train> trains, int number) {
		boolean res = false;
		int i;
		for (i = 0; i < trains.size(); i++) {
			if (number == trains.get(i).getNumberTrain()) {
				res = true;
				break;
			}
		}
		if (res) {
			System.out.println("Номер поезда: " + trains.get(i).getNumberTrain());
			System.out.println("Конечная станция: " + trains.get(i).getDestinationStation());
			System.out.println("Время прибытия: " + trains.get(i).getDepartureHours()+"ч. "+trains.get(i).getDepartureMinutes()+"мин.\n");
			
		} else {
			System.out.println("Поездов нет!\n");
		}
	}
	
}
