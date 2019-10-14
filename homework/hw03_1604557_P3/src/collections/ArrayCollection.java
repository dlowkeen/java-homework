//---------------------------------------------------------------------------
// ArrayCollection.java          by Dale/Joyce/Weems                Chapter 5
//
// Implements the CollectionInterface using an array.
//
// Null elements are not allowed. Duplicate elements are allowed.
//
// Two constructors are provided: one that creates a collection of a default
// capacity, and one that allows the calling program to specify the capacity.
//---------------------------------------------------------------------------
package collections;

public class ArrayCollection<T> implements CollectionInterface<T>  
{
  protected final int DEFCAP = 100; // default capacity
  protected T[] elements;           // array to hold collection�s elements
  protected int numElements = 0;    // number of elements in this collection

  // set by find method
  protected boolean found;  // true if target found, otherwise false
  protected int location;   // indicates location of target if found

  public ArrayCollection() 
  {
    elements = (T[]) new Object[DEFCAP];
  }

  public ArrayCollection(int capacity) 
  {
    elements = (T[]) new Object[capacity];
  }

  protected void find(T target)
  // Searches elements for an occurrence of an element e such that
  // e.equals(target). If successful, sets instance variables
  // found to true and location to the array index of e. If
  // not successful, sets found to false.
  {
    location = 0;
    found = false;

    while (location < numElements) 
    {
      if (elements[location].equals(target))
      {  
        found = true;
        return;
      }
      else
        location++;
    }
  }

  public boolean add(T element)
  // Attempts to add element to this collection.
  // Returns true if successful, false otherwise.
  {
    if (isFull())
      return false;
    else
    {
      elements[numElements] = element;
      numElements++;
      return true;
    }
  }

  public boolean remove (T target)
  // Removes an element e from this collection such that e.equals(target)
  // and returns true; if no such element exists, returns false.
  {
    find(target);    
    if (found)
    {
      elements[location] = elements[numElements - 1];
      elements[numElements - 1] = null;
      numElements--;  
    }
    return found;
  }
  
  public boolean contains (T target)
  // Returns true if this collection contains an element e such that 
  // e.equals(target); otherwise, returns false.
  {
    find(target);
    return found;
  }

  public T get(T target)
  // Returns an element e from this collection such that e.equals(target);
  // if no such element exists, returns null.
  {
    find(target);    
    if (found)
      return elements[location];
    else
      return null;
  }
  
  public boolean isFull()
  // Returns true if this collection is full; otherwise, returns false.
  {
    return (numElements == elements.length);
  }

  public boolean isEmpty()
  // Returns true if this collection is empty; otherwise, returns false.
  {
    return (numElements == 0);  
  }

  public int size()
  // Returns the number of elements in this collection. 
  {
    return numElements;
  }

  public String toString() {
	  String result = "";
	  for (int i = 0; i < numElements; i++) {
		  result += elements[i].toString() + " ";
	  }
	  return result;
  }
  
  public int count(T target) {
	  int count = 0;
	  for (int i = 0; i < numElements; i++) {
		  if (elements[i].equals(target)) {
			  count ++;
		  }
	  }
	  return count;
  }
  
  public void removeAll(T target) {
	  System.out.println("Removing " + target + " from collection");
	  for (int i = 0; i < numElements; i++) {
		  if (elements[i].equals(target)) {
			  elements[i] = elements[numElements - 1];
		      elements[numElements - 1] = null;
		      numElements--; 
		      i--; // decrement i because we want to check this spot again after we just reassigned its value
		  }
	  }
  }
  
//  (9 points) ArrayCollection<T> combine(ArrayCollection<T> other)
//  creates and returns a new ArrayCollection object that is a combination of this object and the argument object. 
//  Choose any way to
//  combine these collections and make sure you include comments to
//  explain what the combination is. (Note: add the signature of
//  this method to CollectionInterface
  public ArrayCollection<T> combine(ArrayCollection<T> other) {
// NOTE: I was originally going to do this but saw that we need to return a NEW ArrayCollection
//	  for (int i = 0; i < other.numElements; i++) {
//		  T temp = other.elements[i];
//		  this.add(temp);
//	  }
//	  return this;
	  ArrayCollection<T> result = new ArrayCollection<T>();
	  for (int i = 0; i < this.numElements; i++) {
		  T temp = this.elements[i];
		  result.add(temp);
	  }
	  for (int i = 0; i < other.numElements; i++) {
		  T temp = other.elements[i];
		  result.add(temp);
	  }
	  return result;
  }
  
}
