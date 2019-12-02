package ru.htp.hw5.entity;

import java.util.ArrayList;
import java.util.List;

public class TravelAgency {

	private String name;
	private List<Tour> tours;

	public TravelAgency(String name) {
		this.name = name;
		this.tours = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "     TravelAgency " + name + "\n" + tours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Tour> getTours() {
		return tours;
	}

	public void setTours(List<Tour> tours) {
		this.tours = tours;
	}

	public void setTours(Tour tours) {
		this.tours.add(tours);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((tours == null) ? 0 : tours.hashCode());
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
		TravelAgency other = (TravelAgency) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (tours == null) {
			if (other.tours != null)
				return false;
		} else if (!tours.equals(other.tours))
			return false;
		return true;
	}

}
