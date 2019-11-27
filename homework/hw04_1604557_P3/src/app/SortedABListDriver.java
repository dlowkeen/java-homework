package app;

import list.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class SortedABListDriver 
{
  public static void main(String[] args) throws FileNotFoundException
  {
	// Instantiate sorted list
    SortedABList<String> strings = new SortedABList<String>(); // defaults to natural order

    // Set up file reading
    String filePath = new File("").getAbsolutePath();
    FileReader fin = new FileReader(filePath + "/src/strings.txt");
    Scanner info = new Scanner(fin);
    info.useDelimiter("[,\\n]");
    String sentence;

    // Read the info from the file and add it to the list
    while (info.hasNext())      
    {
      sentence = info.next();
      String words = new String(sentence);
      strings.add(words);
    }
    
    // Display the list, using the advanced for loop
    System.out.println();
    for (String str: strings)
       System.out.println(str);
    info.close();
  }
}