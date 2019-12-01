package ru.htp.hw5.logic;

import java.util.Comparator;

import ru.htp.hw5.entity.Account;

public class AccountBalanceSort implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		if (o1.getBalance() > o2.getBalance()) {
			return 1;
		} else if (o1.getBalance() < o2.getBalance()) {
			return -1;
		} else {
			return 0;
		}
	}
}
