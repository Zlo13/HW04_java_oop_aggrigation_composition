package ru.htp.hw5.main;

import java.util.Collections;

import ru.htp.hw5.entity.Account;
import ru.htp.hw5.entity.Client;
import ru.htp.hw5.logic.AccountBalanceSort;
import ru.htp.hw5.logic.AccountNumberSort;
import ru.htp.hw5.logic.AccountStatusSort;
import ru.htp.hw5.logic.ClientLogic;
import ru.htp.hw5.view.Print;

public class Main {

//	4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета. 
//	Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, 
//	имеющим положительный и отрицательный балансы отдельно.

	public static void main(String[] args) {

		Client client1 = new Client("Vasya", "Pupkin");
		client1.setAcconts(new Account("1250 2570 2575", true, -5000));
		client1.setAcconts(new Account("1250 2570 2592", 325000));
		client1.setAcconts(new Account("1250 2570 2580", 125000));
		client1.setAcconts(new Account("1250 2560 2593", true, -125));

		ClientLogic clientLogic = new ClientLogic();
		Print print = new Print();

		Collections.sort(client1.getAcconts(), new AccountStatusSort().thenComparing(new AccountNumberSort()));
		print.printAccounts(client1);

		Collections.sort(client1.getAcconts(), new AccountStatusSort().thenComparing(new AccountBalanceSort()));
		print.printAccounts(client1);

		print.printBalance(clientLogic.amountPositiveBalance(client1));
		print.printBalance(clientLogic.amountNegativeBalance(client1));
		print.printBalance(clientLogic.amountTotalBalance(client1));

	}

}
