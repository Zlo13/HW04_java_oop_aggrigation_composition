package ru.htp.hw5.entity;

import java.util.ArrayList;
import java.util.List;

public class District {

	private String nameDistrict;
	private List<City> citys;

	public District(String nameDistrict) {
		this.nameDistrict = nameDistrict;
		this.citys = new ArrayList<City>();
	}

	public District(String nameDistrict, List<City> citys) {
		this.nameDistrict = nameDistrict;
		this.citys = new ArrayList<City>();
	}

	@Override
	public String toString() {
		return nameDistrict + citys;
	}

	public String getNameDistrict() {
		return nameDistrict;
	}

	public void setNameDistrict(String nameDistrict) {
		this.nameDistrict = nameDistrict;
	}

	public List<City> getCitys() {
		return citys;
	}

	public void setCitys(List<City> citys) {
		this.citys = citys;
	}

	public void setCitys(City citys) {
		this.citys.add(citys);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((citys == null) ? 0 : citys.hashCode());
		result = prime * result + ((nameDistrict == null) ? 0 : nameDistrict.hashCode());
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
		District other = (District) obj;
		if (citys == null) {
			if (other.citys != null)
				return false;
		} else if (!citys.equals(other.citys))
			return false;
		if (nameDistrict == null) {
			if (other.nameDistrict != null)
				return false;
		} else if (!nameDistrict.equals(other.nameDistrict))
			return false;
		return true;
	}

}
