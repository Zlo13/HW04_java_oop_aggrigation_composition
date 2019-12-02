package ru.htp.hw5.logic;

import java.util.ArrayList;
import java.util.List;

import ru.htp.hw5.entity.Food;
import ru.htp.hw5.entity.Tour;
import ru.htp.hw5.entity.Transport;
import ru.htp.hw5.entity.TravelAgency;

public class TravelAgencyLogic {

	public List<Tour> findeTourByTransporDaysFood(TravelAgency travelAgency, Transport transport, Food food, int days) {
		List<Tour> findTour = new ArrayList<>();
		List<Tour> tour = travelAgency.getTours();

		for (Tour x : tour) {
			for (int i = 0; i < x.getFood().length; i++) {

				if (x.getTransport().compareTo(transport) == 0 && x.getFood()[i].compareTo(food) == 0
						&& x.getDays() == days) {
					findTour.add(x);
				}
			}
		}
		return findTour;
	}
}
