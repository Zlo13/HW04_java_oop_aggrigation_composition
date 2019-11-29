package ru.htp.hw5.main;

import ru.htp.hw5.entity.Car;
import ru.htp.hw5.entity.Engine;
import ru.htp.hw5.entity.Wheel;
import ru.htp.hw5.logic.CarLogic;
import ru.htp.hw5.view.Print;

// 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, 
// менять колесо, вывести на консоль марку автомобиля. 

public class Main {

	public static void main(String[] args) {
		double x;

		Car car = new Car("Toyota",
				new Wheel[] { new Wheel("Dunlop", "FL", true), new Wheel("Dunlop", "FR", true),
						new Wheel("Toyo", "RL", true), new Wheel("Toyo", "RR", true) },
				new Engine(55.0, 5.0, 12.0, "V6"));

		Print print = new Print();

		print.printCar(car);

		CarLogic carLogic = new CarLogic();

		carLogic.refuelCar(car.getEngine(), 35.0); // заправил 35 литров

		print.printFuel(car);

		x = carLogic.driveCar(car, 450); // проехал 450 км.

		print.printDist(x);

		Wheel newWhell = new Wheel("BridgStone", "fr", true);

		carLogic.changeWheel(car, newWhell, "fr");
		print.printCar(car);

	}

}
