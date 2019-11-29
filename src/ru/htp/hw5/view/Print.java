package ru.htp.hw5.view;

import ru.htp.hw5.entity.Car;

public class Print {

	public void printFuel(Car car) {
		System.out.println(car.getEngine());
	}

	public void printDist(double x) {
		System.out.println("В баке осталось " + x + " л.");
	}

	public void printCar(Car car) {
		System.out.println(car);
	}

}
