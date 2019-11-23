package by.htp.task4.logic;

import java.util.List;
import by.htp.task4.entity.Train;

public class SortByStation {
	
	public List<Train> sortByStation (List<Train> trains) {
		int i = 0;
		while (i < trains.size()-1) {
			if (trains.get(i).getDestinationStation().compareTo(trains.get(i+1).getDestinationStation()) > 0) {
				Train tmp = trains.get(i+1);
				trains.set(i+1, trains.get(i));
				trains.set(i, tmp);
				i = 0;
			} else {
				i++;
			}
		}
		return trains;
	}
	
}
