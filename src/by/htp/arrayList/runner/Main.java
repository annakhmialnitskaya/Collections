package by.htp.arrayList.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.htp.arrayList.bean.Student;

public class Main {
	public static void main(String[] args) {
		List<Student> list = fillData();
		Collections.sort(list);
		for (Student student : list) {
			System.out.println(student);
		}
	}

	private static List<Student> fillData() {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Vasya", "10/10/1998", 1, 2, "male"));
		list.add(new Student("Vasya1", "09/20/1997", 1, 2, "male"));
		list.add(new Student("Vasya2", "10/13/1999", 1, 2, "male"));
		list.add(new Student("Vasya3", "03/30/1996", 1, 2, "male"));
		list.add(new Student("Vasya4", "07/15/1980", 1, 2, "male"));
		list.add(new Student("Vasya5", "04/12/1995", 1, 2, "male"));
		list.add(new Student("Vasya6", "02/18/1993", 1, 2, "male"));
		list.add(new Student("Vasya7", "08/18/1998", 1, 2, "male"));
		list.add(new Student("Vasya8", "10/10/1989", 1, 2, "male"));
		list.add(new Student("Vasya9", "10/11/1998", 1, 2, "male"));
		list.add(new Student("Vasya10", "11/16/1999", 1, 2, "male"));
		list.add(new Student("Vasya11", "05/19/1992", 1, 2, "male"));
		return list;
	}

}
