package by.htp.task6.logic;

import by.htp.task6.entity.Time;

public class TimeLogic {
	
	public int[] NewTime (int[] userTime, Time time) {
		
		int toMinute = (time.getSecund() + userTime[2]) / 60;
		int secund = (time.getSecund() + userTime[2]) % 60;
		int toHour = (time.getMinute() + userTime[1] + toMinute) / 60;
		int minute = (time.getMinute() + userTime[1] + toMinute) % 60;
		int hour = time.getHour() + userTime[0] + toHour;
		
		if (secund < 0) {
			secund = 0;
		}
		if (minute < 0) {
			minute = 0;
		}
		if (hour < 0) {
			hour = 0;
		}
		
		int[] newTime = {hour, minute, secund};
		
		return newTime;
	}
	
}
