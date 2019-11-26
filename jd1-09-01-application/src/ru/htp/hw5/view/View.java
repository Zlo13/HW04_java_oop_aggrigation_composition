package ru.htp.hw5.view;

import java.util.List;

import ru.htp.hw5.entity.Sentence;
import ru.htp.hw5.entity.Word;

public class View {

	public void print(List<Word> list) {
		for (Word x : list) {
			System.out.print(x);
		}
	}
	public void printText(List<Sentence> list) {
		for (Sentence x : list) {
			System.out.print(x);
		}
	}

}
