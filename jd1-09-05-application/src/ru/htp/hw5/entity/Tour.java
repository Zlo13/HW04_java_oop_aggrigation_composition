package ru.htp.hw5.entity;

import java.util.Arrays;

public class Tour {

	private String country;
	private String date;
	private int days;
	private Transport transport;
	private Food[] food;
	private TourType[] type;

	public Tour(String country, String date, int days, Transport transport, Food[] food, TourType[] type) {
		this.country = country;
		this.date = date;
		this.days = days;
		this.transport = transport;
		this.food = food;
		this.type = type;
	}

	@Override
	public String toString() {
		return " тур в " + country + " выезд " + date + " на " + days + " дней " + " транспорт " + transport
				+ " питание " + Arrays.toString(food) + " тип тура " + Arrays.toString(type) + "\n";
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public Food[] getFood() {
		return food;
	}

	public void setFood(Food[] food) {
		this.food = food;
	}

	public TourType[] getType() {
		return type;
	}

	public void setType(TourType[] type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + days;
		result = prime * result + Arrays.hashCode(food);
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + Arrays.hashCode(type);
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
		Tour other = (Tour) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (days != other.days)
			return false;
		if (!Arrays.equals(food, other.food))
			return false;
		if (transport != other.transport)
			return false;
		if (!Arrays.equals(type, other.type))
			return false;
		return true;
	}

}
