package by.htp.task6.entity;

public class Time {
	
	private int hour;
	private int minute;
	private int secund;
	
	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.secund = 0;
	}
	
	public Time(int hour, int minute, int secund) {
		if (hour > 0 && hour <= 24) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}
		if (minute > 0 && minute <= 60) {
			this.minute = minute;
		} else {
			this.minute = 0;
		}
		if (secund > 0 && secund <= 60) {
			this.secund = secund;
		} else {
			this.secund = 0;
		}		
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour > 0 && hour <= 24) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute > 0 && minute <= 60) {
			this.minute = minute;
		} else {
			this.minute = 0;
		}
	}

	public int getSecund() {
		return secund;
	}

	public void setSecund(int secund) {
		if (secund > 0 && secund <= 60) {
			this.secund = secund;
		} else {
			this.secund = 0;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
		result = prime * result + secund;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		if (secund != other.secund)
			return false;
		return true;
	}
	
}
