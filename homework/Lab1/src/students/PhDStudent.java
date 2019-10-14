package students;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PhDStudent extends Student {
	
	private LocalDate defenceDate;
	private LocalDate enrollmentDate;
	private int phdDurationYears;

	public PhDStudent(int studentNumber, String firstName, String surname, LocalDate dob, LocalDate enrollmentDate, int phdDurationYears) {
		super(studentNumber, firstName, surname, dob);
		// TODO Auto-generated constructor stub
		
		this.enrollmentDate = LocalDate.now();
		this.phdDurationYears = phdDurationYears;
	}
	
	public boolean scheduleDefence(LocalDate proposedDate) {
		if (proposedDate.isAfter(enrollmentDate.plusYears(phdDurationYears))) {
			this.defenceDate = proposedDate;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean scheduleDefence2(LocalDate proposedDate) {
		long years = ChronoUnit.YEARS.between(this.enrollmentDate , proposedDate);
		if (years >= phdDurationYears) {
			this.defenceDate = proposedDate;
			return true;
		} else {
			return false;
		}
	}
	
    public String toOldSchoolString() 
    { 
        return (super.toString() + ", enrollmentDate = " + this.enrollmentDate + ", defenceDate = " + this.defenceDate); 
    } 
	
	@Override
	public String toString()
	{
    	return "PhD Student -$>$ Name = " + this.getFirstName() + ", Surname = " + this.getSurname() + ", Date of Birth = " + this.getDob() + ", Student ID = " + this.getStudentId();
	}
	
}
