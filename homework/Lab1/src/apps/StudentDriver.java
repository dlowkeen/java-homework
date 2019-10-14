package apps;

import java.time.LocalDate;

import management.*;
import records.*;
import students.*;

public class StudentDriver {
	public static void main(String[] args) {
		
		System.out.println("REGULAR STUDENT #1");
		Student a = new Student(1, "Amy", "Smith", LocalDate.of(1990, 1, 1));
		System.out.println(a.toString());
		
		System.out.println("\nREGULAR STUDENT #2");
		Student b = new Student(2, "Bob", "Jones", LocalDate.of(1990, 2, 2));
		System.out.println(b.toString());
		
		System.out.println("\nUNDERGRAD STUDENT");
		UndergraduateStudent c = new UndergraduateStudent(3, "Jane", "Doe", LocalDate.of(1990, 3, 3));
		c.chooseMajor("Computer Science");		
		System.out.println(c.toOldSchoolString()); // NOT NEEDED
		System.out.println(c.toString());
		
		System.out.println("\nPHD STUDENT");
		PhDStudent d = new PhDStudent(4, "Sam", "Test", LocalDate.of(1980, 4, 4), LocalDate.now(), 7);
		System.out.println(d.scheduleDefence(LocalDate.of(2020, 6, 6))); // this should return false
		d.scheduleDefence(LocalDate.of(2030, 6, 6));
		System.out.println(d.toOldSchoolString());
		System.out.println(d.toString());
		
		System.out.println("\nGIVING OUT GRADES");
		StudentRecord rec1 = new StudentRecord(a, 92);
		System.out.println(rec1.getStudent());
		System.out.println(rec1.getGrade());
		
		Course math2A = new Course(2);
		math2A.enroll(a);
		math2A.enroll(b);
		math2A.enroll(c);
		math2A.drop(a);
		System.out.println(math2A.displayStudents());
		
	}
}
