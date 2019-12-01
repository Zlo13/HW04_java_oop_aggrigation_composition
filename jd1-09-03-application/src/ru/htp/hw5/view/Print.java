package ru.htp.hw5.view;

import ru.htp.hw5.entity.District;
import ru.htp.hw5.entity.State;
import ru.htp.hw5.logic.ContryLogic;

public class Print {

	public void printStateName(State x, ContryLogic z, ContryLogic c) {

		System.out.println(x.getNameState() + " площадью " + z.findeSquareCitysState(x) + "кв.м. "
				+ ", количество облостей в государстве = " + c.numberRegions(x) + " шт.");

	}

	public void printCityCentr(District z, ContryLogic x) {

		System.out.print(x.findeCityCentr(z) + " ");

	}

}
