//---------------------------------------------------------------------------
// CSPeople.java            by Dale/Joyce/Weems                     Chapter 6
//
// Reads information about famous computer scientists from the file 
// input/FamousCS.txt. Allows user to indicate if they wish to see the list 
// sorted by name or by year of birth.
//---------------------------------------------------------------------------
package app;

import java.io.*;
import java.util.*;
import lists.*;
import person.*;

public class CSPeople
{
  public static void main(String[] args) throws IOException 
  {
    // Get user's display preference
    Scanner scan = new Scanner(System.in);
    int choice;
    System.out.println("  1: Sorted by last name? \n  2: Sorted by year of birth? \n  3: Sorted by first name \n  4: Sorted by fact descending order");
    System.out.print("\nHow would you like to see the information > ");
    choice = scan.nextInt();
    
    // Instantiate sorted list
    SortedABList<FamousPerson> people;
    if (choice == 1)
      people = new SortedABList<FamousPerson>(); // defaults to natural order
    else if (choice == 2)
      people = new SortedABList<FamousPerson>(FamousPerson.yearOfBirthComparator());
    else if (choice == 3)
      people = new SortedABList<FamousPerson>(FamousPerson.firstNameComparator());
    else 
      people = new SortedABList<FamousPerson>(new Comparator<FamousPerson>() {
		@Override
		public int compare(FamousPerson o1, FamousPerson o2) {
			return o2.getFact().compareTo(o1.getFact()); // DECREASING ORDER
		}
      });
    
    // Set up file reading
    String filePath = new File("").getAbsolutePath();
    FileReader fin = new FileReader(filePath + "/src/famousPeople.txt");
    Scanner info = new Scanner(fin);
    info.useDelimiter("[,\\n]");  // delimiters are commas, line feeds
    FamousPerson person;
    String fname, lname, fact;
    int year;

    // Read the info from the file and add it to the list
    while (info.hasNext())      
    {
      fname = info.next();   lname = info.next();
      year = info.nextInt(); fact = info.next();
      person = new FamousPerson(fname, lname, year, fact);
      people.add(person);
    }
    
    // Display the list, using the advanced for loop
    System.out.println();
    for (FamousPerson fp: people)
       System.out.println(fp);
    info.close();
    
  } 
} 