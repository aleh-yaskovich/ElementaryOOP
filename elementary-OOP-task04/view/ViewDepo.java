package by.htp.task4.view;

import java.util.List;
import by.htp.task4.entity.Train;

public class ViewDepo {
	public void viewDepo (List<Train> trains) {
		for (int i = 0; i < trains.size(); i++) {
			System.out.println("Номер поезда: " + trains.get(i).getNumberTrain());
			System.out.println("Конечная станция: " + trains.get(i).getDestinationStation());
			System.out.println("Время прибытия: " + trains.get(i).getDepartureHours()+"ч. "+trains.get(i).getDepartureMinutes()+"мин.\n");
		}
	}
	
}
