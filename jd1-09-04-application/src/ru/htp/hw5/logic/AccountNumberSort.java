package ru.htp.hw5.logic;

import java.util.Comparator;
import ru.htp.hw5.entity.Account;

public class AccountNumberSort implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		return o1.getNumber().compareTo(o2.getNumber());
	}
}
