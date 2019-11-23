package by.htp.task7.entity;

public class Triangle {
	
	private double sideAB;
	private double sideAC;
	private double sideBC;
	
	public Triangle() {
		this.sideAB = 0;
		this.sideAC = 0;
		this.sideBC = 0;
	}
	
	public Triangle(double sideAB, double sideAC, double sideBC) {
		this.sideAB = sideAB;
		this.sideAC = sideAC;
		this.sideBC = sideBC;
	}

	public double getSideAB() {
		return sideAB;
	}

	public void setSideAB(double sideAB) {
		this.sideAB = sideAB;
	}

	public double getSideAC() {
		return sideAC;
	}

	public void setSideAC(double sideAC) {
		this.sideAC = sideAC;
	}

	public double getSideBC() {
		return sideBC;
	}

	public void setSideBC(double sideBC) {
		this.sideBC = sideBC;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(sideAB);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sideAC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sideBC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(sideAB) != Double.doubleToLongBits(other.sideAB))
			return false;
		if (Double.doubleToLongBits(sideAC) != Double.doubleToLongBits(other.sideAC))
			return false;
		if (Double.doubleToLongBits(sideBC) != Double.doubleToLongBits(other.sideBC))
			return false;
		return true;
	}

	
	
}
