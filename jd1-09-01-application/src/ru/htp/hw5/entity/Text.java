package ru.htp.hw5.entity;

//1. Создать объект класса Текст, используя классы Предложение, Слово. 
//Методы: дополнить текст, вывести на консоль текст, заголовок текста. 

import java.util.List;

public class Text {

	private List<Sentence> content;

	public Text(List<Sentence> content) {
		this.content = content;
	}

	public void addText(List<Word> sentence) {
		content.add(new Sentence(sentence));
	}
	

	public List<Sentence> getContent() {
		return content;
	}

	public void setContent(List<Sentence> content) {
		this.content = content;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
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
		Text other = (Text) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		return true;
	}

}
