package ru.htp.hw5.logic;

import ru.htp.hw5.entity.Account;
import ru.htp.hw5.entity.Client;

public class ClientLogic {

	public double amountPositiveBalance(Client client) {
		double sum = 0;
		for (Account x : client.getAcconts()) {
			if (x.getBalance() > 0) {
				sum = sum + x.getBalance();
			}
		}
		return sum;
	}

	public double amountNegativeBalance(Client client) {
		double sum = 0;
		for (Account x : client.getAcconts()) {
			if (x.getBalance() < 0) {
				sum = sum + x.getBalance();
			}
		}
		return sum;
	}

	public double amountTotalBalance(Client client) {
		double sum = 0;
		for (Account x : client.getAcconts()) {
			sum = sum + x.getBalance();
		}
		return sum;
	}

}
