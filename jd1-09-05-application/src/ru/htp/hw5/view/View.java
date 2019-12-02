package ru.htp.hw5.view;

import java.util.List;

import ru.htp.hw5.entity.Tour;
import ru.htp.hw5.entity.TravelAgency;

public class View {

	public void tourPrint(List<Tour> tour) {
		for (Tour x : tour)
			System.out.println(x);
	}

	public void tourSortDatePrint(TravelAgency travel) {
		System.out.println(travel);
	}

}
