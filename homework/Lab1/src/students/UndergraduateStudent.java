package students;

import java.time.LocalDate;

public class UndergraduateStudent extends Student{
	
	private String major;

	public UndergraduateStudent(int studentNumber, String firstName, String surname, LocalDate dob) {
		super(studentNumber, firstName, surname, dob);
		// TODO Auto-generated constructor stub
	}
	
    public String toOldSchoolString() 
    { 
		//Undergrad Student -$>$ Name = A, Surname = B, Date of Birth = 01/01/1990, Student ID = 1
        return (super.toString() + ", major = " + this.major); 
    } 
    
    @Override
    public String toString()
    {
    	return "Undergrad Student -$>$ Name = " + this.getFirstName() + ", Surname = " + this.getSurname() + ", Date of Birth = " + this.getDob() + ", Student ID = " + this.getStudentId();
    }
	
	public void chooseMajor(String major) {
		this.major = major;
	}

}
