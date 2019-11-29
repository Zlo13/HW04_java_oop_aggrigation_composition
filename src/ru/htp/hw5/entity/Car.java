package ru.htp.hw5.entity;

import java.util.Arrays;

public class Car {

	private String carBrand;
	private Wheel[] wheel = new Wheel[4];
	private Engine engine;

	public Car(String carBrand, Wheel[] wheel, Engine engine) {
		this.carBrand = carBrand;
		this.wheel = wheel;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Марка автомобиля " + carBrand + ", тип двигателя " + engine + ", колеса " + Arrays.toString(wheel);
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public Wheel[] getWheel() {
		return wheel;
	}

	public void setWheel(Wheel[] wheel) {
		this.wheel = wheel;
	}

	public void setWheel(int index, Wheel wheel) {

		this.wheel[index] = wheel;

	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carBrand == null) ? 0 : carBrand.hashCode());
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + Arrays.hashCode(wheel);
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
		Car other = (Car) obj;
		if (carBrand == null) {
			if (other.carBrand != null)
				return false;
		} else if (!carBrand.equals(other.carBrand))
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (!Arrays.equals(wheel, other.wheel))
			return false;
		return true;
	}

}
