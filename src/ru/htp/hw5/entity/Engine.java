package ru.htp.hw5.entity;

public class Engine {

	private double fuelTankCapacity; // объем топливного бака
	private double amountOfFuelInTank; // количество топлива в баке
	private double consumptionPer100; // расход топлива на 100 км.
	private String typeEngene; // тип двигателя

	public Engine(Double fuelTankCapacity, Double amountOfFuelInTank, Double consumptionPer100, String typeEngene) {
		this.fuelTankCapacity = fuelTankCapacity;
		this.amountOfFuelInTank = amountOfFuelInTank;
		this.consumptionPer100 = consumptionPer100;
		this.typeEngene = typeEngene;
	}

	@Override
	public String toString() {
		return typeEngene + " " + amountOfFuelInTank;
	}

	public double getFuelTankCapacity() {
		return fuelTankCapacity;
	}

	public void setFuelTankCapacity(double fuelTankCapacity) {
		this.fuelTankCapacity = fuelTankCapacity;
	}

	public double getAmountOfFuelInTank() {
		return amountOfFuelInTank;
	}

	public void setAmountOfFuelInTank(double amountOfFuelInTank) {
		this.amountOfFuelInTank = amountOfFuelInTank;
	}

	public double getConsumptionPer100() {
		return consumptionPer100;
	}

	public void setConsumptionPer100(double consumptionPer100) {
		this.consumptionPer100 = consumptionPer100;
	}

	public String getTypeEngene() {
		return typeEngene;
	}

	public void setTypeEngene(String typeEngene) {
		this.typeEngene = typeEngene;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amountOfFuelInTank);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(consumptionPer100);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(fuelTankCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((typeEngene == null) ? 0 : typeEngene.hashCode());
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
		Engine other = (Engine) obj;
		if (Double.doubleToLongBits(amountOfFuelInTank) != Double.doubleToLongBits(other.amountOfFuelInTank))
			return false;
		if (Double.doubleToLongBits(consumptionPer100) != Double.doubleToLongBits(other.consumptionPer100))
			return false;
		if (Double.doubleToLongBits(fuelTankCapacity) != Double.doubleToLongBits(other.fuelTankCapacity))
			return false;
		if (typeEngene == null) {
			if (other.typeEngene != null)
				return false;
		} else if (!typeEngene.equals(other.typeEngene))
			return false;
		return true;
	}

	
}
