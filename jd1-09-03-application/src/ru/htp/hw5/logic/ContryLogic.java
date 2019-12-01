package ru.htp.hw5.logic;

import ru.htp.hw5.entity.City;
import ru.htp.hw5.entity.District;
import ru.htp.hw5.entity.Region;
import ru.htp.hw5.entity.State;

public class ContryLogic {

	public double findeSquareCitysDistr(District district) {
		double sum = 0;
		for (City x : district.getCitys()) {
			sum = sum + x.getCitySquare();
		}
		return sum;
	}

	public double findeSquareCitysRegion(Region region) {
		double sum = 0;
		for (District x : region.getDistricts()) {
			sum = sum + findeSquareCitysDistr(x);
		}
		return sum;
	}

	public double findeSquareCitysState(State state) {
		double sum = 0;
		for (Region x : state.getRegions()) {
			sum = sum + findeSquareCitysRegion(x);
		}
		return sum;
	}

	public int numberRegions(State state) {
		int counter = 0;

		for (@SuppressWarnings("unused")
		Region x : state.getRegions()) {
			counter++;
		}
		return counter;
	}

	public String findeCityCentr(District district) {
		String z = null;
		for (City x : district.getCitys()) {
			if (x.isCenter() == true) {
				z = x.getName();
			}
		}
		return z;

	}

}
