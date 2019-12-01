package ru.htp.hw5.entity;

import java.util.ArrayList;
import java.util.List;

public class State {

	private String nameState;
	private List<Region> regions;
	private City city;

	public State(String nameState, List<Region> regions) {
		this.nameState = nameState;
		this.regions = new ArrayList<Region>();

	}

	public State(String nameState) {
		this.nameState = nameState;
		this.regions = new ArrayList<Region>();

	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return nameState + regions;
	}

	public String getNameState() {
		return nameState;
	}

	public void setNameState(String nameState) {
		this.nameState = nameState;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	public void setRegions(Region regions) {
		this.regions.add(regions);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameState == null) ? 0 : nameState.hashCode());
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
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
		State other = (State) obj;
		if (nameState == null) {
			if (other.nameState != null)
				return false;
		} else if (!nameState.equals(other.nameState))
			return false;
		if (regions == null) {
			if (other.regions != null)
				return false;
		} else if (!regions.equals(other.regions))
			return false;
		return true;
	}

}
