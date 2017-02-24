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
