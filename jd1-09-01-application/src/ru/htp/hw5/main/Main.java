package ru.htp.hw5.main;

import java.util.ArrayList;
import ru.htp.hw5.entity.Sentence;
import ru.htp.hw5.entity.Text;
import ru.htp.hw5.view.View;

//1. Создать объект класса Текст, используя классы Предложение, Слово. 
//Методы: дополнить текст, вывести на консоль текст, заголовок текста. 

public class Main {

	public static void main(String[] args) {
		
		View print = new View();

		Sentence header = new Sentence(new ArrayList<>());
		header.addSentence("Заголовок");
		header.addSentence(" текста");

		Sentence sentence1 = new Sentence(new ArrayList<>());
		sentence1.addSentence("Создать ");
		sentence1.addSentence("объект ");
		sentence1.addSentence("класса ");
		sentence1.addSentence("Текст, ");

		Sentence sentence2 = new Sentence(new ArrayList<>());
		sentence2.addSentence("используя ");
		sentence2.addSentence("классы ");
		sentence2.addSentence("Предложение, ");
		sentence2.addSentence("Слово. ");
		
		Text text = new Text(new ArrayList<>());
		text.addText(header.getSentence());
		text.addText(sentence1.getSentence());
		text.addText(sentence2.getSentence());
		
		
		print.printText(text.getContent());

	}

}
