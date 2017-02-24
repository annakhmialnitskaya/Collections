package by.htp.treeSet.runner;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import by.htp.hashSet.bean.Book;

public class Main {

	public static void main(String[] args) {

		Set<Book> bookSet = createBookSet();
		printBooksSet(bookSet);

		printInfoEveryFirstBook(bookSet);

		deleteEverySecondBook(bookSet);
		printBooksSet(bookSet);

	}

	private static Set<Book> createBookSet() {
		Set<Book> bookSet = new TreeSet<Book>();
		bookSet.add(new Book("Шантарам", "Грегори Дэвид Робертс"));
		bookSet.add(new Book("1984", "Джордж Оруэлл"));
		bookSet.add(new Book("Мастер и Маргарита", "Михаил Афанасьевич Булгаков"));
		bookSet.add(new Book("Java.Бойцовский клуб", "Чак Паланик"));
		bookSet.add(new Book("Три товарища", "Эрих Мария Ремарк"));
		bookSet.add(new Book("Портрет Дориана Грея", "Оскар Уайльд"));
		bookSet.add(new Book("Вино из одуванчиков", "Рей Брэдбери"));
		bookSet.add(new Book("Бойцовский клуб", "Чак Паланик"));
		bookSet.add(new Book("Цветы для Элджернона", "Даниел Киз"));
		bookSet.add(new Book("Убить пересмешника Java.", "Харпер Ли"));
		bookSet.add(new Book("Над пропастью во ржи", "Джером Д. Сэлинджер"));
		bookSet.add(new Book("Маленький принц", "Антуан де Сент-Экзюпери"));
		bookSet.add(new Book("Java.Сто лет одиночества", "Габриэль Гарсиа Маркес"));
		bookSet.add(new Book("Бойцовский клуб", "Чак Паланик"));
		bookSet.add(new Book("Анна Каренина", "Лев Толстой"));
		bookSet.add(new Book("Тень горы", "Грегори Дэвид Робертс"));
		bookSet.add(new Book("Атлант расправил плечи", "Айн Рэнд"));
		bookSet.add(new Book("Бойцовский клуб", "Чак Паланик"));
		bookSet.add(new Book("Преступление и наказание", "Федор Михайлович Достоевский"));
		bookSet.add(new Book("Марсианин", "Энди Вейер"));
		bookSet.add(new Book("Мне тебя обещали Java.", "Эльчин Сафарли"));
		bookSet.add(new Book("Бойцовский клуб", "Чак Паланик"));
		bookSet.add(new Book("Двенадцать стульев", "Евгений Петров и др."));
		bookSet.add(new Book("Граф Монте-Кристо", "Александр Дюма"));
		bookSet.add(new Book("Бойцовский клуб", "Чак Паланик"));
		return bookSet;
	}

	private static void printBooksSet(Set<Book> bookSet) {
		System.out.println("Set of books: ");
		for (Book book : bookSet) {
			System.out.println(book);
		}
	}

	private static void deleteEverySecondBook(Set<Book> bookSet) {
		int i = 1;
		Iterator<Book> iter = bookSet.iterator();
		while (iter.hasNext()) {
			iter.next();
			if (i % 2 != 0) {
				iter.remove();
			}
			i++;
		}
	}

	private static void printInfoEveryFirstBook(Set<Book> bookSet) {
		int i = 1;
		System.out.println("Every first books: ");
		for (Book book : bookSet) {
			if (i % 2 != 0) {
				System.out.println(book);
			}
			i++;
		}
	}
}
