package ru.htp.hw5.logic;

import java.util.Comparator;

import ru.htp.hw5.entity.Tour;

public class TravelDateSort implements Comparator<Tour> {

	@Override
	public int compare(Tour o1, Tour o2) {

		return o1.getDate().compareTo(o2.getDate());
	}

}
