package management;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import records.*;
import students.*;

public class Course implements CourseManagementInterface {

	private ArrayList<StudentRecord> enrolledStudents;
	private Queue<StudentRecord> waitList;
	private int capacity;
	private int maxCapacity;
	
	public Course(int maxCapacity) {
		this.maxCapacity = maxCapacity;
		this.waitList = new LinkedList<StudentRecord>();
		this.enrolledStudents = new ArrayList<StudentRecord>();
		this.capacity = 0;
	}
	
	@Override
	public boolean enroll(Student st) {
		StudentRecord newStudent = new StudentRecord(st, 0);
		if (this.capacity < this.maxCapacity) {
			capacity++;
			System.out.println("Added Student");
			enrolledStudents.add(newStudent);
			return true;
		} else {
			System.out.println("Class is full - Added to waitlist");
			waitList.add(newStudent);
			return false;
		}
	}

	@Override
	public boolean drop(Student st) {
		if (this.capacity > 0) {
			capacity--;
			int indexOfRemovedStudent = findStudent(st);
			if (indexOfRemovedStudent == -1) {
				System.out.println("Student not found");
				return false;
			}
			this.enrolledStudents.remove(indexOfRemovedStudent);
			if (waitList.size() > 0) {
				StudentRecord newStudent = this.waitList.remove();
				this.enrolledStudents.add(newStudent);
				capacity++;
			}
			return true;			
		} else {
			return false;
		}
	}

	@Override
	public double calculateClassAverage() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String displayStudents() {
		String result = "Students In Class: ";
		for (int i = 0; i < enrolledStudents.size(); i++) {
			result += enrolledStudents.get(i).getStudent().getFirstName() + " ";
		}
		return result;
	}
	
	private int findStudent(Student st) {
		int index = -1;
		for (int i = 0; i < enrolledStudents.size(); i++) {
			if (enrolledStudents.get(i).getStudent().equals(st)) {
				index = i;
			}
		}
		return index;
	}
	
}
