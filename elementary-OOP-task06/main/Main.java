package by.htp.task6.main;

import by.htp.task6.entity.Time;
import by.htp.task6.logic.TimeLogic;
import by.htp.task6.logic.UserTimeLogic;
import by.htp.task6.view.ViewTime;

public class Main {

	public static void main(String[] args) {
		
		Time time = new Time();
		TimeLogic logic = new TimeLogic();
		time.setHour(20);
		time.setMinute(56);
		time.setSecund(12);
		
		ViewTime viewTime = new ViewTime();
		viewTime.viewTimeStart(time);
		
		int[] userTime = new int[3];
		userTime = viewTime.enterNum();
		
		
		int[] newTime = logic.NewTime(userTime, time);
		
		viewTime.viewTime(newTime);
	}

}
