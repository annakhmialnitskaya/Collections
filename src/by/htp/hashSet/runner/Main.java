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
		bookSet.add(new Book("��������", "������� ����� �������"));
		bookSet.add(new Book("1984", "������ ������"));
		bookSet.add(new Book("������ � ���������", "������ ����������� ��������"));
		bookSet.add(new Book("Java.���������� ����", "��� �������"));
		bookSet.add(new Book("��� ��������", "���� ����� ������"));
		bookSet.add(new Book("������� ������� ����", "����� ������"));
		bookSet.add(new Book("���� �� �����������", "��� ��������"));
		bookSet.add(new Book("���������� ����", "��� �������"));
		bookSet.add(new Book("����� ��� ����������", "������ ���"));
		bookSet.add(new Book("����� ������������ Java.", "������ ��"));
		bookSet.add(new Book("��� ��������� �� ���", "������ �. ���������"));
		bookSet.add(new Book("��������� �����", "������ �� ����-��������"));
		bookSet.add(new Book("Java.��� ��� �����������", "�������� ������ ������"));
		bookSet.add(new Book("���������� ����", "��� �������"));
		bookSet.add(new Book("���� ��������", "��� �������"));
		bookSet.add(new Book("���� ����", "������� ����� �������"));
		bookSet.add(new Book("������ ��������� �����", "��� ����"));
		bookSet.add(new Book("���������� ����", "��� �������"));
		bookSet.add(new Book("������������ � ���������", "����� ���������� �����������"));
		bookSet.add(new Book("���������", "���� �����"));
		bookSet.add(new Book("��� ���� ������� Java.", "������ �������"));
		bookSet.add(new Book("���������� ����", "��� �������"));
		bookSet.add(new Book("���������� �������", "������� ������ � ��."));
		bookSet.add(new Book("���� �����-������", "��������� ����"));
		bookSet.add(new Book("���������� ����", "��� �������"));
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
