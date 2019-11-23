package by.htp.task10.entity;

public class Airline {
	
	private String destination;
	private int flightNumber;
	private String airplaneType;
	private int hour;
	private int minute;
	private String weekday;
	
	public Airline () {
		this.destination = "Destination";
		this.flightNumber = 0;
		this.airplaneType = "AirplaneType";
		this.hour = 0;
		this.minute = 0;
		this.weekday = "";
	}
	
	public Airline (String destination, int flightNumber, String airplaneType, int hour, int minute, String weekday) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.airplaneType = airplaneType;
		this.hour = hour;
		this.minute = minute;
		this.weekday = weekday;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirplaneType() {
		return airplaneType;
	}

	public void setAirplaneType(String airplaneType) {
		this.airplaneType = airplaneType;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public String getWeekday() {
		return weekday;
	}

	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airplaneType == null) ? 0 : airplaneType.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flightNumber;
		result = prime * result + hour;
		result = prime * result + minute;
		result = prime * result + ((weekday == null) ? 0 : weekday.hashCode());
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
		Airline other = (Airline) obj;
		if (airplaneType == null) {
			if (other.airplaneType != null)
				return false;
		} else if (!airplaneType.equals(other.airplaneType))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNumber != other.flightNumber)
			return false;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		if (weekday == null) {
			if (other.weekday != null)
				return false;
		} else if (!weekday.equals(other.weekday))
			return false;
		return true;
	}
	
}
