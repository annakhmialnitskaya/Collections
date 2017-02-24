package by.htp.linkedList.runner;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import by.htp.linkedList.bean.Student;

public class Main {

	public static void main(String[] args) {

		List<Student> list = createStudent();
		printListStudents(list);

		deleteMenStudents(list);
		printListStudents(list);

		printInfoEverySecondWomen(list);
	}

	private static List<Student> createStudent() {
		List<Student> list = new LinkedList<Student>();
		list.add(new Student("Вася", "10/10/1990", 1, "экономический", "мужской"));
		list.add(new Student("Петя", "10/10/1990", 1, "экономический", "мужской"));
		list.add(new Student("Коля", "10/10/1998", 1, "экономический", "мужской"));
		list.add(new Student("Катя", "09/20/1997", 1, "экономический", "женский"));
		list.add(new Student("Таня", "10/13/1999", 1, "экономический", "женский"));
		list.add(new Student("Юра", "03/30/1996", 1, "экономический", "мужской"));
		list.add(new Student("Галя", "07/15/1980", 1, "экономический", "женский"));
		list.add(new Student("Зина", "04/12/1995", 1, "экономический", "женский"));
		list.add(new Student("Ваня", "02/18/1993", 1, "экономический", "мужской"));
		list.add(new Student("Маша", "08/18/1998", 1, "экономический", "женский"));
		list.add(new Student("Саша", "10/10/1989", 1, "экономический", "мужской"));
		list.add(new Student("Женя", "10/11/1998", 1, "экономический", "женский"));
		return list;
	}

	private static void printListStudents(List<Student> list) {
		System.out.println("List of students: ");
		for (Student student : list) {
			System.out.println(student);
		}
	}

	private static void deleteMenStudents(List<Student> list) {
		ListIterator<Student> iter = list.listIterator();
		while (iter.hasNext()) {
			Student student = iter.next();
			if (student.getGender().equals("мужской")) {
				iter.remove();
			}
		}
	}

	private static void printInfoEverySecondWomen(List<Student> list) {
		int i = 1;
		System.out.println("List of students: ");
		ListIterator<Student> iter = list.listIterator();
		while (iter.hasNext()) {
			Student student = iter.next();
			if (i % 2 == 0) {
				System.out.println(student);
			}
			i++;
		}
	}
}
