package ru.htp.hw5.main;

import java.util.Collections;

import ru.htp.hw5.entity.Food;
import ru.htp.hw5.entity.Tour;
import ru.htp.hw5.entity.TourType;
import ru.htp.hw5.entity.Transport;
import ru.htp.hw5.entity.TravelAgency;
import ru.htp.hw5.logic.TravelAgencyLogic;
import ru.htp.hw5.logic.TravelDateSort;
import ru.htp.hw5.view.View;

public class Main {

//	5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки 
//	различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. 
//	Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

	public static void main(String[] args) {

		TravelAgency tour = new TravelAgency("Фартуна");

		tour.setTours(new Tour("Испания", "14.09.2020", 14, Transport.AIR,
				new Food[] { Food.BREKFAST_DINER, Food.BREKFAST_LUNCH_DINER },
				new TourType[] { TourType.EXCURSION, TourType.SHOPPING }));

		tour.setTours(new Tour("Круиз по средиземному морю", "25.07.2020", 12, Transport.CRUISE_LINER,
				new Food[] { Food.ALL_ENCLUSIVE }, new TourType[] { TourType.CRUISE }));

		tour.setTours(new Tour("Фрязино МО", "22.12.2019", 7, Transport.BUS,
				new Food[] { Food.BREKFAST, Food.BREKFAST_DINER, Food.BREKFAST_LUNCH_DINER, Food.WITHOUT_MEALS },
				new TourType[] { TourType.TREATMENT }));

		TravelAgencyLogic logic = new TravelAgencyLogic();

		View print = new View();

		Collections.sort(tour.getTours(), new TravelDateSort());
		print.tourSortDatePrint(tour);

		print.tourPrint(logic.findeTourByTransporDaysFood(tour, Transport.AIR, Food.BREKFAST_LUNCH_DINER, 14));

	}

}
