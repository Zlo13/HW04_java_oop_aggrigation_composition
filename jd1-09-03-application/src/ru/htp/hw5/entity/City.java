package ru.htp.hw5.entity;

public class City {

	private String name;
	private double citySquare;
	boolean center;
	boolean capitl;

	public City(String name, double citySquare, boolean center, boolean capitl) {
		super();
		this.name = name;
		this.citySquare = citySquare;
		this.center = center;
		this.capitl = capitl;
	}

	@Override
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCitySquare() {
		return citySquare;
	}

	public void setCitySquare(double citySquare) {
		this.citySquare = citySquare;
	}

	public boolean isCenter() {
		return center;
	}

	public void setCenter(boolean center) {
		this.center = center;
	}

	public boolean isCapitl() {
		return capitl;
	}

	public void setCapitl(boolean capitl) {
		this.capitl = capitl;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (capitl ? 1231 : 1237);
		result = prime * result + (center ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(citySquare);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		City other = (City) obj;
		if (capitl != other.capitl)
			return false;
		if (center != other.center)
			return false;
		if (Double.doubleToLongBits(citySquare) != Double.doubleToLongBits(other.citySquare))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
