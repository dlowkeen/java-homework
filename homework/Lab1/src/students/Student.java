package students;

import java.time.LocalDate;

public class Student {
	private final int studentNumber;
	private final String firstName;
	private final String surname;
	private final LocalDate dob;
	
	public Student (int studentNumber, String firstName, String surname, LocalDate dob) {
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.surname = surname;
		this.dob = dob;
	}
	
	public int getStudentId() {
		return this.studentNumber;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public LocalDate getDob() {
		return this.dob;
	}
	
	public String toString() {
		return "Student -> Name = " + this.firstName + ", Surname = " + this.surname + ", Date of Birth " + this.dob + ", Student ID = " + this.studentNumber;
	}
	
	public boolean equals(Student compare) {
		if (studentNumber == compare.getStudentId() && firstName == compare.getFirstName() && surname == compare.getSurname() && dob == this.getDob()) {
			return true;
		} else {
			return false;
		}
	}
}
