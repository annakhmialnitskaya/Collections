package by.htp.linkedList.bean;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Comparable<Student> {

	private String name;
	private Date dateBirth;
	private int course;
	private String faculty;
	private String gender;
	public static final DateFormat DATE_FORMATTER = new SimpleDateFormat("MM/dd/yyyy");

	public Student(String name, String dateBirthStr, int course, String faculty, String gender) {
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

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + course;
		result = prime * result + ((dateBirth == null) ? 0 : dateBirth.hashCode());
		result = prime * result + ((faculty == null) ? 0 : faculty.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Student other = (Student) obj;
		if (course != other.course)
			return false;
		if (dateBirth == null) {
			if (other.dateBirth != null)
				return false;
		} else if (!dateBirth.equals(other.dateBirth))
			return false;
		if (faculty == null) {
			if (other.faculty != null)
				return false;
		} else if (!faculty.equals(other.faculty))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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
