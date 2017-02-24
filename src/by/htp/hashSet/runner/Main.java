package by.htp.hashSet.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.htp.hashSet.bean.Book;

public class Main {

	public static void main(String[] args) {

		Set<Book> bookSet = createBookSet();
		printBookCollection(bookSet);

		printBooksContainsJavaTitle(bookSet);

		List<Book> sortedList = new ArrayList<>(bookSet);
		Collections.sort(sortedList);
		printBookCollection(sortedList);

	}

	private static Set<Book> createBookSet() {
		Set<Book> bookSet = new HashSet<Book>();
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

	private static void printBookCollection(Collection<Book> books) {
		System.out.println("Collection of books:");
		Iterator<Book> itr = books.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
	}

	private static void printBooksContainsJavaTitle(Set<Book> bookSet) {
		System.out.println("Set of books: ");
		Iterator<Book> iter = bookSet.iterator();
		while (iter.hasNext()) {
			Book book = iter.next();
			if (isTitleContainsWord(book.getTitle())) {
				System.out.println(book);
			}
		}
	}

	private static boolean isTitleContainsWord(String title) {
		String patternString = ".*[Java].*";
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(title);
		return matcher.matches();
	}
}
