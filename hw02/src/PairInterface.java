package hw02;

//(4 points) Define a Java interface named PairInterface. A class that
//implements this interface allows creation of an object that holds a
//“pair” of objects of a specified type — these are referred to as the
//“first” object and the “second” object of the pair. We assume that
//classes implementing PairInterface provide constructors that accept
//as arguments the values of the pair of objects. The PairInterface
//interface should require both setters and getters for the first and second objects. 
//The actual type of the objects in the pair is specified
//when the PairInterface object is instantiated. Therefore, both the
//PairInterface interface and the classes that implement it should be
//generic. Suppose a class named BasicPair implements the PairInterface interface. 
//A simple sample application that uses BasicPair is
//shown here. Its output would be ”apple orange.”

public interface PairInterface {

	private Object first;
	private Object second;
}
