package ru.htp.hw5.entity;

import java.util.List;

//1. Создать объект класса Текст, используя классы Предложение, Слово. 
//Методы: дополнить текст, вывести на консоль текст, заголовок текста. 

public class Sentence {

	private List<Word> sentence;

	public Sentence(List<Word> sentence) {
		this.sentence = sentence;
	}

	public void addSentence(String word) {
		sentence.add(new Word(word));
	}
	
	

	@Override
	public String toString() {
		return sentence + "\n";
	}

	public List<Word> getSentence() {
		return sentence;
	}

	public void setSentence(List<Word> sentence) {
		this.sentence = sentence;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sentence == null) ? 0 : sentence.hashCode());
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
		Sentence other = (Sentence) obj;
		if (sentence == null) {
			if (other.sentence != null)
				return false;
		} else if (!sentence.equals(other.sentence))
			return false;
		return true;
	}
	

}
