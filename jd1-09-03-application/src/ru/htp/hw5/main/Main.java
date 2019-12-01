package ru.htp.hw5.main;

import ru.htp.hw5.entity.City;
import ru.htp.hw5.entity.District;
import ru.htp.hw5.entity.Region;
import ru.htp.hw5.entity.State;
import ru.htp.hw5.logic.ContryLogic;
import ru.htp.hw5.view.Print;

public class Main {

//	3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: 
//  вывести на консоль столицу, количество областей, площадь, областные центры. 

	public static void main(String[] args) {

		State state = new State("ГОСУДАРСТВО");

		Region region1 = new Region("Область 1");
		Region region2 = new Region("Область 2");

		District district1 = new District("Район 1");
		District district2 = new District("Район 2");
		District district3 = new District("Район 3");
		District district4 = new District("Район 4");

		City city1 = new City("Город 1", 2500000, true, true);
		City city2 = new City("Город 2", 350000, false, false);
		City city3 = new City("Город 3", 150000, false, false);
		City city4 = new City("Город 4", 200000, false, false);
		City city5 = new City("Город 5", 235000, true, false);
		City city6 = new City("Город 6", 146000, false, false);
		City city7 = new City("Город 7", 261000, false, false);
		City city8 = new City("Город 8", 125300, false, false);

		district1.setCitys(city1);
		district1.setCitys(city2);

		district2.setCitys(city3);
		district2.setCitys(city4);

		district3.setCitys(city5);
		district3.setCitys(city6);

		district4.setCitys(city7);
		district4.setCitys(city8);

		region1.setDistricts(district1);
		region1.setDistricts(district2);

		region2.setDistricts(district3);
		region2.setDistricts(district4);

		state.setRegions(region1);
		state.setRegions(region2);

		Print print = new Print();

		ContryLogic contryLogic = new ContryLogic();

		contryLogic.findeSquareCitysDistr(district1);
		contryLogic.findeSquareCitysDistr(district2);
		contryLogic.findeSquareCitysDistr(district3);
		contryLogic.findeSquareCitysDistr(district4);
		contryLogic.findeSquareCitysRegion(region1);
		contryLogic.findeSquareCitysRegion(region2);
		contryLogic.findeSquareCitysState(state);

		print.printStateName(state, contryLogic, contryLogic);

		contryLogic.numberRegions(state);

		print.printCityCentr(district1, contryLogic);
		print.printCityCentr(district2, contryLogic);
		print.printCityCentr(district3, contryLogic);
		print.printCityCentr(district4, contryLogic);

	}

}
