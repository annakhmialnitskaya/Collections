package by.htp.arrayList.bean;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Comparable<Student> {
	private String name;
	private Date dateBirth;
	private int course;
	private int faculty;
	private String gender;
	public static final DateFormat DATE_FORMATTER = new SimpleDateFormat("MM/dd/yyyy");

	public Student(String name, String dateBirthStr, int course, int faculty, String gender) {
		super();
		this.name = name;
		this.dateBirth = convertStringToDate(dateBirthStr);
		this.course = course;
		this.faculty = faculty;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public int getFaculty() {
		return faculty;
	}

	public void setFaculty(int faculty) {
		this.faculty = faculty;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", dateBirth=" + DATE_FORMATTER.format(dateBirth) + ", course=" + course
				+ ", faculty=" + faculty + ", gender=" + gender + "]";
	}

	@Override
	public int compareTo(Student o) {
		return getDateBirth().compareTo(o.getDateBirth());
	}

	private static Date convertStringToDate(String strDate) {
		Date date = null;
		try {
			date = DATE_FORMATTER.parse(strDate);
		} catch (ParseException e) {
			System.out.println("Problem with data converting!");
		}
		return date;
	}
}
