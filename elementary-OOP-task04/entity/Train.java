package by.htp.task4.entity;

public class Train {
	
	private String destinationStation;
	private int numberTrain;
	private int departureHours;
	private int departureMinutes;
	
	public Train() {
		this.destinationStation = "station";
		this.numberTrain = 0;
		this.departureHours = 0;
		this.departureMinutes = 0;
	}
	
	public Train(String destinationStation, int numberTrain, int departureHours, int departureMinutes) {
		this.destinationStation = destinationStation;
		this.numberTrain = numberTrain;
		this.departureHours = departureHours;
		this.departureMinutes = departureMinutes;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public int getNumberTrain() {
		return numberTrain;
	}

	public void setNumberTrain(int numberTrain) {
		this.numberTrain = numberTrain;
	}

	public int getDepartureHours() {
		return departureHours;
	}

	public void setDepartureHours(int departureHours) {
		this.departureHours = departureHours;
	}

	public int getDepartureMinutes() {
		return departureMinutes;
	}

	public void setDepartureMinutes(int departureMinutes) {
		this.departureMinutes = departureMinutes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + departureHours;
		result = prime * result + departureMinutes;
		result = prime * result + ((destinationStation == null) ? 0 : destinationStation.hashCode());
		result = prime * result + numberTrain;
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
		Train other = (Train) obj;
		if (departureHours != other.departureHours)
			return false;
		if (departureMinutes != other.departureMinutes)
			return false;
		if (destinationStation == null) {
			if (other.destinationStation != null)
				return false;
		} else if (!destinationStation.equals(other.destinationStation))
			return false;
		if (numberTrain != other.numberTrain)
			return false;
		return true;
	}
	
	
	
}
