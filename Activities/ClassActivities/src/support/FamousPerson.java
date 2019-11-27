//----------------------------------------------------------------------
// FamousPerson.java         by Dale/Joyce/Weems             Chapter 5,6
//
// Supports famous people objects having a first name, last name, a year
// of birth and a short tidbit of factual information.
//----------------------------------------------------------------------
package support;

import java.util.Comparator;

public class FamousPerson implements Comparable<FamousPerson>
{
  protected String firstName, lastName, fact;
  protected int yearOfBirth;    

  public FamousPerson(String first, String last, int yob, String f)
  {
    firstName = first;  lastName = last; fact = f; yearOfBirth = yob;
  }

  public String getFirstName() {return firstName ;}
  public String getLastName() {return lastName;}
  public String getFact() {return fact;}
  public int getYearOfBirth() {return yearOfBirth;}

//  @Override 
//  public boolean equals(Object obj)
//  // Returns true if 'obj' is a FamousPerson with same first and last 
//  // names as this FamousPerson, otherwise returns false.
//  {
//     if (obj == this)
//        return true;
//     else 
//     if (obj == null || obj.getClass() != this.getClass())
//        return false;
//     else
//     {
//        FamousPerson fp = (FamousPerson) obj; 
//        return (this.firstName.equals(fp.firstName) &&
//                this.lastName.equals(fp.lastName)); 
//     }
//  }
  
  
  
  public int compareTo(FamousPerson other)
  // Precondition: 'other' is not null
  //
  // Compares this FamousPerson with 'other' for order. Returns a 
  // negative integer, zero, or a positive integer as this object 
  // is less than, equal to, or greater than 'other'.
  {
    if (!this.lastName.equals(other.lastName))
      return this.lastName.compareTo(other.lastName);
    else
      return this.firstName.compareTo(other.firstName);
  }

  @Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
	result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
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
	FamousPerson other = (FamousPerson) obj;
	if (firstName == null) {
		if (other.firstName != null)
			return false;
	} else if (!firstName.equals(other.firstName))
		return false;
	if (lastName == null) {
		if (other.lastName != null)
			return false;
	} else if (!lastName.equals(other.lastName))
		return false;
	return true;
}

@Override
  public String toString()
  {
    return (firstName + " " + lastName + "(Born " + yearOfBirth +
            "): " + fact);
  }
  
  public static Comparator<FamousPerson> yearOfBirthComparator()
  {
    return new Comparator<FamousPerson>()
    {
       public int compare(FamousPerson element1, FamousPerson element2)
       {
         return (element1.yearOfBirth - element2.yearOfBirth);
       }
    };
  }

}
 