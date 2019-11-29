package ru.htp.hw5.logic;

import ru.htp.hw5.entity.Car;
import ru.htp.hw5.entity.Engine;
import ru.htp.hw5.entity.Wheel;

//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, 
//менять колесо, вывести на консоль марку автомобиля. 

public class CarLogic {

	public void refuelCar(Engine engine, double volume) {

		double currentLevel;

		currentLevel = engine.getAmountOfFuelInTank();

		if (currentLevel + volume > engine.getFuelTankCapacity()) {
			System.out.println("Топливный бак переполнен");
		} else {
			engine.setAmountOfFuelInTank(currentLevel + volume);
		}
	}

	public double driveCar(Car car, int distance) {

		double driveDistance = 0;

		if (car.getEngine().getAmountOfFuelInTank() * car.getEngine().getConsumptionPer100() >= distance) {

			driveDistance = car.getEngine().getAmountOfFuelInTank() - distance / car.getEngine().getConsumptionPer100();
			// System.out.println(driveDistance);
			return driveDistance;

		} else {
			// System.out.println("Закончилось топливо");
			return driveDistance;
		}

	}

	public int findWheel(Car car, String position) {

		int i;

		for (i = 0; i < 4; i++) {
			Wheel x = car.getWheel()[i];
			if (x.getPosition().equalsIgnoreCase(position)) {
				// System.out.println(car.getWheel()[i]);
				return i;
			}
		}
		System.out.println("нет такого колеса");
		return 5;
	}

	public void changeWheel(Car car, Wheel newWheel, String position) {

		int i;

		i = findWheel(car, position);

		if (i != 5) {
			newWheel.setPosition(position);
			car.setWheel(i, newWheel);

		}

	}

}
