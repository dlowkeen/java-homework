package records;

import students.*;

public class StudentRecord {

	private Student student;
	private int grade;
	
	public StudentRecord(Student student, int grade) {
		this.student = student;
		this.grade = grade;
	}
	
	public Student getStudent() {
		return this.student;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
	public boolean equals(Student compare) {
		if (this.student.equals(compare)) {
			return true;
		} else {
			return false;
		}
	}
}
