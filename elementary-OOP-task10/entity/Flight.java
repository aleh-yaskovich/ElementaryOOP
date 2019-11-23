package by.htp.task10.entity;

import java.util.ArrayList;

public class Flight {
	
	private ArrayList<Airline> flight;
	
	public Flight() {
		this.flight = new ArrayList<Airline>();
	}

	public ArrayList<Airline> getFlight() {
		return flight;
	}

	public void setFlight(ArrayList<Airline> flight) {
		this.flight = flight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flight == null) ? 0 : flight.hashCode());
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
		Flight other = (Flight) obj;
		if (flight == null) {
			if (other.flight != null)
				return false;
		} else if (!flight.equals(other.flight))
			return false;
		return true;
	}
	
	
	
}
