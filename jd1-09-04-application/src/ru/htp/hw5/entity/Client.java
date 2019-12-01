package ru.htp.hw5.entity;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private String name;
	private String surname;
	private List<Account> acconts;

	public Client(String name, String surname) {
		this.name = name;
		this.surname = surname;
		this.acconts = new ArrayList<>();
	}

	public Client(String name, String surname, List<Account> acconts) {
		this.name = name;
		this.surname = surname;
		this.acconts = acconts;
	}

	@Override
	public String toString() {
		return "Клиент банка -- " + name + " " + surname + "\n" + acconts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List<Account> getAcconts() {
		return acconts;
	}

	public void setAcconts(List<Account> acconts) {
		this.acconts = acconts;
	}

	public void setAcconts(Account acconts) {
		this.acconts.add(acconts);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acconts == null) ? 0 : acconts.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Client other = (Client) obj;
		if (acconts == null) {
			if (other.acconts != null)
				return false;
		} else if (!acconts.equals(other.acconts))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

}
