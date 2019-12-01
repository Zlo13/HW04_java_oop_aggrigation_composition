package ru.htp.hw5.view;

import ru.htp.hw5.entity.Account;
import ru.htp.hw5.entity.Client;

public class Print {

	public void printBalance(double x) {
		System.out.println("Баланс по счету = " + x);
	}

	public void printAccounts(Client client) {

		System.out.println("Клиент банка -- " + client.getName() + " " + client.getSurname() + "\n");
		for (Account x : client.getAcconts()) {
			System.out.println(x);

		}

	}

}
